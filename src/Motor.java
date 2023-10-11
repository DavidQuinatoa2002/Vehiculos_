public class Motor {

    private double cilindraje=0;
    private String combustible="";


    public Motor(double cilindraje, String combustible) {
        this.cilindraje = cilindraje;
        this.combustible = combustible;
    }

    public double caballosFuerza(){
        double cf=0;
        if(combustible.equals("Diesel")){
            cf=10.5;
        }else{
            cf=5.2;
        }
        return cf;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    public void imprimirDatosMotor(){
        System.out.println("El cilindraje del motor es: "+cilindraje);
        System.out.println("El tipo de combustible del motor es: "+combustible);
    }
}
