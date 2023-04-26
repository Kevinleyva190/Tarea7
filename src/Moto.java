public class Moto implements vehiculo{
    private int centimetroscubicos;
    private String marca;

    public Moto() {
    }

    public Moto(int centimetroscubicos, String marca) {
        this.centimetroscubicos = centimetroscubicos;
        this.marca = marca;
    }

    public int getCentimetroscubicos() {
        return centimetroscubicos;
    }

    public void setCentimetroscubicos(int centimetroscubicos) {
        this.centimetroscubicos = centimetroscubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "centimetroscubicos=" + centimetroscubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un caballito");
    }

    @Override
    public boolean encender(){
        System.out.println("Encendiendo moto marca: "+ this.marca );
        return false;
    }

    @Override
    public boolean apagar() {
        System.out.println("Apagando moto marca: "+ this.marca );
        return false;
    }

    @Override
    public boolean avanzar() {
        System.out.println("Avanzando moto de: "+this.centimetroscubicos );
        return false;
    }

    @Override
    public boolean frenar() {
        System.out.println("frenando moto de: "+this.centimetroscubicos );
        return false;
    }

}
