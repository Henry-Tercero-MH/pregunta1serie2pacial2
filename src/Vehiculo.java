public class Vehiculo {
    private String color;
    private String modelo;
    private String marca;
    private String nPlaca;

    public Vehiculo() {
    }

    public Vehiculo(String color, String modelo, String marca, String nPlaca) {
        this.color = color;
        this.modelo = modelo;
        this.marca = marca;
        this.nPlaca = nPlaca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(String nPlaca) {
        this.nPlaca = nPlaca;
    }
}
