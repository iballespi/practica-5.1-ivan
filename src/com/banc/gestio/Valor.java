package com.banc.gestio;

/**
 * Representa un títol o valor individual dins d'una cartera de valors.
 */
public class Valor {
    private String nom;
    private int nombreTitols;
    private double preuCotitzacio;

    /**
     * Constructor per defecte.
     */
    public Valor() {}

    /**
     * Constructor amb paràmetres.
     * @param nom Nom del valor o empresa.
     * @param nombreTitols Quantitat de títols en propietat.
     * @param preuCotitzacio Preu de cotització actual.
     */
    public Valor(String nom, int nombreTitols, double preuCotitzacio) {
        this.nom = nom;
        this.nombreTitols = nombreTitols;
        this.preuCotitzacio = preuCotitzacio;
    }

    // Getters i Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public int getNombreTitols() { return nombreTitols; }
    public void setNombreTitols(int nombreTitols) { this.nombreTitols = nombreTitols; }
    public double getPreuCotitzacio() { return preuCotitzacio; }
    public void setPreuCotitzacio(double preuCotitzacio) { this.preuCotitzacio = preuCotitzacio; }
}
