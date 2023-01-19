package ec.espe.edu.pruebaparcial2duy.repository;

import org.springframework.data.repository.CrudRepository;

import ec.espe.edu.pruebaparcial2duy.model.Turno;

public interface TurnoRepository extends CrudRepository<Turno, String> {

    public Turno findByCedulaClienteAndNombreCliente(String cedulaCliente, String nombreCliente);
    public Turno findByNumeroTurno(Integer numeroTurno);
    public Turno findByCedulaClienteAndNumeroTurnoAndCalifacacion(String cedulaCliente, Integer numeroTurno, Integer calificacion);
    public void updateByNumeroTurnoAndCodigoUsuarioEjectutivo(Turno turno, String cedulaCliente, String codigoUsuarioEjecutivo);
    
}
