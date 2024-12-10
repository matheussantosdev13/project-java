package cozinha;

public class Forno {
    private boolean ligado;
    private int temperatura;
    private String modelo;
    private int capacidadeLitros;
    private String tipoEnergia;

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeLitros() {
        return capacidadeLitros;
    }

    public void setCapacidadeLitros(int capacidadeLitros) {
        this.capacidadeLitros = capacidadeLitros;
    }

    public String getTipoEnergia() {
        return tipoEnergia;
    }

    public void setTipoEnergia(String tipoEnergia) {
        this.tipoEnergia = tipoEnergia;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O forno foi ligado.");
        } else {
            System.out.println("O forno já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            temperatura = 0; 
            System.out.println("O forno foi desligado.");
        } else {
            System.out.println("O forno já está desligado.");
        }
    }

    public void ajustarTemperatura(int novaTemperatura) {
        if (ligado) {
            if (novaTemperatura >= 50 && novaTemperatura <= 300) {
                temperatura = novaTemperatura;
                System.out.println("Temperatura ajustada para " + temperatura + " graus Celsius.");
            } else {
                System.out.println("Erro: Temperatura fora do intervalo permitido (50-300 graus).");
            }
        } else {
            System.out.println("Erro: Não é possível ajustar a temperatura com o forno desligado.");
        }
    }
}
