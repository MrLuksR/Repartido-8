package Ejercicio1;

public class Habitacion {
    protected int numero;
    protected String tipo;
    protected double precioBase;

    public Habitacion(int numero, String tipo, double precioBase){
        this.numero = numero;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public void calcPrecioFinal(int dias){
        System.out.println("Precio para " + dias + ": No definido.");
    }

    public void mostrarDetalle(){
        System.out.println("Numero de habitacion: No definido.");
        System.out.println("Tipo: NO definido.");
        System.out.println("Precio Base: No definido.");
    }
}
