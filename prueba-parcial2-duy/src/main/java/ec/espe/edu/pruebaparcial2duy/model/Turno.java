package ec.espe.edu.pruebaparcial2duy.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document(collection = "turnos")
public class Turno {

    @Id
    private String id;
    private Integer numeroTurno;
    private String cedulaCliente;
    private String nombreCliente;
    private String codigoUsuarioEjecutivo;
    private String nombreEjecutivo;
    private Date generacion;
    private Date inicioAtencion;
    private Date finAtencion;
    private Integer calificacion;

    @Version
    private Long version;
    
}
