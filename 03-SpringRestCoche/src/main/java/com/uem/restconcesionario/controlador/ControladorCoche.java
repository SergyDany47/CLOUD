package com.uem.restconcesionario.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.uem.restconcesionario.modelo.entidad.Coche;



@RestController
public class ControladorCoche {
	
	@Autowired
	private Environment environment;

	@Autowired
	private GestorCoche gestorCoche;

	@GetMapping("coches")
	public ResponseEntity<List<Coche>> listar() {

		List<Coche> lista = gestorCoche.listar();

		return new ResponseEntity<List<Coche>>(lista, HttpStatus.OK);
	}

	@PostMapping("coches")
	public ResponseEntity<Coche> alta(@RequestBody Coche coche) {

		Coche cocheNuevo = gestorCoche.alta(coche);

		HttpStatus respuesta = null;

		if (cocheNuevo != null) {
			respuesta = HttpStatus.CREATED;
		} else {
			respuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Coche>(cocheNuevo, respuesta);
	}

	@GetMapping("coches/{id}")
	public ResponseEntity<Coche> obtener(@PathVariable("id") int id) {

		Coche consultaCoche = gestorCoche.consultar(id);

		HttpStatus respuesta = null;

		if (consultaCoche != null) {
			respuesta = HttpStatus.OK;
		} else {
			respuesta = HttpStatus.NOT_FOUND;
		}

		return new ResponseEntity<Coche>(consultaCoche, respuesta);
	}

	@PutMapping("coches/{id}")
	public ResponseEntity<Coche> modificar(@RequestBody Coche coche, @PathVariable("id") int id) {

		coche.setId(id);

		Coche cocheModificado = gestorCoche.modificar(coche);

		HttpStatus respuesta = null;

		if (cocheModificado != null) {
			respuesta = HttpStatus.OK;
		} else {
			respuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Coche>(cocheModificado, respuesta);
	}

	@DeleteMapping("coches/{id}")
	public ResponseEntity<Integer> borrar(@PathVariable("id") int id) {
	
		boolean cocheBorrado = gestorCoche.borrar(id);

		HttpStatus respuesta = null;

		if (cocheBorrado) {
			respuesta = HttpStatus.OK;
		} else {
			respuesta = HttpStatus.BAD_REQUEST;
		}

		return new ResponseEntity<Integer>(id, respuesta);
	}
}