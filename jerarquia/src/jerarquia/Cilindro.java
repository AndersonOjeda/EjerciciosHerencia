package jerarquia;

public class Cilindro extends Circulo {
    protected double altura;  // Cambiado a protected para permitir acceso desde subclases

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return 2 * super.getArea() + getLongitud() * altura;
    }

    public double getVolumen() {
        return super.getArea() * altura;
    }
}