package com.banc.gestio;

import java.util.List;

/**
 * Representa una cartera de valors d'un client.
 * Està composta per diversos títols o valors.
 */
public class CarteraValors {
    private List<Valor> valors;

    /**
     * Constructor per defecte.
     */
    public CarteraValors() {}

    /**
     * Constructor amb paràmetres.
     * @param valors Llista de valors que componen la cartera.
     */
    public CarteraValors(List<Valor> valors) {
        this.valors = valors;
    }

    // Getters i Setters
    public List<Valor> getValors() { return valors; }
    public void setValors(List<Valor> valors) { this.valors = valors; }
}
