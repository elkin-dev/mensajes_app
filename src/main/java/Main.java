import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("----------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. crear un mensajes");
            System.out.println("2. listar mensajes");
            System.out.println("3. editar mensajes");
            System.out.println("4. eliminar mensaje");
            System.out.println("5. salir");
            // Leemos la opcion que ingresa el usuario
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                default:
                    break;
            }

        } while (opcion != 5);


    }
}
