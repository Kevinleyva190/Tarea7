public class Main {
    public static void main(String[] args) {
        Camion camion=new Camion("Dieses",30);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.encender();
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("-----Moto-----");
        Moto moto=new Moto(150,"yamaha");
        System.out.println(moto);
        moto.encender();
        moto.avanzar();
        moto.hacerCaballito();
        moto.frenar();
        moto.apagar();
    }
}