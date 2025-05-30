package Ejercicio1;

public class HabitacionSuite extends Habitacion{
    public HabitacionSuite(int numero, double precioBase){
        super(numero, "Suite", precioBase*1.2);
    }

    @Override
    public void calcPrecioFinal(int dias){
        System.out.println("Precio para " + dias + " dias: " + (this.precioBase*1.2*dias));
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("Numero de habitacion: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Precio Base: " + (this.precioBase*1.2));
    }
}
