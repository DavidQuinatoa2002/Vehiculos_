public class Duenio {
    private String nombre;
    private String cedula;
    private int edad;

    private char genero;

    public Duenio(String nombre, String cedula, int edad, char genero) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.genero = genero;
    }

    public String esMayorEdad(){
        String my="";
        if(edad>=18){
            my="Es mayor de edad";
            System.out.println(my);
        }else{
            my="Es menor de edad";
            System.out.println(my);
        }
        return my;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }


    public void imprimirDatosDuenio(){
        System.out.println("El nombre del duenio es: "+nombre);
        System.out.println("La cedula del duenio es: "+cedula);
        System.out.println("La edad del duenio es: "+edad);
        System.out.println("El genero del duenio es: "+genero);

    }
}
