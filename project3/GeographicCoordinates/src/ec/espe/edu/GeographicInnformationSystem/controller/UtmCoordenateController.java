/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.controller;

import Utils.GeographicFileManager;
import Utils.UtmFileManager;
import ec.espe.edu.GeographicInnformationSystem.model.GeographicCoordenate;
import ec.espe.edu.GeographicInnformationSystem.model.UtmCoordenate;
import java.text.DecimalFormat;

/**
 *
 * @author Asus
 */
public class UtmCoordenateController {

    public void save(UtmCoordenate utmCoordenate) {
        float utmMeridian;
        float utmParalel;
        float utmMeridianCm;
        float utmParalelCm;
        String utmMeridianCoordenate;
        String utmParalelCoordenate;

        utmMeridian = utmCoordenate.getUtmMeridian();
        utmParalel = utmCoordenate.getUtmParalel();
        utmMeridianCm = utmCoordenate.getUtmMeridianCm();
        utmParalelCm = utmCoordenate.getUtmParalelCm();

        utmMeridianCoordenate = (utmMeridian + utmMeridianCm) + " X";
        utmParalelCoordenate = (utmParalel + utmParalelCm) + " Y";
        UtmFileManager.save("---UTM Coordenates---" + "\n" + utmMeridianCoordenate + "\n" + utmParalelCoordenate + "\n", "utmCoordenate");
    }

    public float calculateUtmMeridian(float meridian) {
        float utmMeridian;
        utmMeridian = (meridian * 1000);
        return utmMeridian;
    }

    public float calculateUtmParalel(float paralel) {
        float utmParalel;
        utmParalel = (paralel * 1000);
        return utmParalel;
    }

    public float calculateUtmMeridianCm(float meridianCm) {
        float utmMeridianCm;

        utmMeridianCm = (float) (meridianCm / 3.5);
        return utmMeridianCm;
    }

    public float calculateUtmParalelCm(float paralelCm) {
        float utmParalelCm;

        utmParalelCm = (float) (paralelCm / 3.1);
        return utmParalelCm;
    }

    public String read() {
        String data;
        data = UtmFileManager.read("UTMcoordenates.txt");
        return data;

    }

}
