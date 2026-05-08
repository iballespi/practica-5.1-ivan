package com.banc.gestio;

import java.util.Date;

/**
 * Representa un fons d'inversió ofert pel banc.
 */
public class FonsInversio {
    private String nom;
    private double importInversio;
    private double rendibilitat;
    private Date dataObertura;
    private Date dataVenciment;

    /**
     * Constructor per defecte.
     */
    public FonsInversio() {}

    /**
     * Constructor amb paràmetres.
     * @param nom Nom del fons.
     * @param importInversio Quantitat invertida.
     * @param rendibilitat Percentatge de rendibilitat esperada.
     * @param dataObertura Data d'obertura del fons.
     * @param dataVenciment Data de venciment del fons.
     */
    public FonsInversio(String nom, double importInversio, double rendibilitat, Date dataObertura, Date dataVenciment) {
        this.nom = nom;
        this.importInversio = importInversio;
        this.rendibilitat = rendibilitat;
        this.dataObertura = dataObertura;
        this.dataVenciment = dataVenciment;
    }

    // Getters i Setters
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    public double getImportInversio() { return importInversio; }
    public void setImportInversio(double importInversio) { this.importInversio = importInversio; }
    public double getRendibilitat() { return rendibilitat; }
    public void setRendibilitat(double rendibilitat) { this.rendibilitat = rendibilitat; }
    public Date getDataObertura() { return dataObertura; }
    public void setDataObertura(Date dataObertura) { this.dataObertura = dataObertura; }
    public Date getDataVenciment() { return dataVenciment; }
    public void setDataVenciment(Date dataVenciment) { this.dataVenciment = dataVenciment; }
}
