package models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
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

    // Constructor vacío
    public Libro() {

    }
}
