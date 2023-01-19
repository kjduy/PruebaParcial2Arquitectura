package ec.espe.edu.pruebaparcial2duy.service;

import org.springframework.stereotype.Service;

import ec.espe.edu.pruebaparcial2duy.model.Cliente;
import ec.espe.edu.pruebaparcial2duy.repository.ClienteRepository;

@Service
public class ClienteService {
    
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente findByCedula(String cedula) {
        return clienteRepository.findByCedula(cedula);
    }

}
