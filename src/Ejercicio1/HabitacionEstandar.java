package Ejercicio1;

public class HabitacionEstandar extends Habitacion{

    public HabitacionEstandar(int numero, double precioBase){
        super(numero, "Estandar", precioBase);
    }

    @Override
    public void calcPrecioFinal(int dias){
        System.out.println("Precio para " + dias + " dias: " + (this.precioBase*dias));
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Numero de habitacion: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio Base: " + this.precioBase);
    }
}
