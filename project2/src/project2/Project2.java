/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Domenica
 */
public class Project2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");

        double latitude;
        double latitudeGrade;
        double longitudeGrade;
        double longitude;
        double minutesLatitude;
        double minutesLongitude;
        double decimalPartLatitude;
        double decimalPartLongitude;
        double wholePartLongitude;
        double secondsLongitude;
        double wholePartLatitude;
        double secondsLatitude;
        double utmLongitude;
        double utmLatitude;
        showProgrammBanner();
        
        System.out.println("**MAP INFORMATION*");
        String[] typesOfMeasure = {"Decimeters","Decameters","Hectometers","Kilometers"};

        String[] valueInmeters = {"0.1m", "10m", "100m", "1000m"};
        
        String[] typesOfScale ={"1:500000 a 1:50000000 cm", "1:50000 a 1:5000000cm", "1:5000 a 1:50000 cm "};
       
       String[] sizeOfScale = {"Small  ", " Medium", "Big"};
       
       String[] valueScaleInMeters = {"0.01:5000 a 0.01: 50000 m ", "0.01:500 a 0.01:50000 m", "0.01:50 a 0.01: 500 m"};
        
       

        System.out.println("Types of Measure");
        for (String typesOfMeasures : typesOfMeasure) {
            System.out.println("Types of Measure -->  " + typesOfMeasures);
        }
        System.out.println("");
        System.out.println("value in Meter");
        for (String valueInMeters : valueInmeters) {
            System.out.println("value in meters-->  " + valueInMeters);
        }
        System.out.println("");
        System.out.println("types of Scale");
       for (String typesOfScales : typesOfScale){
           System.out.println("types of Scale--->" + typesOfScales);
       }
      
    
        longitudeGrade = showLongitudeInstructions(input);
        longitude = input.nextDouble();
        minutesLongitude = calculateMinutesLongitude(longitude);
        decimalPartLongitude = calculateDecimalPartLongitude(minutesLongitude);
        wholePartLongitude = calculateWholePartLongitude(minutesLongitude, decimalPartLongitude);
        secondsLongitude = calculateSecondsLongitude(decimalPartLongitude);

        latitudeGrade = showLatitudeInstructions(input);
        latitude = input.nextDouble();
        minutesLatitude = calculateMinutesLatitude(longitude);
        decimalPartLatitude = calculateDecimalPartLatitude(minutesLongitude);
        wholePartLatitude = calculateWholaPartLatitude(minutesLatitude, decimalPartLatitude);
        secondsLatitude = calculateSecondsLatitude(decimalPartLatitude);

        showGeographicalCoordenates(latitudeGrade, wholePartLatitude, df, secondsLatitude, longitudeGrade, wholePartLongitude, secondsLongitude);

        utmLongitude = calculateUtmLongitude(longitude);
        utmLatitude = calculateUtmLatitude(latitude);
        showUtmCoordenates(df, utmLongitude, utmLatitude);
    }

    private static double calculateSecondsLongitude(double decimalPartLongitude) {
        double secondsLongitude;
        secondsLongitude = decimalPartLongitude * 60;
        return secondsLongitude;
    }

    private static double calculateWholePartLongitude(double minutesLongitude, double decimalPartLongitude) {
        double wholePartLongitude;
        wholePartLongitude = minutesLongitude - decimalPartLongitude;
        return wholePartLongitude;
    }

    private static double calculateDecimalPartLongitude(double minutesLongitude) {
        double decimalPartLongitude;
        decimalPartLongitude = (minutesLongitude % 1);
        return decimalPartLongitude;
    }

    private static double calculateMinutesLongitude(double longitude) {
        double minutesLongitude;
        minutesLongitude = (longitude * 5) / 33.1;
        return minutesLongitude;
    }

    private static void showUtmCoordenates(DecimalFormat df, double utmLongitude, double utmLatitude) {
        System.out.println("THE UTM COORDENATES ARE ");
        System.out.println(df.format(utmLongitude) + "m E ");
        System.out.println(df.format(utmLatitude) + "m S ");
    }

    private static double calculateUtmLatitude(double latitude) {
        double utmLatitude;
        utmLatitude = (latitude * 1000) / 3;
        return utmLatitude;
    }

    private static double calculateUtmLongitude(double longitude) {
        double utmLongitude;
        utmLongitude = (longitude * 1000) / 3;
        return utmLongitude;
    }

    private static void showGeographicalCoordenates(double latitudeGrade, double wholePartLatitude, DecimalFormat df, double secondsLatitude, double longitudeGrade, double wholePartLongitude, double secondsLongitude) {
        System.out.println("THE GEOGRAPHICAL COORDENATES ARE");
        System.out.println("The latitude coordenate is " + latitudeGrade + "°" + df.format(wholePartLatitude) + "'" + df.format(secondsLatitude) + "''" + "S");
        System.out.println("The longitude coordenate is " + longitudeGrade + "°" + wholePartLongitude + " ' " + df.format(secondsLongitude) + " '' " + "E");
    }

    private static void showProgrammBanner() {
        //Coordinate [0]=Geographical
        //Coordinate[1]= UTM
        System.out.println("•──•─•──•─•──•─•──•─•──•─•──•─•──•─•──•─•──•─•✦•──•─•──•─•──•─•──•─•──•─•──•─•──•─•──•─•");
        System.out.println("                𝓦𝓮𝓵𝓬𝓸𝓶𝓮 𝓽𝓸 𝓒𝓸𝓸𝓻𝓭𝓲𝓷𝓪𝓽𝓮 𝓒𝓪𝓵𝓬𝓾𝓵𝓪𝓽𝓸𝓻                ");
        System.out.println("𝑌𝑜𝑢 𝑐𝑎𝑛 𝑐𝑎𝑙𝑐𝑢𝑙𝑎𝑡𝑒 𝐺𝑒𝑜𝑔𝑟𝑎𝑝ℎ𝑖𝑐𝑎𝑙 𝑎𝑛𝑑 𝑈𝑇𝑀 𝑐𝑜𝑜𝑟𝑑𝑒𝑛𝑎𝑡𝑒𝑠 𝑜𝑓 𝑄𝑢𝑖𝑡𝑜'𝑠 𝑀𝑎𝑝    ");
        System.out.println("𝐼𝑛 𝑦𝑜𝑢𝑟 𝑚𝑎𝑝 𝑠𝑒𝑙𝑒𝑐𝑡 𝑡ℎ𝑒 𝑝𝑜𝑖𝑛𝑡 𝑦𝑜𝑢 𝑤𝑎𝑛𝑡");
        System.out.println("•──•─•──•─•──•─•──•─•──•─•──•─•──•─•──•─•──•─•✦•──•─•──•─•──•─•──•─•──•─•──•─•──•─•──•─•");
    }

    private static double showLongitudeInstructions(Scanner input) {
        double longitudeGrade;
        
        longitudeGrade = 78;
        System.out.println("Measure longitude from the point in horizontal line to right edge of map (→)");
        System.out.println("Please enter longitude in cm ");
        return longitudeGrade;
    }

    private static double showLatitudeInstructions(Scanner input) {
        double latitudeGrade;
        
        latitudeGrade = 0;
        System.out.println("Measure latitude from your point in vertical line to bottom edge to the map (↓)");
        System.out.println("Please enter latitude in cm ");
        
        return latitudeGrade;
    }

    private static double calculateSecondsLatitude(double decimalPartLatitude) {
        double secondsLatitude;
        secondsLatitude = decimalPartLatitude * 60;
        return secondsLatitude;
    }

    private static double calculateWholaPartLatitude(double minutesLatitude, double decimalPartLatitude) {
        double wholePartLatitude;
        wholePartLatitude = minutesLatitude - decimalPartLatitude;
        return wholePartLatitude;
    }

    private static double calculateDecimalPartLatitude(double minutesLongitude) {
        double decimalPartLatitude;
        decimalPartLatitude = (minutesLongitude % 1);
        return decimalPartLatitude;
    }

    private static double calculateMinutesLatitude(double longitude) {
        double minutesLatitude;
        minutesLatitude = (longitude * 5) / 33;
        return minutesLatitude;
    }
}
