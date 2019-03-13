package ejercicio01;

public class Piloto {
	private String Nombre;
	private String Apellido;
	public boolean leGustaVolar;
	public int cantidadDeChoques;
	
	public Piloto(String nombre, String apellido, boolean volar, int cantChoques) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.leGustaVolar = volar;
		this.cantidadDeChoques = cantChoques;
	}
	
	public String toString(){
		return "Nombre: " + Nombre + " / " + "Apellido: " + Apellido;
	}
	
}
