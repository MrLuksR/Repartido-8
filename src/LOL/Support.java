package LOL;

public class Support extends Campeon{
    private int curacion;

    public Support(String nom, String rol, int atq, int def, int vel, int cur){
        super(nom, rol, atq, def, vel);
        this.curacion = cur;
    }

    @Override
    public void mostInfo(){
        super.mostInfo();
        System.out.println("Curacion: " + this.curacion);
    }

    public void curar(){
        this.salud += this.curacion/10;
        if (this.salud > 100){
            System.out.println("Salud al maximo.");
            this.salud = 100;}
        else
            System.out.println("Curado. Vida actual: " + this.salud);
    }
}
