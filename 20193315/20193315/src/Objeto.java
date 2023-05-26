import java.util.Scanner;

public class Objeto {

    Scanner scanner = new Scanner(System.in);
    private String nombre;
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

//    public void agregarObjeto(){
//        System.out.println("Indique el nombre del objeto");
//        String dato1 = scanner.nextLine();
//
//        Objeto objeto = new Objeto();
//
//        System.out.println("Indique el uso del objeto");
//        String dato2 = scanner.nextLine();
//
//        tipo:
//        while(true){
//            System.out.println("Indique el uso del objeto");
//            System.out.println("1. arma");
//            System.out.println("2. objeto curativo");
//            System.out.println("3. otro");
//            String dato3 = scanner.nextLine();
//            switch (dato3) {
//                case "1":
//                    Arma arma = new Arma(0, 0);
//                    arma.setNombre(dato1);
//                    arma.setDescripcion(dato2);
//
//                    iteraArma:
//                    while (true) {
//                        System.out.println("Indique el poder del arma");
//                        String datoPoder = scanner.nextLine();
//                        double poder = Double.parseDouble(datoPoder);
//                        if (poder < 1000 && poder > 0) {
//                            arma.setPoder(poder);
//                            break iteraArma;
//                        }
//                    }
//
//                    break tipo;
//                case "2":
//                    ObjetoCurativo objetoCurativo = new ObjetoCurativo(0);
//                    objetoCurativo.setNombre(dato1);
//                    objetoCurativo.setDescripcion(dato2);
//
//
//                    iteraCurativo:
//                    System.out.println("Indique la vida que restaura el objeto");
//                    String datoCurativo = scanner.nextLine();
//                    int curativo = Integer.parseInt(datoCurativo);
//                        objetoCurativo.setVidaRestaurada(curativo);
//                    break tipo;
//                case "3":
//                    System.out.println();
//                    break tipo;
//                default:
//                    System.out.println("Numero incorrecto");
//                }
//
//            }
//        }


    }




