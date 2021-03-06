/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.controller;

import Utils.GeographicFileManager;
import ec.espe.edu.GeographicInnformationSystem.model.GeographicCoordenate;
import ec.espe.edu.GeographicInnformationSystem.model.UtmCoordenate;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

/**
 *
 * @author Domenica
 */
public class GeographicCoordenateController {
    public void save(GeographicCoordenate geographicCoordenate) {
        float longitude;
        float latitude;
        int longitudeGrade = 78;
        float minutesLongitude;
        float decimalPartLongitude;
        float wholePartLongitude;
        float secondsLongitude;
        float latitudeGrade = 0;
        float minutesLatitude;
        float decimalPartLatitude;
        float wholePartLatitude;
        float secondsLatitude;
        String dataLongitude;
        String dataLatitude;

        longitude = geographicCoordenate.getLongitude();
        minutesLongitude = calculateMinutesLongitude(longitude);
        decimalPartLongitude = calculateDecimalPartLongitude(minutesLongitude);
        wholePartLongitude = calculateWholePartLongitude(minutesLongitude, decimalPartLongitude);
        secondsLongitude = calculateSecondsLongitude(decimalPartLongitude);

        latitude = geographicCoordenate.getLatitude();
        minutesLatitude = calculateMinutesLatitude(latitude);
        decimalPartLatitude = calculateDecimalPartLatitude(minutesLatitude);
        wholePartLatitude = calculateWholaPartLatitude(minutesLatitude, decimalPartLatitude);
        secondsLatitude = calculateSecondsLatitude(decimalPartLatitude);
        dataLongitude = longitudeGrade + "° " + secondsLongitude + "' " + wholePartLongitude + "'' " + "O";
        dataLatitude = latitudeGrade + "° " + wholePartLatitude + "' " + secondsLatitude + "'' " + "S";
        GeographicFileManager.save("---Geographic Coordenates---" + "\n" + "Longitude: " + dataLongitude + "\n" + "Latitude: " + dataLatitude + "\n", "geographicCoordenate" );
    }

    public float calculateSecondsLatitude(float decimalPartLatitude) {
        float secondsLatitude;
        secondsLatitude = decimalPartLatitude * 60;
        return secondsLatitude;
    }

    public float calculateWholaPartLatitude(float minutesLatitude, float decimalPartLatitude) {
        float wholePartLatitude;
        wholePartLatitude = minutesLatitude - decimalPartLatitude;
        return wholePartLatitude;
    }

    public float calculateDecimalPartLatitude(float minutesLatitude) {
        float decimalPartLatitude;
        decimalPartLatitude = (minutesLatitude % 1);
        return decimalPartLatitude;
    }

    public float calculateMinutesLatitude(float latitude) {
        float minutesLatitude;
        minutesLatitude = (latitude * 5) / 33;
        return minutesLatitude;
    }

    public float calculateMinutesLongitude(float longitude) {
        float minutesLongitude;
        minutesLongitude = (float) ((longitude * 5) / 33.1);
        return minutesLongitude;
    }

    public float calculateDecimalPartLongitude(float minutesLongitude) {
        float decimalPartLongitude;
        decimalPartLongitude = (minutesLongitude % 1);
        return decimalPartLongitude;

    }

    public float calculateWholePartLongitude(float minutesLongitude, float decimalPartLongitude) {
        float wholePartLongitude;
        wholePartLongitude = minutesLongitude - decimalPartLongitude;
        return wholePartLongitude;
    }

    public float calculateSecondsLongitude(float decimalPartLongitude) {
        float secondsLongitude;
        secondsLongitude = decimalPartLongitude * 60;
        return secondsLongitude;
    }
   
        public String read (){
        String data;
        data= GeographicFileManager.read("geographicCoordenates.txt");
        return data;

}



                
                
                
                
    
}
