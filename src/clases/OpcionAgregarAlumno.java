package clases;

import clases.Alumno.GestorAlumnos;

public class OpcionAgregarAlumno implements IOpcionMenu{
	  @Override
	    public void ejecutar(GestorAlumnos gestorAlumnos) {
	        // Solicitar los datos del alumno y agregarlo
	        Alumno nuevoAlumno = new Alumno("Juan", 20);
	        gestorAlumnos.agregarAlumno(nuevoAlumno);
	    }

	@Override
	public void ejecutar(GestorAlumnos gestorAlumnos) {
		// TODO Auto-generated method stub
		
	}

}
