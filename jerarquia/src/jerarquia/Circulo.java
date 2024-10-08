package jerarquia;

public class Circulo {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getLongitud() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }
}