/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */

    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Agregar algunos libros de ejemplo
        biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967, "Realismo Mágico"));
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 1949, "Distopía"));
        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 1605, "Novela"));
        
        do {
            System.out.println("\n--- Menú de la Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Buscar libro por título");
            System.out.println("3. Buscar libro por autor");
            System.out.println("4. Prestar libro");
            System.out.println("5. Devolver libro");
            System.out.println("6. Mostrar libros disponibles");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer de entrada
            
            switch (opcion) {
                case 1:
                    System.out.print("Introduce el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Introduce el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Introduce el año de publicación: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Introduce el género del libro: ");
                    String genero = scanner.nextLine();
                    biblioteca.agregarLibro(new Libro(titulo, autor, anio, genero));
                    break;
                case 2:
                    System.out.print("Introduce el título a buscar: ");
                    String buscarTitulo = scanner.nextLine();
                    biblioteca.buscarPorTitulo(buscarTitulo);
                    break;
                case 3:
                    System.out.print("Introduce el autor a buscar: ");
                    String buscarAutor = scanner.nextLine();
                    biblioteca.buscarPorAutor(buscarAutor);
                    break;
                case 4:
                    System.out.print("Introduce el título del libro a prestar: ");
                    String tituloPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(tituloPrestar);
                    break;
                case 5:
                    System.out.print("Introduce el título del libro a devolver: ");
                    String tituloDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(tituloDevolver);
                    break;
                case 6:
                    biblioteca.mostrarLibrosDisponibles();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 7);

        scanner.close();
    }
}


