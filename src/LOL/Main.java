package LOL;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Campeon[] equipo1 = new Campeon[3];
        Campeon[] equipo2 = new Campeon[3];

        // 1. Crear arrays de 3 campeones para cada equipo
        equipo1[0] = new TopLaner("Garen", "Top", 80, 70, 40, 30);
        equipo1[1] = new MidLaner("Ahri", "Mid", 70,50,60,40);
        equipo1[2] = new ADC("Jinx", "ADC", 85, 40, 75, 35);

        // 2. Instanciar campeones y asignarlos manualmente a los arrays
        equipo2[0] = new Jungla("Lee Sin", "Jungla", 75, 60, 65, 45);
        equipo2[1] = new Support("Thresh", "Support", 40, 80, 30, 50);
        equipo2[2] = new MidLaner("Lux", "Mid", 60, 55, 60, 38);

        // 3. Mostrar info inicial
        System.out.println(ANSI_BLUE + "Equipo 1:" + ANSI_RESET);
        for (int i = 0; i < equipo1.length; i++){
            System.out.println("--------");
            equipo1[i].mostInfo();}
        System.out.println(ANSI_RED + "Equipo 2:" + ANSI_RESET);
        for (int i = 0; i < equipo2.length; i++){
            System.out.println("--------");
            equipo2[i].mostInfo();}

        // Terreno de Combate
        System.out.println("------------------------");
        System.out.println("COMBATEEEEEEEE");
        Random rand = new Random();
        int num;
        boolean vivos = equipoSigueVivo(equipo2);
        while(vivos){
            num = rand.nextInt(1);
            Campeon champ1 = obtenerVivoAleatorio(equipo1);
            Campeon champ2 = obtenerVivoAleatorio(equipo2);
            System.out.println("------------------------");
            System.out.println(ANSI_BLUE + "Campeon atacante: " + champ1.getNombre() + ANSI_RESET);
            System.out.println(ANSI_RED + "Campeon defensor: " + champ2.getNombre() + ANSI_RESET);
            if (num == 0)
                champ2.recibirDanio(champ1.atacar());
            else
                champ2.recibirDanio(champ1.ataqueEspecial());
            vivos = equipoSigueVivo(equipo2);
        }
        System.out.println("------------------------");
        if (!vivos)
            System.out.println(ANSI_BLUE + "El equipo 1 GANA." + ANSI_RESET);
        else
            System.out.println(ANSI_RED + "El equipo 2 GANA." + ANSI_RESET);
    }
    public static boolean equipoSigueVivo(Campeon[] equipo){
        int cont = 0;
        for (int i = 0; i < equipo.length; i++){
            if (equipo[i].getSalud() > 0)
                cont ++;}
        if (cont > 0)
            return true;
        else
            return false;
    }
    public static Campeon obtenerVivoAleatorio(Campeon[] equipo){
        int cont = 0;
        for (int i = 0; i < equipo.length; i++){
            if (equipo[i].getSalud() > 0)
                 cont++;}
        Campeon[] vivos = new Campeon[cont];
        int j = 0;
        for (int i = 0; i < equipo.length; i++){
            if (equipo[i].getSalud() > 0){
                vivos[j] = equipo[i];
                j++;}
        }
        Random rand = new Random();
        int indice = rand.nextInt(vivos.length);
        return vivos[indice];
    }
    public static final String ANSI_RESET = "\u001B[0m";  // Restablece el color a predeterminado
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
