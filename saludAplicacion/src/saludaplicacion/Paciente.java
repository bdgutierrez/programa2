
package saludaplicacion;

public final class Paciente {
	
	private String id;
	private String nombre;
	private String apellidos;
	private int edad;
	private String genero;
        private String direccion;
        private String fecha;
        private String medico;
        private String atencion;
	private String motivo;
	
	public Paciente(String id, String nombre, String apellidos, int edad, String genero,String direccion, String fecha, String medico, String atencion,String motivo) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.genero = genero;
                this.atencion = atencion;
                this.direccion = direccion;
                this.fecha=fecha;
                this.medico=medico;
                this.motivo=motivo;
	}

    Paciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void mostrar() {
		System.out.println("\n\t---------------");
		System.out.println("ID Paciente: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Edad: " + edad);
		System.out.println("Genero: " + genero);
                System.out.println("Lugar de atencion: " + atencion);
                System.out.println("Direccion: " + direccion);
                System.out.println("Fecha: " + fecha);
                System.out.println("Medico: " + medico);
                System.out.println("Motivo: " + motivo);
		System.out.println("\t---------------");
	}
}