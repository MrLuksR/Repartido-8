package LOL;

public class TopLaner extends Campeon{
    private int resistencia;

    public TopLaner(String nom, String rol, int atq, int def, int vel, int res){
        super(nom, rol, atq, def, vel);
        this.resistencia = res;
    }

    @Override
    public void recibirDanio(int danio){
        if (salud>0){
            this.salud -= (danio-(this.resistencia/10));
            System.out.println(this.nombre + " ha recibido: " + (danio-(this.resistencia/10)) + " de daño.");
            if (this.salud <= 0)
                System.out.println(this.nombre + " está muerto. RIP...");
            else
                mostInfo();}
    }

    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Resistencia: " + this.resistencia);
    }
}
