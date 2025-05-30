package LOL;

public class MidLaner extends Campeon{
    private int poderMag;

    public MidLaner(String nom, String rol, int atq, int def, int vel, int mag){
        super(nom, rol, atq, def, vel);
        this.poderMag = mag;
    }

    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Poder magico: " + this.poderMag);
    }

    @Override
    public void recibirDanio(int danio){
        if (this.salud>0){
            this.salud -= (danio - (poderMag/8));
            System.out.println(this.nombre + " ha recibido: " + (danio - (poderMag/8)) + " de daño.");
            if (this.salud <= 0)
                System.out.println(this.nombre + " está muerto. RIP...");
            else
                mostSalud();}
    }
}
