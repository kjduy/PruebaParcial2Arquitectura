package ec.espe.edu.pruebaparcial2duy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.espe.edu.pruebaparcial2duy.model.Turno;
import ec.espe.edu.pruebaparcial2duy.service.TurnoService;

@RestController
@RequestMapping("/api/turno")
public class TurnoController {

    private final TurnoService turnoService;
    
    public TurnoController(TurnoService turnoService) {
        this.turnoService = turnoService;
    }

    @GetMapping("/cedulaCliente/{cedulaCliente}/nombreCliente/{nombreCliente}")
    public ResponseEntity<Turno> findByCedulaClienteAndNombreCliente(
        @PathVariable("cedulaCliente") String cedulaCliente,
        @PathVariable("nombreCliente") String nombreCliente
    ) {
        Turno turno = this.turnoService.findByCedulaClienteAndNombreCliente(cedulaCliente, nombreCliente);
        if (turno != null)
            return ResponseEntity.ok(turno);
        else 
            return ResponseEntity.notFound().build();
    }

    @GetMapping("/{numeroTurno}")
    public ResponseEntity<Turno> findByNumeroTurno(
        @PathVariable("numeroTurno") Integer numeroTurno
    ) {
        Turno turno = this.turnoService.findByNumeroTurno(numeroTurno);
        if (turno != null)
            return ResponseEntity.ok(turno);
        else 
            return ResponseEntity.notFound().build();
    }
    
}
