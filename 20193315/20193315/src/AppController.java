import java.util.ArrayList;
import java.util.Scanner;

public class AppController {
    Scanner scanner = new Scanner(System.in);

    public void agregarObjeto(ArrayList<Objeto> lista) {
        System.out.println("Indique el nombre del objeto");

        String dato1 = scanner.nextLine();

        System.out.println("Indique el uso del objeto");
        String dato2 = scanner.nextLine();

        tipo:
        while(true){
            System.out.println("Indique el uso del objeto");
            System.out.println("1. arma");
            System.out.println("2. objeto curativo");
            System.out.println("3. otro");
            String dato3 = scanner.nextLine();
            switch (dato3) {
                case "1":
                    Arma arma = new Arma(0, 0);
                    arma.setNombre(dato1);
                    arma.setDescripcion(dato2);

                    iteraArma:
                    while (true) {
                        System.out.println("Indique el poder del arma");
                        String datoPoder = scanner.nextLine();
                        double poder = Double.parseDouble(datoPoder);
                        if (poder < 1000 && poder > 0) {
                            arma.setPoder(poder);
                            break iteraArma;
                        }
                    }
                    lista.add(arma);
                    break tipo;
                case "2":
                    ObjetoCurativo objetoCurativo = new ObjetoCurativo(0);
                    objetoCurativo.setNombre(dato1);
                    objetoCurativo.setDescripcion(dato2);


                    iteraCurativo:
                    System.out.println("Indique la vida que restaura el objeto");
                    String datoCurativo = scanner.nextLine();
                    int curativo = Integer.parseInt(datoCurativo);
                    objetoCurativo.setVidaRestaurada(curativo);
                    lista.add(objetoCurativo);
                    break tipo;
                case "3":
                    System.out.println();
                    break tipo;
                default:
                    System.out.println("Numero incorrecto");
            }

        }

    }

//    public void agregarObjeto(){
//
//    }





    public void agregarZombie(ArrayList<Ente> lista) {
        Zombie zombie = new Zombie();

        System.out.println("Indique el nombre del zombie");
        zombie.setNombre(scanner.nextLine());

        System.out.println("Indique la fuerza del zombie");
        String datoFuerza = scanner.nextLine();
        zombie.setFuerza(Double.parseDouble(datoFuerza));

        System.out.println("Indique la defensa del zombie");
        String datoDefensa = scanner.nextLine();
        zombie.setDefensa(Double.parseDouble(datoDefensa));

        System.out.println("Indique la velocidad del zombie");
        String datoVelocidad = scanner.nextLine();
        zombie.setDefensa(Double.parseDouble(datoVelocidad));

        System.out.println("Indique la vida del zombie");
        String datoVida = scanner.nextLine();
        zombie.setVida(Double.parseDouble(datoVida));

        System.out.println("Indique la frase de victoria que diria");
        zombie.setFraseVictoria(scanner.nextLine());

        System.out.println("Zombie añadido con nombre: "+zombie.getNombre());
    }

    public void agregarSuperviviente(ArrayList<Ente> lista,ArrayList<Objeto> objetos)
    {
        Superviviente superviviente = new Superviviente();

        System.out.println("Indique el nombre del superviviente");
        superviviente.setNombre(scanner.nextLine());

        System.out.println("Indique la fuerza del superviviente");
        String datoFuerza = scanner.nextLine();
        superviviente.setFuerza(Double.parseDouble(datoFuerza));

        System.out.println("Indique la defensa del superviviente");
        String datoDefensa = scanner.nextLine();
        superviviente.setDefensa(Double.parseDouble(datoDefensa));

        System.out.println("Indique la velocidad del superviviente");
        String datoVelocidad = scanner.nextLine();
        superviviente.setDefensa(Double.parseDouble(datoVelocidad));

        System.out.println("Indique la vida del superviviente");
        String datoVida = scanner.nextLine();
        superviviente.setVida(Double.parseDouble(datoVida));

        System.out.println("Indique la valentia del superviviente");
        String datoValentia = scanner.nextLine();
        superviviente.setValentia(Integer.parseInt(datoValentia));

        System.out.println("Indique la frase de victoria que diria");
//        String frase = scanner.nextLine();
        superviviente.setFraseVictoria(scanner.nextLine());

        System.out.println("Indique la cantidad de objetos que tendrá");
        String cantObjetos = scanner.nextLine();
        int cantObjetosInt = Integer.parseInt(cantObjetos);

        for (int i = 1; i <= cantObjetosInt; i++) {
            Objeto objeto= objetos.get((int) Math.random());
            System.out.println(objeto.getNombre()+"añadido");
        }


        int sanidad = (int) (255 - superviviente.getFuerza()- superviviente.getFuerza());
        superviviente.setSanidad(sanidad);
        lista.add(superviviente);


    }


    public int verificarListaPura(ArrayList<Ente> lista){
        int contadorSuperviviente=0;
        int contadorZombie=0;
        for (Ente e:lista){
            if (e instanceof Superviviente){
                contadorSuperviviente=contadorSuperviviente+1;
            } else if (e instanceof Zombie) {
                contadorZombie=contadorZombie+1;
            }
        }
        if(contadorZombie>=1 && contadorSuperviviente>=1){
            System.out.println("Juego iniciado");
            return 1;
        }else if(contadorZombie>=1 && contadorSuperviviente==0){
            System.out.println("No se tienen supervivientes");
            return 0;
        }else if(contadorZombie==0 && contadorSuperviviente>=1) {
            System.out.println("No se tiene zombies");
            return 0;
        }else{
            System.out.println("No se tienen nada");
            return  0;
        }

        //Tu mismo eres

    }

    public Superviviente obtenerSupervivienteMasValiente(ArrayList<Ente> lista){
        int contadorZombieDebil=0;
        for (Ente e:lista){
            if (e instanceof Zombie) {
                contadorZombieDebil=contadorZombieDebil+1;
            }
        }
        return null;
    }

    public Zombie obtenerZombieMasDebil(ArrayList<Ente> lista){
        //Sigue asi tu puedes!!
        return null;
    }

    public void atacarZombie(double poder, Zombie zombie)
    {
        //Ya falta poco
    }

    public void defenderseDeZombie(double poder, Superviviente superviviente)
    {
        //Veo un futuro 20
    }

}
