package com.banc.gestio;

import java.util.Date;
import java.util.List;

/**
 * Representa un compte corrent.
 * Pot tenir targetes de crèdit, fons d'inversió i carteres de valors associades.
 */
public class CompteCorrent extends CompteBancari {
    private List<TargetaCredit> targetes;
    private List<FonsInversio> fonsInversio;
    private List<CarteraValors> carteresValors;

    /**
     * Constructor per defecte.
     */
    public CompteCorrent() {
        super();
    }

    /**
     * Constructor amb paràmetres.
     * @param numeroCompte Número del compte.
     * @param dataObertura Data d'obertura.
     * @param saldo Saldo actual.
     * @param tipusInteres Tipus d'interès.
     * @param clients Llista de clients titulars.
     */
    public CompteCorrent(String numeroCompte, Date dataObertura, double saldo, double tipusInteres, List<Client> clients) {
        super(numeroCompte, dataObertura, saldo, tipusInteres, clients);
    }

    // Getters i Setters per als productes associats
    public List<TargetaCredit> getTargetes() { return targetes; }
    public void setTargetes(List<TargetaCredit> targetes) { this.targetes = targetes; }
    public List<FonsInversio> getFonsInversio() { return fonsInversio; }
    public void setFonsInversio(List<FonsInversio> fonsInversio) { this.fonsInversio = fonsInversio; }
    public List<CarteraValors> getCarteresValors() { return carteresValors; }
    public void setCarteresValors(List<CarteraValors> carteresValors) { this.carteresValors = carteresValors; }
}
