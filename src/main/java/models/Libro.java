package models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Libros")
public class Libro {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLibro;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "año_publicacion")
    private int yearPublicacion;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private Autor autor;

    @ManyToMany
    @JoinTable(
            name = "Libros_Categorias",
            joinColumns = @JoinColumn(name = "id_libro"),
            inverseJoinColumns = @JoinColumn(name = "id_categoria")
    )
    private List<Categoria> categoria = new ArrayList<>();

    // Constructor vacío
    public Libro() {

    }
}
