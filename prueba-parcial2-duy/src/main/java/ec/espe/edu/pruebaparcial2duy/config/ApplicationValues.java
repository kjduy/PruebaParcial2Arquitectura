package ec.espe.edu.pruebaparcial2duy.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
public class ApplicationValues {

    private final String mongoHost;
    private final String mongoDB;
    private final String mongoUsr;
    private final String mongoPwd;
    private final String mongoAut;


    @Autowired
    public ApplicationValues(@Value("${pruebaparcial2duy.mongo.host}") String mongoHost,
            @Value("${pruebaparcial2duy.mongo.db}") String mongoDB,
            @Value("${pruebaparcial2duy.mongo.usr}") String mongoUsr,
            @Value("${pruebaparcial2duy.mongo.pwd}") String mongoPwd, 
            @Value("${pruebaparcial2duy.mongo.aut}") String mongoAut 
    ) {
        this.mongoHost = mongoHost;
        this.mongoDB = mongoDB;
        this.mongoUsr = mongoUsr;
        this.mongoPwd = mongoPwd;
        this.mongoAut = mongoAut;
    }
}
