
package modelo;

public class Persona {

	private String apellido;

	private String nombre;

	private int edad;

	//Constructor Vacio
	public Persona() {
	}

	//Constructor Sobrecargado

	public Persona(String apellido, String nombre, int edad) {

		this.apellido = apellido;

		this.nombre = nombre;

		this.edad = edad;

	}

	//Getter and setter

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad() {
		return edad;
	}

}
