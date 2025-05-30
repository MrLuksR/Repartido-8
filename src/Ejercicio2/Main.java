package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro("Firu",3,"Labrador");
        Gato g1 = new Gato("Michi",4,"Azul");
        Conejo c1 = new Conejo("Cone",5,13.5);

        Animal array[] = {p1,g1,c1};

        for (int i = 0; i < array.length; i++){
            array[i].toString();
            System.out.println("---------------");
        }

    }
}
