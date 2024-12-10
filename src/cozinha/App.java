package cozinha;

public class App {
    public static void main(String[] args) {
        Forno meuForno = new Forno();

        meuForno.setModelo("ModeloX");
        meuForno.setCapacidadeLitros(45);
        meuForno.setTipoEnergia("Elétrico");

        System.out.println("Modelo: " + meuForno.getModelo());
        System.out.println("Capacidade: " + meuForno.getCapacidadeLitros() + " litros");
        System.out.println("Tipo de Energia: " + meuForno.getTipoEnergia());
        System.out.println("Forno está ligado? " + meuForno.isLigado());

        meuForno.ligar();
        meuForno.ajustarTemperatura(200);
        System.out.println("Temperatura atual: " + meuForno.getTemperatura() + " graus Celsius");

        meuForno.desligar();
        System.out.println("Forno está ligado? " + meuForno.isLigado());
    }
}
