package Punto1;

public class MutableClassCar {
    private String marca;
    private String modelo;
    private Integer cilindraje;
    private boolean isElectric;

    public MutableClassCar(String marca, String modelo, Integer cilindraje, boolean isElectric) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
        this.isElectric = isElectric;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getCilindraje() {
        return cilindraje;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindraje(Integer cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
