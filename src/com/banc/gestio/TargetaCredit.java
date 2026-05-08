package com.banc.gestio;

import java.util.Date;

/**
 * Representa una targeta de crèdit associada a un compte corrent.
 */
public class TargetaCredit {
    private String tipus; // Visa, MasterCard, etc.
    private String numero;
    private String titular;
    private Date dataCaducitat;

    /**
     * Constructor per defecte.
     */
    public TargetaCredit() {}

    /**
     * Constructor amb paràmetres.
     * @param tipus Tipus de targeta (Visa, MasterCard...).
     * @param numero Número de la targeta.
     * @param titular Nom del titular de la targeta.
     * @param dataCaducitat Data de caducitat de la targeta.
     */
    public TargetaCredit(String tipus, String numero, String titular, Date dataCaducitat) {
        this.tipus = tipus;
        this.numero = numero;
        this.titular = titular;
        this.dataCaducitat = dataCaducitat;
    }

    // Getters i Setters
    public String getTipus() { return tipus; }
    public void setTipus(String tipus) { this.tipus = tipus; }
    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }
    public String getTitular() { return titular; }
    public void setTitular(String titular) { this.titular = titular; }
    public Date getDataCaducitat() { return dataCaducitat; }
    public void setDataCaducitat(Date dataCaducitat) { this.dataCaducitat = dataCaducitat; }
}
