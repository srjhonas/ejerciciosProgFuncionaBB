package Punto1;

public final class InmutableClassCar {
    private final String marca;
    private final String modelo;
    private final Integer cilindraje;
    private final boolean isElectric;

    public InmutableClassCar(String marca, String modelo, Integer cilindraje, boolean isElectric) {
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
}
