package gabriela.ucacue.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import gabriela.ucacue.modelo.Persona;



public interface PersonaRepositorio  extends JpaRepository<Persona, Integer>{
	
	@Query("select p from Persona p where p.nombre like %:nombre%")
	List<Persona> findAllByNombre(String nombre);

}

