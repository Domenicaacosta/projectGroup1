/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.controller;

import Utils.FileManager;
import Utils.ScaleFileManager;
import Utils.UtmFileManager;
import static javax.swing.Spring.scale;

/**
 *
 * @author Asus
 */
public class CalculateScaleController {
    public void save(CalculateScale calculateScale) {
      String data = calculateScale.getScale);
        ScaleFileManager.save(data, "calculateScale");  
    }
    
    private static double calculateScale(float scale){
        float scale;
            scale = scale / 100;
            return scale;
                
        }
    public String read (){
        String data;
        data= ScaleFileManager.read("calculateScale.csv");
        return data;

    
    }  

    
}
