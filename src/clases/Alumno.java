package clases;
import java.util.ArrayList;
import java.util.List;
public class Alumno {
    private String nombre;
    private int edad;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }


    public class GestorAlumnos {
        private List<Alumno> alumnos = new ArrayList<>();

        public void añadirAlumno(Alumno alumno) {
            alumnos.add(alumno);
            System.out.println("Alumno añadido: " + alumno);
        }

        public List<Alumno> getAlumnos() {
            return alumnos;
        }
    }

    
}
