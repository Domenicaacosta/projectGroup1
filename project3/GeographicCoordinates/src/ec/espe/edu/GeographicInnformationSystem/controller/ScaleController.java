/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.controller;

import Utils.GeographicFileManager;
import Utils.ScaleFileManager;
import Utils.UtmFileManager;
import ec.espe.edu.GeographicInnformationSystem.model.Scale;
import static javax.swing.Spring.scale;

/**
 *
 * @author Asus
 */
public class ScaleController {
    
    public void save(Scale scale) {
      
        int finalScale;
        String data;
        
        finalScale = scale.getScale();
        data = "The scale transofrmed is " + calculateScale(finalScale);
        GeographicFileManager.save(data, "Scale");
    }
    
    public int calculateScale(int scale){
        
            scale = scale / 100;
            return scale;
                
        }
    public String read (){
        String data;
        data= ScaleFileManager.read("calculateScale.csv");
        return data;

    
    }  
   

    
}
