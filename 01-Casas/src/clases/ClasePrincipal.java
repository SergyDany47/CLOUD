package clases;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClasePrincipal {
	public static ApplicationContext context = null;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("recursos/context.xml");

		List<Habitacion> habitaciones = context.getBean("habitaciones", List.class);
		List<Persona> inquilinos = context.getBean("inquilinos", List.class);

		Persona personaInquilino1 = context.getBean("personaInquilino1", Persona.class);
		Persona personaInquilino2 = context.getBean("personaInquilino2", Persona.class);

		Habitacion habitacion1 = context.getBean("habitacion1", Habitacion.class);
		Habitacion habitacion2 = context.getBean("habitacion2", Habitacion.class);
		Habitacion habitacion3 = context.getBean("habitacion3", Habitacion.class);
		Habitacion habitacion4 = context.getBean("habitacion4", Habitacion.class);

		habitaciones.add(habitacion1);
		habitaciones.add(habitacion2);
		habitaciones.add(habitacion3);
		habitaciones.add(habitacion4);

		inquilinos.add(personaInquilino1);
		inquilinos.add(personaInquilino2);

		Casa c1 = context.getBean("casa1", Casa.class);

		System.out.println(c1);
	}

}
