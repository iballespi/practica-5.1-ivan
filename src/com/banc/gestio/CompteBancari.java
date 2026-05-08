package com.banc.gestio;

import java.util.Date;
import java.util.List;

/**
 * Classe abstracta que representa un compte bancari genèric.
 */
public abstract class CompteBancari {
    protected String numeroCompte;
    protected Date dataObertura;
    protected double saldo;
    protected double tipusInteres;
    protected List<Client> clients;

    /**
     * Constructor per defecte.
     */
    public CompteBancari() {}

    /**
     * Constructor amb paràmetres.
     * @param numeroCompte Número identificador del compte.
     * @param dataObertura Data en la que es va obrir el compte.
     * @param saldo Saldo actual del compte.
     * @param tipusInteres Percentatge d'interès aplicat.
     * @param clients Llista de clients titulars del compte.
     */
    public CompteBancari(String numeroCompte, Date dataObertura, double saldo, double tipusInteres, List<Client> clients) {
        this.numeroCompte = numeroCompte;
        this.dataObertura = dataObertura;
        this.saldo = saldo;
        this.tipusInteres = tipusInteres;
        this.clients = clients;
    }

    // Getters i Setters (esquelet)
    public String getNumeroCompte() { return numeroCompte; }
    public void setNumeroCompte(String numeroCompte) { this.numeroCompte = numeroCompte; }
    public Date getDataObertura() { return dataObertura; }
    public void setDataObertura(Date dataObertura) { this.dataObertura = dataObertura; }
    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    public double getTipusInteres() { return tipusInteres; }
    public void setTipusInteres(double tipusInteres) { this.tipusInteres = tipusInteres; }
    public List<Client> getClients() { return clients; }
    public void setClients(List<Client> clients) { this.clients = clients; }
}
