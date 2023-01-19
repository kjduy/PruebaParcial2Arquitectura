package ec.espe.edu.pruebaparcial2duy.repository;

import org.springframework.data.repository.CrudRepository;

import ec.espe.edu.pruebaparcial2duy.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

    public Cliente findByCedula(String cedula);
    
}
