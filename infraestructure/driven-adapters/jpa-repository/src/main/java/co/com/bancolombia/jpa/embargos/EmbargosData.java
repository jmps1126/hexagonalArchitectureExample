package co.com.bancolombia.jpa.embargos;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name="Embargos")
@NoArgsConstructor
public class EmbargosData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name="Nombre", length = 500, nullable = false)
    private  String nombre;

    @Column(name="Descripcion", length = 500, nullable = false)
    private  String descripcion;
}
