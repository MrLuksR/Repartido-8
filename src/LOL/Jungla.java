package LOL;

public class Jungla extends Campeon{
    private int controlMapa;

    public Jungla(String nom, String rol, int atq, int def, int vel, int conMap){
        super(nom, rol, atq, def, vel);
        this.controlMapa = conMap;
    }

    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Control de mapa: " + this.controlMapa);
    }

    @Override
    public int ataqueEspecial(){
        return super.ataqueEspecial() + (this.controlMapa / 5);
    }
}
