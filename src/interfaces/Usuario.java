package interfaces;


class Usuario implements imprimible {
    private String nombre;
	private String apellido;
	private String id;

	public Usuario(String nombre, String apellido) {
        this.id = java.util.UUID.randomUUID().toString();
        this.nombre = nombre;
        this.apellido = apellido;
    }
	
	public void imprimir() {
		System.out.println(this);
	}
	public String toString(){
		return "implementacion";
		
	}
}


