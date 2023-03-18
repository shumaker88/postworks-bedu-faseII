package org.bedu.java.backend.e5;

import org.bedu.java.backend.e5.model.Persona;
import org.bedu.java.backend.e5.service.PhoneFormatter;
import org.bedu.java.backend.e5.service.PhoneValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class E5Application implements CommandLineRunner {

	private final PhoneValidator phoneValidator;
	private final PhoneFormatter phoneFormatter;

	@Autowired
	public E5Application(PhoneValidator validator, PhoneFormatter formatter) {
		this.phoneValidator = validator;
		this.phoneFormatter = formatter;
	}
	public static void main(String[] args) {
		SpringApplication.run(E5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduzca su nombre: ");
		String nombre = scanner.nextLine();
		System.out.print("\nIngrese su numero telefonico: ");
		String telefono = scanner.nextLine();

		if(phoneValidator.isValid(telefono)) {
			telefono = phoneValidator.cleanNumber(telefono);
			telefono = phoneFormatter.getFormat(telefono);

			Persona persona = new Persona(nombre, telefono);
			System.out.println("Nombre de la persona: " + persona.getNombre());
			System.out.println("Telefono de la persona: " + persona.getTelefono());
		} else {
			System.out.println("El numero introducido es incorrecto!!!");
		}
	}
}
