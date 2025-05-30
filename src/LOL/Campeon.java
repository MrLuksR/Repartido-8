package LOL;

public class Campeon {
    protected String nombre;
    protected String rol;
    protected int ataque;
    protected int defensa;
    protected int velocidad;
    protected int salud = 100;

    public Campeon(String nombre, String rol, int ataque, int defensa, int velocidad){
        this.nombre = nombre;
        this.rol = rol;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }

    public int getSalud() {
        return salud;
    }
    public String getNombre(){
        return this.nombre;
    }

    public int atacar(){
        return (this.ataque + this.velocidad) /2;
    }

    public int ataqueEspecial(){
        return (this.ataque + this.defensa) /2;
    }

    public void recibirDanio(int danio){
        if (this.salud>0){
            this.salud -= danio;
            System.out.println(this.nombre + " ha recibido: " + danio + " de daño.");
            if (this.salud <= 0)
                System.out.println(this.nombre + " está muerto. RIP...");
            else
                mostSalud();}
    }

    public void mostInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Rol: " + this.rol);
        System.out.println("Ataque: " + this.ataque);
        System.out.println("Defensa: " + this.defensa);
        System.out.println("Velocidad: " + this.velocidad);
        mostSalud();
    }

    public void mostSalud(){
        if (this.salud == 100)
            System.out.println("HP:[##########]"  + (this.salud) + "%");
        else if (this.salud > 90 && this.salud < 100)
            System.out.println("HP:[#########-]" + (this.salud) + "%");
        else if (this.salud > 80 && this.salud < 90)
            System.out.println("HP:[########--]" + (this.salud) + "%");
        else if (this.salud > 70 && this.salud < 80)
            System.out.println("HP:[#######---]" + (this.salud) + "%");
        else if (this.salud > 60 && this.salud < 70)
            System.out.println("HP:[######----]" + (this.salud) + "%");
        else if (this.salud > 50 && this.salud < 60)
            System.out.println("HP:[#####-----]" + (this.salud) + "%");
        else if (this.salud > 40 && this.salud < 50)
            System.out.println("HP:[####------]" + (this.salud) + "%");
        else if (this.salud > 30 && this.salud < 40)
            System.out.println("HP:[###-------]" + (this.salud) + "%");
        else if (this.salud > 20 && this.salud < 30)
            System.out.println("HP:[##--------]" + (this.salud) + "%");
        else if (this.salud > 10 && this.salud < 20)
            System.out.println("HP:[#---------]" + (this.salud) + "%");
        else
            System.out.println("HP:[----------]" + (this.salud) + "%");
    }
}
