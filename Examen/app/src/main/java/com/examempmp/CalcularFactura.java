package com.examempmp;

public class CalcularFactura {
    private static final float COSTE_DOMICILIO = 1.1f;

    private Factura factura;

    public CalcularFactura(Factura factura){this.factura=factura;}

    public double calcularPrecio(){
        double precio = 0;

        precio += CalculoCostes();

        precio *= COSTE_DOMICILIO;
        return precio;
    }

    public String getDomicilio(){
        if(factura.getDomicilio())
            return "En local";
        return "En Domicilio";
    }

    public int CalculoCostes(){
        int f = 0;
        if(factura.getEsMasGrande())
            f+=1;
        if(factura.getTieneMasingredientes())
            f+=1;
        if(factura.getTieneMasQueso())
            f+=1;
        return f;

    }

}
