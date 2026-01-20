import java.util.Scanner;
import model.Radio;
import model.RadioCar;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Radio radio = new RadioCar(); 
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- RADIO ---");
            System.out.println("1. Encender radio");
            System.out.println("2. Apagar radio");
            System.out.println("3. Cambiar modo AM/FM");
            System.out.println("4. Subir frecuencia");
            System.out.println("5. Bajar frecuencia");
            System.out.println("6. Guardar frecuencia en boton");
            System.out.println("7. Seleccionar boton");
            System.out.println("8. Mostrar estado");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    radio.turnOn();
                    System.out.println("Radio encendida");
                    break;

                case 2:
                    radio.turnOff();
                    System.out.println("Radio apagada");
                    break;

                case 3:
                    if (radio.getMode().equals("FM")) {
                        radio.changeMode("AM");
                    } else {
                        radio.changeMode("FM");
                    }
                    System.out.println("Modo actual: " + radio.getMode());
                    break;

                case 4:
                    System.out.println("Frecuencia: " + radio.levelUpFrequency());
                    break;

                case 5:
                    System.out.println("Frecuencia: " + radio.levelDownFrequency());
                    break;

                case 6:
                    System.out.print("Ingrese boton (1-12): ");
                    int saveButton = scanner.nextInt();
                    radio.saveFrequency(saveButton, radio.getFrequency(), radio.getMode());
                    System.out.println("Frecuencia guardada");
                    break;

                case 7:
                    System.out.print("Ingrese boton (1-12): ");
                    int selectButton = scanner.nextInt();
                    float freq = radio.selectFrecuency(selectButton);
                    System.out.println("Frecuencia actual: " + freq);
                    break;

                case 8:
                    System.out.println("Encendida: " + radio.isOn());
                    System.out.println("Modo: " + radio.getMode());
                    System.out.println("Frecuencia: " + radio.getFrequency());
                    break;

                case 9:
                    exit = true;
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }

        scanner.close();
    }
}

