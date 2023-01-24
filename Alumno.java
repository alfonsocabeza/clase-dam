public class Alumno {

    // el nombre completo del alumno
    private String nombre;
    // el numero de matricula
    private String numeroMatricula;
    // la edad del alumno
    private int edad;

    /**
     * Crea un alumno nuevo
     */
    public Alumno(String nombreCompleto, String numeroMatriculaAlumno, int edadAlumno) {
        nombre = nombreCompleto;
        numeroMatricula = numeroMatriculaAlumno;
        edad = edadAlumno;

    }

    /**
     * Devuelve el nombre completo del alumno
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Cambia el nombre del alumno
     */
    public void cambiarnombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    /**
     * Imprime por pantalla los detalles del alumno
     */
    public void imprimeDetalles() {
        System.out.println(nombre + " (" + numeroMatricula + ") - " + edad + " años");
    }

    /**
     * Devuelve el nombre de usuario que el alumno debe configurar
     * en su cuenta de Github en formato de 7 caracateres
     */
    public String getNombreUsuarioGithub() {
        String github = "a";
        if (nombre.length() < 3){
            //la longitud del nombre  es menor que tres 
            if (numeroMatricula.length() < 4){
                //la longitud de la matricula  es menor que cuatro 
                github = nombre + numeroMatricula;
            }
            else {
                github =  nombre + numeroMatricula.substring(0, 4); 
            }
        }  
        else{
            if (numeroMatricula.length() < 4){
                github =  nombre.substring(0, 3) + numeroMatricula;
            }
            else{
                github =  nombre.substring(0, 3) + numeroMatricula.substring(0, 4);
            }
        }      
        return github;  
    }
}
