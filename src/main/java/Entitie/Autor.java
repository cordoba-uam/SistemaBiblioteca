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
@Table(name = "autores")
public class Autor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "nacionalidad")
    private String nacionalidad;

    @Override
    public String toString() {
        return "Datos del Autor: " +
                "\nID: " + id +
                "\nNombre: " + nombre +
                "\nNacionalidad: " + nacionalidad +
                "\n============================================";
    }
}
