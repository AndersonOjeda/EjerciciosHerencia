package jerarquia;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cilindro cilindro = new Cilindro(3, 7);
        CilindroHueco cilindroHueco = new CilindroHueco(4, 2, 6);

        System.out.println("Círculo - Longitud: " + circulo.getLongitud() + ", Área: " + circulo.getArea());
        System.out.println("Cilindro - Área: " + cilindro.getArea() + ", Volumen: " + cilindro.getVolumen());
        System.out.println("Cilindro Hueco - Longitud: " + cilindroHueco.getLongitud() + 
                           ", Área: " + cilindroHueco.getArea() + ", Volumen: " + cilindroHueco.getVolumen());
    }
}