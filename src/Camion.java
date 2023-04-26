import java.util.regex.Matcher;

public class Camion implements vehiculo{
    private String combustibles;
    private double peso;

    public Camion() {
    }

    public Camion(String combustibles, double peso) {
        this.combustibles = combustibles;
        this.peso = peso;
    }

    public String getCombustibles() {
        return combustibles;
    }

    public void setCombustibles(String combustibles) {
        this.combustibles = combustibles;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "combustibles='" + combustibles + '\'' +
                ", peso=" + peso +
                '}';
    }
    public void transportar(){
        System.out.println("Transportando algo...");
    }

    @Override
    public boolean encender() {
        System.out.println("encendiendo el camion combustible "+ this.combustibles);
        return Math.random()>0.05;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando el camion combustible "+ this.combustibles);
        return Math.random()>0.02;
    }

    @Override
    public boolean avanzar() {
        System.out.println("El camion esta avanzando ");
        return false;
    }

    @Override
    public boolean frenar() {
        System.out.println("frenando...");
        return false;
    }
}
