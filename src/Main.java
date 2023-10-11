import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setPuertas(10);
        auto1.setColor("Blanco");
        auto1.imprimirColorPuertas(1);


        //auto2.imprimirColorPuertas();

        Duenio duenio1 = new Duenio("Luis","0123456789",30, 'M');
        //duenio1.imprimirDatosDuenio();

        Motor motor1 = new Motor(2.0,"Gasolina");
        motor1.imprimirDatosMotor();
        System.out.println("---------------------------------------------------------");
        auto1.setMotor(motor1);
        auto1.getMotor().imprimirDatosMotor();
        auto1.setDuenio(duenio1);
        auto1.getDuenio().imprimirDatosDuenio();

        System.out.println("---------------------------------------------------------");

        Duenio duenio2 = new Duenio("Juan","9874563210",40,'M');
        Motor motor2 = new Motor(4.0,"Diesel");

        Auto auto2 = new Auto(4,"Rojo",3,motor2,duenio2);
        auto2.imprimirColorPuertas(2);
        auto2.getDuenio().imprimirDatosDuenio();
        auto2.getMotor().imprimirDatosMotor();

        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese en número de ruedas: ");
        int numRuedas = sc.nextInt();
        System.out.println("Ingrese el color del vehículo: ");
        String color = sc.next();
        System.out.println("Ingrese el número de puertas: ");
        int numPuertas = sc.nextInt();
        System.out.println("Ingrese el cilindraje del motor: ");
        double cilindraje = sc.nextDouble();
        System.out.println("Ingrese el tipo de combustible: ");
        String combustible = sc.next();
        Motor motor3 = new Motor(cilindraje,combustible);
        System.out.println("Ingrese el nombre del dueño: ");
        String nombre = sc.next();
        System.out.println("Ingrese la edad del dueño: ");
        int edad = sc.nextInt();
        System.out.println("Ingrese la cedula del dueño: ");
        String cedula = sc.next();
        System.out.println("Ingrese el género del dueño: ");
        char genero = sc.next().charAt(0);
        Duenio duenio3 = new Duenio(nombre,cedula,edad,genero);
        Auto auto3 = new Auto(numRuedas,color,numPuertas,motor3,duenio3);
        auto3.imprimirColorPuertas(3);
        auto3.getMotor().imprimirDatosMotor();
        auto3.getDuenio().imprimirDatosDuenio();

    }
}