
import java.util.Scanner;

// Clase base Nombre
class Nombre {
    protected String nombre;
    protected String primerApellido;
    protected String segundoApellido;
    
    // Constructor de la clase Nombre
    public Nombre() {
        this.nombre = "";
        this.primerApellido = "";
        this.segundoApellido = "";
    }
    
    // Función para leer los datos del nombre
    public void Leer_nombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        this.nombre = scanner.nextLine();
        System.out.print("Ingrese el primer apellido: ");
        this.primerApellido = scanner.nextLine();
        System.out.print("Ingrese el segundo apellido: ");
        this.segundoApellido = scanner.nextLine();
    }
    
    // Función para mostrar el nombre completo
    public void mostrar() {
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}

// Clase derivada Dirección que hereda de Nombre
class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;
    
    // Constructor de la clase Direccion
    public Direccion() {
        super();  // Llama al constructor de la clase base
        this.calle = "";
        this.ciudad = "";
        this.provincia = "";
        this.codigoPostal = "";
    }
    
    // Función para ingresar la nueva dirección
    public void nueva_direccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calle: ");
        this.calle = scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        this.ciudad = scanner.nextLine();
        System.out.print("Ingrese la provincia: ");
        this.provincia = scanner.nextLine();
        System.out.print("Ingrese el código postal: ");
        this.codigoPostal = scanner.nextLine();
    }
    
    // Función para cambiar el nombre utilizando Leer_nombre()
    public void nuevo_nombre() {
        Leer_nombre();  // Reutiliza la función de la clase base para cambiar el nombre
    }
    
    // Sobrescribir la función mostrar() para incluir la dirección
    @Override
    public void mostrar() {
        super.mostrar();  // Llama a mostrar() de la clase base para mostrar el nombre
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal);
    }
}

// Clase principal para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion();
        
        // Leer el nombre y la dirección
        direccion.Leer_nombre();
        direccion.nueva_direccion();
        
        // Mostrar el nombre y la dirección
        direccion.mostrar();
    }
}
