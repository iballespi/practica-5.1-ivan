package com.banc.gestio;

/**
 * Representa un empleat del banc.
 * Estén Persona i té una associació amb la sucursal on treballa.
 */
public class Empleat extends Persona {
    private Sucursal sucursal;

    /**
     * Constructor per defecte.
     */
    public Empleat() {
        super();
    }

    /**
     * Constructor amb paràmetres.
     * @param dni DNI de l'empleat.
     * @param nom Nom de l'empleat.
     * @param adreca Adreça de l'empleat.
     * @param telefon Telèfon de l'empleat.
     * @param sucursal Sucursal on treballa l'empleat.
     */
    public Empleat(String dni, String nom, String adreca, String telefon, Sucursal sucursal) {
        super(dni, nom, adreca, telefon);
        this.sucursal = sucursal;
    }

    // Getters i Setters
    public Sucursal getSucursal() { return sucursal; }
    public void setSucursal(Sucursal sucursal) { this.sucursal = sucursal; }
}
