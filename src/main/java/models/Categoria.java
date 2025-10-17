package models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "Categorias")
public class Categoria {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    // Constructor vacío
    public Categoria() {

    }
}
