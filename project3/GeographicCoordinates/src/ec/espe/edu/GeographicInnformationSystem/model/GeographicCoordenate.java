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
public class GeographicCoordenate {

     private Float longitude;
    private Float latitude;
    private Float utmlongitude;
    private Float utmlatitude;

    public GeographicCoordenate(Float longitude, Float latitude, Float utmlongitude, Float utmlatitude) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.utmlongitude = utmlongitude;
        this.utmlatitude = utmlatitude;
    }

    /**
     * @return the longitude
     */
    public Float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the latitude
     */
    public Float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

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
