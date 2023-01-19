package ec.espe.edu.pruebaparcial2duy.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.espe.edu.pruebaparcial2duy.model.Cliente;
import ec.espe.edu.pruebaparcial2duy.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    private final ClienteService clienteService;
    
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/{cedula}")
    public ResponseEntity<Cliente> findByCedula(@PathVariable("cedula") String cedula) {
        Cliente cliente = this.clienteService.findByCedula(cedula);
        if (cliente != null)
            return ResponseEntity.ok(cliente);
        else 
            return ResponseEntity.notFound().build();
    }
}
