import java.util.Scanner;

// Clase base Publicacion
class Publicacion {
    protected String titulo;
    protected float precio;

    public Publicacion(String titulo, float precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Precio: " + precio);
    }
}

// Clase derivada Libro
class Libro extends Publicacion {
    private int numeroPaginas;
    private int anioPublicacion;

    public Libro(String titulo, float precio, int numeroPaginas, int anioPublicacion) {
        super(titulo, precio);
        this.numeroPaginas = numeroPaginas;
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de páginas: " + numeroPaginas);
        System.out.println("Año de publicación: " + anioPublicacion);
    }
}

// Clase derivada Disco
class Disco extends Publicacion {
    private float duracion;
    private int precioDisco;

    public Disco(String titulo, int precioDisco, float duracion) {
        super(titulo, precioDisco);  // Asignamos el precio en la clase base
        this.duracion = duracion;
        this.precioDisco = precioDisco;
    }

    @Override
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración en minutos: " + duracion);
        System.out.println("Precio: " + precioDisco);
    }
}

public class Editorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos para un libro
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        System.out.print("Año de publicación: ");
        int anioPublicacion = scanner.nextInt();

        // Crear instancia de Libro
        Libro libro = new Libro(tituloLibro, precioLibro, numeroPaginas, anioPublicacion);

        // Solicitar datos para un disco
        System.out.println("\nIngrese los datos del disco:");
        scanner.nextLine();  // Limpiar buffer
        System.out.print("Título: ");
        String tituloDisco = scanner.nextLine();
        System.out.print("Duración en minutos: ");
        float duracion = scanner.nextFloat();
        System.out.print("Precio: ");
        int precioDisco = scanner.nextInt();

        // Crear instancia de Disco
        Disco disco = new Disco(tituloDisco, precioDisco, duracion);

        // Mostrar los datos
        System.out.println("\nDatos del libro:");
        libro.mostrar();

        System.out.println("\nDatos del disco:");
        disco.mostrar();

        scanner.close();
    }
}

