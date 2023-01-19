package ec.espe.edu.pruebaparcial2duy.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cuenta {

    private Integer numeroCuenta;
    private String tipoCuenta;
    private Number saldoPromedio;
    
}
