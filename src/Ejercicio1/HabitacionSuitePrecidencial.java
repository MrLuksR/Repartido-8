package Ejercicio1;

public class HabitacionSuitePrecidencial extends Habitacion{
    public HabitacionSuitePrecidencial(int numero, double precioBase){
        super(numero, "Suite", precioBase*1.5);
    }

    @Override
    public void calcPrecioFinal(int dias){
        if (dias > 5)
            System.out.println("Precio para " + dias + " dias con descuento: " + ((this.precioBase*1.5*dias)*1.10));
        else
            System.out.println("Precio para " + dias + " dias: " + (this.precioBase*1.5*dias));
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Numero de habitacion: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio Base: " + (this.precioBase*1.5));
    }
}
