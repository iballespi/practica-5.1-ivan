package com.banc.gestio;

import java.util.Date;
import java.util.List;

/**
 * Representa un compte a termini.
 * Té una durada específica en mesos.
 */
public class CompteTermini extends CompteBancari {
    private int nombreMesos;

    /**
     * Constructor per defecte.
     */
    public CompteTermini() {
        super();
    }

    /**
     * Constructor amb paràmetres.
     * @param numeroCompte Número del compte.
     * @param dataObertura Data d'obertura.
     * @param saldo Saldo actual.
     * @param tipusInteres Tipus d'interès.
     * @param clients Llista de clients.
     * @param nombreMesos Durada del compte en mesos.
     */
    public CompteTermini(String numeroCompte, Date dataObertura, double saldo, double tipusInteres, List<Client> clients, int nombreMesos) {
        super(numeroCompte, dataObertura, saldo, tipusInteres, clients);
        this.nombreMesos = nombreMesos;
    }

    // Getters i Setters
    public int getNombreMesos() { return nombreMesos; }
    public void setNombreMesos(int nombreMesos) { this.nombreMesos = nombreMesos; }
}
