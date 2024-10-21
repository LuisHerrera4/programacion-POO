package Cotxes;

public class Cotxes {
    private String marca;
    private String modelo;
    private String matricula;
    private int potencia;
    private int cilindrada;

    public Cotxes(String marca, String modelo, String matricula, int potencia, int cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }




}
