/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gerar
 */

    import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    
    public Biblioteca() {
        this.libros = new ArrayList<>();
    }

    
    public void agregarLibro(Libro libro) {
        libros.add(libro);
        System.out.println("Libro '" + libro.getTitulo() + "' agregado a la biblioteca.");
    }

    
    public void buscarPorTitulo(String titulo) {
        System.out.println("Resultados de búsqueda por título '" + titulo + "':");
        for (Libro libro : libros) {
            if (libro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                libro.mostrarInformacion();
            }
        }
    }

    
    public void buscarPorAutor(String autor) {
        System.out.println("Resultados de búsqueda por autor '" + autor + "':");
        for (Libro libro : libros) {
            if (libro.getAutor().toLowerCase().contains(autor.toLowerCase())) {
                libro.mostrarInformacion();
            }
        }
    }

    
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encontró en la biblioteca.");
    }

    
    public void devolverLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro '" + titulo + "' no se encontró en la biblioteca.");
    }

    
    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (libro.isDisponible()) {
                libro.mostrarInformacion();
            }
        }
    }
}


