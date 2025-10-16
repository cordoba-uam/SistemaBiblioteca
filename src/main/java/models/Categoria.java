package models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "categorias")

public class Categoria {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @ManyToMany
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro[] libros;

    // Constructor vacío
    public Categoria() {

    }
}
