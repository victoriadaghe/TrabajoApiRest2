package org.example.persona;


import org.example.persona.entities.Persona;
import org.example.persona.repositories.PersonaRepository;
import org.example.persona.entities.Domicilio;
import org.example.persona.entities.Localidad;
import org.example.persona.repositories.LocalidadRepository;
import org.example.persona.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaApplication implements CommandLineRunner {

    @Autowired
    private PersonaRepository personaRepository;



    @Autowired
    private LocalidadRepository localidadRepository;


    @Autowired
    private AutorRepository autorRepository;

    public static void main(String[] args) {
        SpringApplication.run(PersonaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Persona persona1 = new Persona();
        persona1.setNombre("Victoria");
        persona1.setApellido("Daghe");
        persona1.setDni(44809333);


        Domicilio domicilio1 = new Domicilio();
        domicilio1.setCalle("Rivadavia");
        domicilio1.setNumero(745);


        Localidad mendoza = new Localidad();
        mendoza.setDenominacion("Mendoza");


        localidadRepository.save(mendoza);


        domicilio1.setLocalidad(mendoza);


        persona1.setDomicilio(domicilio1);


        personaRepository.save(persona1);

    }
}
