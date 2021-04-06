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

    private float utmMeridian;
    private float utmParalel;
    private float utmMeridianCm;
    private float utmParalelCm;

    public UtmCoordenate(float utmMeridian, float utmParalel, float utmMeridianCm, float utmParalelCm) {
        this.utmMeridian = utmMeridian;
        this.utmParalel = utmParalel;
        this.utmMeridianCm = utmMeridianCm;
        this.utmParalelCm = utmParalelCm;
    }

    /**
     * @return the utmMeridian
     */
    public float getUtmMeridian() {
        return utmMeridian;
    }

    /**
     * @param utmMeridian the utmMeridian to set
     */
    public void setUtmMeridian(float utmMeridian) {
        this.utmMeridian = utmMeridian;
    }

    /**
     * @return the utmParalel
     */
    public float getUtmParalel() {
        return utmParalel;
    }

    /**
     * @param utmParalel the utmParalel to set
     */
    public void setUtmParalel(float utmParalel) {
        this.utmParalel = utmParalel;
    }

    /**
     * @return the utmMeridianCm
     */
    public float getUtmMeridianCm() {
        return utmMeridianCm;
    }

    /**
     * @param utmMeridianCm the utmMeridianCm to set
     */
    public void setUtmMeridianCm(float utmMeridianCm) {
        this.utmMeridianCm = utmMeridianCm;
    }

    /**
     * @return the utmParalelCm
     */
    public float getUtmParalelCm() {
        return utmParalelCm;
    }

    /**
     * @param utmParalelCm the utmParalelCm to set
     */
    public void setUtmParalelCm(float utmParalelCm) {
        this.utmParalelCm = utmParalelCm;
    }

}
