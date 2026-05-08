package com.banc.gestio;

/**
 * Representa una sucursal del banc.
 * Conté informació sobre la ubicació i l'identificador de la oficina.
 */
public class Sucursal {
    private String id;
    private String adreca;

    /**
     * Constructor per defecte.
     */
    public Sucursal() {}

    /**
     * Constructor amb paràmetres.
     * @param id Identificador únic de la sucursal.
     * @param adreca Adreça física de la sucursal.
     */
    public Sucursal(String id, String adreca) {
        this.id = id;
        this.adreca = adreca;
    }

    // Getters i Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getAdreca() { return adreca; }
    public void setAdreca(String adreca) { this.adreca = adreca; }
}
