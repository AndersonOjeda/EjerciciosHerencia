package jerarquia;

public class CilindroHueco extends Cilindro {
    private double radioInterno;

    public CilindroHueco(double radioExterno, double radioInterno, double altura) {
        super(radioExterno, altura);
        this.radioInterno = radioInterno;
    }

    @Override
    public double getLongitud() {
        return 2 * Math.PI * (radio + radioInterno) + 2 * super.getLongitud();
    }

    @Override
    public double getArea() {
        return 2 * Math.PI * (radio * radio - radioInterno * radioInterno) + 
               2 * Math.PI * (radio + radioInterno) * altura;
    }

    @Override
    public double getVolumen() {
        return Math.PI * (radio * radio - radioInterno * radioInterno) * altura;
    }
}
