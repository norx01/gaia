package gaia.gaia.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuarios
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String documento_id;

    private String tipo_documento;

    private String nombre;

    private String apellido;

    private LocalDate fecha_nacimiento;

    private String correo;

    private String password;

    private String rol;

    private String doc_identidad_maestro_url;

    private String estado;

    private String ficha;
}
