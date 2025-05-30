package LOL;

public class ADC extends Campeon{
    int rango;

    public ADC(String nom, String rol, int atq, int def, int vel, int ran){
        super(nom, rol, atq, def, vel);
        this.rango = ran;
    }

    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Rango: " + this.rango);
    }

    @Override
    public int atacar(){
        return super.atacar() + (rango/4);
    }
}
