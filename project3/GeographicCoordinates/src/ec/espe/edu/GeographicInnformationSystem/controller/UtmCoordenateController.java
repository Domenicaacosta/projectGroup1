/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.controller;

<<<<<<< HEAD
import Utils.GeographicFileManager;
=======
import Utils.FileManager;
>>>>>>> 27256439f7ab551093cb51b69cdc4f7bb87f6b56
import Utils.UtmFileManager;
import ec.espe.edu.GeographicInnformationSystem.model.GeographicCoordenate;
import ec.espe.edu.GeographicInnformationSystem.model.UtmCoordenate;
import java.text.DecimalFormat;

/**
 *
 * @author Asus
 */
public class UtmCoordenateController {
<<<<<<< HEAD

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

=======
    
    public void save(UtmCoordenate utmCoordenate) {
        String data = utmCoordenate.getUtmlatitude()+ ";" + utmCoordenate.getUtmlongitude();
        UtmFileManager.save(data, "coordenates");
    }
    private static void showUtmCoordenates(DecimalFormat df, float utmLongitude, float utmLatitude) {
        System.out.println("THE UTM COORDENATES ARE ");
        System.out.println(df.format(utmLongitude) + "m E ");
        System.out.println(df.format(utmLatitude) + "m S ");
    }

    private static double calculateUtmLatitude(float latitude) {
        float utmLatitude;
        utmLatitude = (latitude * 1000) / 3;
        return utmLatitude;
    }

    private static double calculateUtmLongitude(float longitude) {
        float utmLongitude;
        utmLongitude = (longitude * 1000) / 3;
        return utmLongitude;
    }
        public String read (){
        String data;
        data= UtmFileManager.read("coordenates.csv");
        return data;

}

    
>>>>>>> 27256439f7ab551093cb51b69cdc4f7bb87f6b56
}
