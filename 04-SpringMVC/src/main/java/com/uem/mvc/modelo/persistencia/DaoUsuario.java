package com.uem.mvc.modelo.persistencia;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.uem.mvc.modelo.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer>{
	public Optional<Usuario> findByUsername(String username);
}
