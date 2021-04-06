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
<<<<<<< HEAD
    private int scale;

    public Scale(int scale) {
        this.scale = scale;
    }

    /**
     * @return the scale
     */
    public int getScale() {
=======
    
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
>>>>>>> 27256439f7ab551093cb51b69cdc4f7bb87f6b56
        return scale;
    }

    /**
<<<<<<< HEAD
     * @param scale the scale to set
     */
    public void setScale(int scale) {
        this.scale = scale;
    }
  
     
    
=======
     * @param scale the utmlongitude to set
     */
    public void setscale(Float scale) {
        this.scale = scale;
    }
>>>>>>> 27256439f7ab551093cb51b69cdc4f7bb87f6b56
}
