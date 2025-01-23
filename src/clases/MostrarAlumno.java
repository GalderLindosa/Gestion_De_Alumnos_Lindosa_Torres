package clases;

public class MostrarAlumno implements IOpcionMenu {
    @Override
    public void ejecutar(GestorAlumnos gestorAlumnos) {
        // Mostrar la lista de alumnos utilizando GestorAlumnos
        gestorAlumnos.listarAlumnos();
    }
}
