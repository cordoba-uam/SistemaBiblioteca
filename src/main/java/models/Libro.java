package models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

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
            name = "Categoria_Libro",
            joinColumns = @JoinColumn(name = "id_categoria"),
            inverseJoinColumns = @JoinColumn(name = "id_libro")
    )
    private List<Categoria> categoria;


    // Constructor vacío
    public Libro() {

    }
}
