package com.banc.gestio;

/**
 * Representa una persona genèrica al sistema bancari.
 * Aquesta classe serveix com a base per a clients i empleats.
 */
public abstract class Persona {
    protected String dni;
    protected String nom;
    protected String adreca;
    protected String telefon;

    /**
     * Constructor per defecte.
     */
    public Persona() {}

    /**
     * Constructor amb paràmetres.
     * @param dni Document Nacional d'Identitat.
     * @param nom Nom complet de la persona.
     * @param adreca Adreça de residència.
     * @param telefon Número de telèfon de contacte.
     */
    public Persona(String dni, String nom, String adreca, String telefon) {
        this.dni = dni;
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
    }

    // Getters i Setters (esquelet)
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public String getAdreca() { return adreca; }
    public void setAdreca(String adreca) { this.adreca = adreca; }
    public String getTelefon() { return telefon; }
    public void setTelefon(String telefon) { this.telefon = telefon; }
}
