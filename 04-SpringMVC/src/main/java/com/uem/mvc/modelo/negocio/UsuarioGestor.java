package com.uem.mvc.modelo.negocio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uem.mvc.modelo.entidad.Usuario;
import com.uem.mvc.modelo.persistencia.DaoUsuario;

@Service
public class UsuarioGestor {
	@Autowired
	private DaoUsuario daousuario;

	public boolean validar(Usuario usuario) {
		Optional<Usuario> userBBDD = daousuario.findByUsername(usuario.getUsername());
		
		if (!userBBDD.isPresent()) {
			return false;
		}
		
		if (usuario.getPassword().equals(userBBDD.get().getPassword())) {
			return true;
		} else {
			return false;
		}
		
	}
}
