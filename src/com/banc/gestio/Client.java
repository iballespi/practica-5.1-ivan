package com.banc.gestio;

/**
 * Representa un client del banc.
 * Estén la classe Persona per emmagatzemar dades personals.
 */
public class Client extends Persona {

    /**
     * Constructor per defecte.
     */
    public Client() {
        super();
    }

    /**
     * Constructor amb paràmetres.
     * @param dni Document Nacional d'Identitat.
     * @param nom Nom complet del client.
     * @param adreca Adreça del client.
     * @param telefon Telèfon del client.
     */
    public Client(String dni, String nom, String adreca, String telefon) {
        super(dni, nom, adreca, telefon);
    }
}
