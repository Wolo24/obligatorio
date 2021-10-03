import java.util.*;

public class interfaz {
    public static void main(String[] args) {
        // Creación del teclado para poder interactuar con el usuario

        int sentry;

        do {
            sentry = menuPrincipal();
            switch (sentry) {
                case 1:
                    menuJuegos();
                    break;

                case 2:
                    menuJugador();
                    break;

                case 3:
                    System.out.println("Bitácora");
                    break;

                case 4:
                    System.out.println("Gracias ta luego mano");
                    break;
                default:
                    System.out.println("Valor invalido");
            }

        } while (sentry != 4);
    }

    public static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1) Seleccione un juego");
        System.out.println("2) Registrar nuevo jugador");
        System.out.println("3) Bitácora");
        System.out.println("4) Fin");

        int opcion = lector.nextInt();
        // Ver excepciones
        // (ingreso de algo que no sea int o que este fuera de rango)
        // Checkeo del input
        return opcion;
    }

    public static int menuJuegos() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Los juegos disponibles son: ");
        // for para mostrar todos los juegos
        System.out.println("1) Saltar");
        System.out.println("2) Rectángulo");
        //
        System.out.println("3) Atrás");
        int opcion = lector.nextInt();

        /*
         * En base al numero leído, ver si es el índice de un juego de la lista juegos
         * Si el índice es correcto se pasa a la siguiente etapa
         */
        switch (opcion) {
            case 1:
                System.out.println("Saltar");
                break;
            case 2:
                System.out.println("Rectangulo");
                break;
            case 3:
                break;
            default:
                System.out.println("Opcion invalida.");
        }
        return opcion;
    }

    public static int menuJugador() {
        Scanner lector = new Scanner(System.in);
        // get put post y delete de jugador (?)
        System.out.println("1) Mostrar todos los jugadores");
        System.out.println("2) Crear nuevo jugador");
        System.out.println("3) Modificar jugador");
        System.out.println("4) Borrar jugador");
        int op = lector.nextInt();
        switch (op) {
            case 1:
                // llamada a toString de todos los jugadores
                System.out.println("Se muestran todos los jugadores");
                break;
            case 2:
                // LLamo a procedimiento de crear un jugador
                System.out.println("Creo el jugador");
                break;
            case 3:
                // procedimiento para modificar un jugador dado el alias
                System.out.println("Modifica jug");
                break;
            case 4:
                // Dado el alias del jugador lo borra de la lista
                System.out.println("Borra el jugador");
                break;
            default:
                System.out.println("valor invalido");
        }
        return op;
    }
}
/*
 * public static void menuJugadores(ArrayList<Jugador> laListaJugadores) {
 * System.out.println(""); }
 * 
 * public static void registrarJugador() { // Pedimos los datos y creamos un
 * ojeto de la clase jugador // Tambien podemos hace que la clase se encargue de
 * la creacion }
 * 
 * }
 */