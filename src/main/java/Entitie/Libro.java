package Entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table(name = "libros")

public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "Año")
    private Integer año;

    @Column(name = "Unidades")
    private Integer unidades;

    @Column(name = "libros_prestados")
    private Integer libros_prestados;

    @Column(name = "Libros_restantes")
    private Integer libros_restantes;

    @Column(name = "alta")
    private Boolean alta;

    @Override
    public String toString() {
        return "Datos del Libro: " +
                "\nID: " + id +
                "\nTitulo: " + titulo +
                "\nAño: " + año +
                "\nEjemplares: " + unidades +
                "\nEjemplares Prestados: " +  libros_prestados +
                "\nEjemplares Restantes: " +  libros_restantes +
                "\nAlta: " + alta +
                "\n============================================";
    }
}
