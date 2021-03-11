package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Arma;
import modelo.entidad.Espada;
import modelo.entidad.Guerrero;
import modelo.entidad.Healer;
import modelo.entidad.Hechizo;
import modelo.entidad.Mago;
import modelo.entidad.Personaje;
import modelo.entidad.Rezo;
import modelo.entidad.Util;
import modelo.negocio.Arena;

public class MainVideojuego {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("recursos/context.xml");

		Personaje p1 = context.getBean("guerrero", Guerrero.class);
		Arma espada = context.getBean("espada", Espada.class);
		Personaje p2 = context.getBean("mago", Mago.class);
		Arma hechizo = context.getBean("hechizo", Hechizo.class);

		espada.setDañoMaximo(25);
		espada.setDañoMinimo(10);

		p1.setNombre("Conan");
		p1.setNivel(3);
		p1.setPuntosVida(150);
		p1.setIniciativa(5);
		p1.setArma(espada);

		hechizo.setDañoMaximo(20);
		hechizo.setDañoMinimo(5);

		p2.setNombre("Scooby");
		p2.setNivel(5);
		p2.setPuntosVida(150);
		p2.setIniciativa(4);
		p2.setArma(hechizo);

		Arena arena = new Arena(p1, p2);
		Personaje pg = arena.combate();

		System.out.println("Personaje ganador!!" + pg.getNombre());

	}

}
