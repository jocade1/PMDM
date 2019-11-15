package com.examempmp;

import java.io.Serializable;

public class Factura implements Serializable {
    private Pizza pizza;
    private int unidades;
    private boolean esMasGrande;
    private boolean tieneMasingredientes;
    private boolean tieneMasQueso;
    private boolean domicilio;


    public Pizza getPizza(){return pizza;}

    public void setPizza(Pizza pizza){
        this.pizza= pizza;
    }

    public int getUnidades() {
        return unidades;
    }

    public boolean getEsMasGrande() {
        return esMasGrande;
    }

    public boolean getTieneMasingredientes() {
        return tieneMasingredientes;
    }

    public boolean getTieneMasQueso() {
        return tieneMasQueso;
    }

    public boolean getDomicilio() {
        return domicilio;
    }


    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public void setEsMasGrande(boolean esMasGrande) {
        this.esMasGrande = esMasGrande;
    }

    public void setTieneMasingredientes(boolean tieneMasingredientes) {
        this.tieneMasingredientes = tieneMasingredientes;
    }

    public void setTieneMasQueso(boolean tieneMasQueso) {
        this.tieneMasQueso = tieneMasQueso;
    }

    public void setDomicilio(boolean domicilio) {
        this.domicilio = domicilio;
    }
}


