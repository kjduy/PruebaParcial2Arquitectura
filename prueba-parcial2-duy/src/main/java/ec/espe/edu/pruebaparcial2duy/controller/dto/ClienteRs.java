package ec.espe.edu.pruebaparcial2duy.controller.dto;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClienteRs implements Serializable {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String direccionPrincipal;
    private String telefono;
    private String correoElectronico;
    
}
