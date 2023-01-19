package ec.espe.edu.pruebaparcial2duy.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "ejecutivos")
public class Ejecutivo {
    
    @Id
    private String id;
    private String codigoUsuario;
    private String nombreCompleto;
    private Integer numeroEscritorioAsignado;

    @Version
    private Long version;

}
