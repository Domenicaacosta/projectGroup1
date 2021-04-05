/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.model;

/**
 *
 * @author Asus
 */
public class Scale {
    
    private Float scale;
     
    public Scale(Float scale) {

        this.scale = scale;
    }
   /**
     * @param scale the scale to set
     */
    /**
     * @return the scale
     */
    public Float getScale() {
        return scale;
    }

    /**
     * @param scale the utmlongitude to set
     */
    public void setscale(Float scale) {
        this.scale = scale;
    }
}
