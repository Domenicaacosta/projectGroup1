/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.GeographicInnformationSystem.model;

/**
 *
 * @author Domenica
 */
public class UtmCoordenate {

    private Float utmlongitude;
    private Float utmlatitude;

    public UtmCoordenate(Float utmlongitude, Float utmlatitude) {

        this.utmlongitude = utmlongitude;
        this.utmlatitude = utmlatitude;
    }

    
    /**
     * @return the longitude
     */
    /**
     * @param longitude the longitude to set
     */
    /**
     * @return the latitude
     */
    /**
     * @param latitude the latitude to set
     */
    /**
     * @return the utmlongitude
     */
    public Float getUtmlongitude() {
        return utmlongitude;
    }

    /**
     * @param utmlongitude the utmlongitude to set
     */
    public void setUtmlongitude(Float utmlongitude) {
        this.utmlongitude = utmlongitude;
    }

    /**
     * @return the utmlatitude
     */
    public Float getUtmlatitude() {
        return utmlatitude;
    }

    /**
     * @param utmlatitude the utmlatitude to set
     */
    public void setUtmlatitude(Float utmlatitude) {
        this.utmlatitude = utmlatitude;
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
