package com.uem.mvc.controlador;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.uem.mvc.modelo.entidad.Usuario;
import com.uem.mvc.modelo.negocio.UsuarioGestor;

@Controller
public class UsuarioControlador {
	@Autowired
	private UsuarioGestor usuarioGestor;

	@GetMapping("login")
	public String greeting() {
		return "login.html";
	}

	@PostMapping("doLogin")
	public String login(@RequestParam("nombre") String username, @RequestParam("pass") String password, Model model) {
		Usuario usuario = new Usuario();
		usuario.setUsername(username);
		usuario.setPassword(password);
		boolean validado = usuarioGestor.validar(usuario);

		if (validado) {
			model.addAttribute("nombre", username);
			model.addAttribute("fecha", new Date());
			model.addAttribute("lista", usuario);
			ArrayList<String> lista = new ArrayList();
			lista.add("Hola");
			lista.add("Adios");
			model.addAttribute("listas", lista);
			return "inicio.html";
		} else {
			return "errorLogin.html";
		}
	}
}
