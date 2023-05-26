import java.util.Scanner;

public class Ente {

    private String nombre;
    private double fuerza;
    private double defensa;
    private double velocidad;
    private double vida;
    private String fraseVictoria;

    public void declararVictoria(){
        System.out.println(nombre + ": " + fraseVictoria);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public String getFraseVictoria() {
        return fraseVictoria;
    }

    public void setFraseVictoria(String fraseVictoria) {
        this.fraseVictoria = fraseVictoria;
    }

    Scanner scanner = new Scanner(System.in);
//    public void agregarSuperviviente(){
//
//        Superviviente superviviente = new Superviviente();
//
//        System.out.println("Indique el nombre del superviviente");
//        superviviente.setNombre(scanner.nextLine());
//
//        System.out.println("Indique la fuerza del superviviente");
//        String datoFuerza = scanner.nextLine();
//        superviviente.setFuerza(Double.parseDouble(datoFuerza));
//
//        System.out.println("Indique la defensa del superviviente");
//        String datoDefensa = scanner.nextLine();
//        superviviente.setDefensa(Double.parseDouble(datoDefensa));
//
//        System.out.println("Indique la velocidad del superviviente");
//        String datoVelocidad = scanner.nextLine();
//        superviviente.setDefensa(Double.parseDouble(datoVelocidad));
//
//    }


}
