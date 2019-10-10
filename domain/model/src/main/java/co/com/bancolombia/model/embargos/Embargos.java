package co.com.bancolombia.model.embargos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Embargos {

    private final Long id;
    private final String nombre;
    private final String descripcion;


}
