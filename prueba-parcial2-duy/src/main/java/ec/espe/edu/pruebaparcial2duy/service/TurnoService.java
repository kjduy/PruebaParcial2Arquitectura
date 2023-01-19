package ec.espe.edu.pruebaparcial2duy.service;

import java.util.Date;

import org.springframework.transaction.annotation.Transactional;

import ec.espe.edu.pruebaparcial2duy.model.Turno;
import ec.espe.edu.pruebaparcial2duy.repository.TurnoRepository;

public class TurnoService {
    
    private final TurnoRepository turnoRepository;

    public TurnoService(TurnoRepository turnoRepository) {
        this.turnoRepository = turnoRepository;
    }

    public Turno findByCedulaClienteAndNombreCliente(String cedulaCliente, String nombreCliente) {
        return turnoRepository.findByCedulaClienteAndNombreCliente(cedulaCliente, nombreCliente);
    }

    public Turno findByNumeroTurno(Integer numeroTurno) {
        Turno turno = turnoRepository.findByNumeroTurno(numeroTurno);
        Date fechaYHoraActual = new Date();
        turno.setFinAtencion(fechaYHoraActual);
        return turno;
    }

    public Turno findByCedulaClienteAndNumeroTurnoAndCalifacacion(String cedulaCliente, Integer numeroTurno, Integer calificacion) {
        return turnoRepository.findByCedulaClienteAndNumeroTurnoAndCalifacacion(cedulaCliente, numeroTurno, calificacion);
    }

    @Transactional
    public void createTurno(Turno turno) {
        Turno turnoTemporal = turnoRepository.findByCedulaClienteAndNombreCliente(turno.getCedulaCliente(), turno.getNombreCliente());
        Integer numeroTurno = turnoTemporal.getNumeroTurno();
        turno.setNumeroTurno(numeroTurno+1);
        this.turnoRepository.save(turno);
    }

}
