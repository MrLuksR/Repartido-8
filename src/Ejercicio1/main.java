package Ejercicio1;

public class main {
    public static void main(String[] args) {
        HabitacionEstandar he1 = new HabitacionEstandar(123, 1200);
        he1.calcPrecioFinal(5);
        he1.mostrarDetalle();

        HabitacionSuite hs1 = new HabitacionSuite(124, 1200);
        hs1.calcPrecioFinal(5);
        hs1.mostrarDetalle();

        HabitacionSuitePrecidencial hsp1 = new HabitacionSuitePrecidencial(125, 1200);
        hsp1.calcPrecioFinal(6);
        hsp1.mostrarDetalle();
    }
}
