
package saludaplicacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public final class GestorPacientes  {
	
	private final ArrayList<Paciente> pacientes;
	
	public GestorPacientes() {
		pacientes = new ArrayList<>();           
	}
	
	/**
	 * Crea y registra un nuevo paciente.
	 * @return True si se pudo registrar con éxito el nuevo paciente.
	 * False si no fue posible registrarlo.
	 */
	
	
	/**
	 * Lista por pantalla los datos de todos los pacientes registrados.
	 */
	public void mostrarPacientes() {
            pacientes.forEach(p -> {
                p.mostrar();
            });
	}
	
	/**
	 * Modifica el Paciente que el usuario solicite mediante el ID de Paciente.
	 * @return True al finalizar la modificacion correctamente.
	 * False si no se encontró ningun paciente con el ID indicado.
	 */
	public boolean modificarPaciente() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del paciente a modificar:",
				"Modificar Paciente", JOptionPane.QUESTION_MESSAGE);
		/*
		 * Ahora buscaremos el paciente en el ArrayList y si lo encontramos lo referenciaremos
		 * a otro objeto de la clase Paciente que incialmente tiene valor null.
		 * Si tras finalizar la búsqueda, este objeto sigue valiendo null significa que no hemos
		 * encontrado el Paciente que nos han pedido e informaremos al usuario.
		 */
		Paciente paciente = null;
		for (int i = 0; i < pacientes.size(); i++){
			if (pacientes.get(i).getId().equals(id)) {
				paciente = pacientes.get(i);//Referenciamos a otro nombre de objeto
				break;//No hace falta seguir buscando, "rompemos" el bucle for
			}
		}
		
		if (paciente == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra Paciente con el ID:\n" + id,
					"Paciente no encontrado", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			//Comienza el proceso de modificacion
			paciente.setId(JOptionPane.showInputDialog(null, "ID actual: " + paciente.getId()
				+ "\nIntroduzca nuevo identificador:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			paciente.setNombre(JOptionPane.showInputDialog(null, "Nombre actual: " + paciente.getNombre()
				+ "\nIntroduzca nuevo nombre:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			paciente.setApellidos(JOptionPane.showInputDialog(null, "Apellidos actuales: " + paciente.getApellidos()
				+ "\nIntroduzca nuevos apellidos:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			paciente.setGenero(JOptionPane.showInputDialog(null, "Genero actual: " + paciente.getGenero()
				+ "\nIntroduzca nuevo genero:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE));
			try {
				paciente.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Edad actual: " + paciente.getEdad()
				+ "\nIntroduzca nueva edad:", "Modificar Paciente", JOptionPane.QUESTION_MESSAGE)));
			}
			catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Solo se admite introducir numeros para la edad\nNo se ha registrado el valor introducido",
						"Error", JOptionPane.WARNING_MESSAGE);
			}
			return true;
		}
	}
	
	/**
	 * Elimina el Paciente indicado por el usuario mediante el ID del Paciente.
	 * @return True si tuvo éxito la eliminacion.
	 * False si no se encontró el Paciente indicado.
	 */
	public boolean borrarPaciente() {
		String id = JOptionPane.showInputDialog(null, "Introduzca Identificador del paciente a borrar:",
				"Borrar Paciente", JOptionPane.QUESTION_MESSAGE);
		
		Paciente paciente = null;
		for (int i = 0; i < pacientes.size(); i++){
			if (pacientes.get(i).getId().equals(id))
				paciente = pacientes.remove(i);//Al eliminar el objeto, el ArrayList nos lo devuelve y lo recogemos en "paciente"
		}
		
		if (paciente == null) {
			JOptionPane.showMessageDialog(null, "No se encuentra Paciente con el ID:\n" + id,
					"Paciente no encontrado", JOptionPane.WARNING_MESSAGE);
			return false;
		}
		else {
			JOptionPane.showMessageDialog(null, "Se elimino el paciente con ID:\n" + id,
					"Paciente Eliminado", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
	}

}