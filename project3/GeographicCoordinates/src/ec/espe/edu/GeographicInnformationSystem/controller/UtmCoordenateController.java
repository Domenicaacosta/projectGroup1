/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.controller;

import Utils.FileManager;
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

    
}
