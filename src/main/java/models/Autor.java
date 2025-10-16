package models;

import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
public class Autor {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "nacionalidad", nullable = false)
    private String nacionalidad;

    @Column(name = "fecha_nacimiento", nullable = false)
    private String fechaNacimiento;

    @OneToMany
    @JoinColumn(name = "id_libro", nullable = false)
    private Libro[] libros;

    // Constructor vacío
    public Autor() {

    }
}
