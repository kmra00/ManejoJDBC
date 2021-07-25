package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {

        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();

        for (Persona persona : personas) {
            System.out.println("persona: " + persona);
        }
        Persona persona = new Persona();
        persona.setNombre("Maria");
        persona.setApellido("Lara");
        persona.setEmail("email@kjldkjlsd.com");
        persona.setTelefono("45546546547");
        
        personaJDBC.insert(persona);
    }
}
