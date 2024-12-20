
/**
 * Write a description of class xas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main {
    public static void main(String[] args) {
        // Crear instancias de libros clásicos
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", "9788424922498", 863);
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "9780307474728", 417);
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", "9788498381498", 96);
        Libro libro4 = new Libro("1984", "George Orwell", "9788499890944", 326);
        
        // Crear una copia de Don Quijote
        Libro libro5 = new Libro(libro2);
        
        // Simular algunos préstamos
        libro1.prestarLibro();
        libro3.prestarLibro();
        
        // Imprimir información de todos los libros
        System.out.println("=== CATÁLOGO DE LIBROS ===\n");
        System.out.println("LIBRO 1:");
        System.out.println(libro1.toString());
        System.out.println("\nLIBRO 2:");
        System.out.println(libro2.toString());
        System.out.println("\nLIBRO 3:");
        System.out.println(libro3.toString());
        System.out.println("\nLIBRO 4:");
        System.out.println(libro4.toString());
        System.out.println("\nLIBRO 5 (Copia del Libro 2):");
        System.out.println(libro5.toString());
    }
}
