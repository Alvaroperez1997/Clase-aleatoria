import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Collections;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    private ArrayList<String> alumno;

    private ArrayList<Grupo> parejas;

    /**
     * Constructor for objects of class Clase
     */
    public Clase()
    {
        alumno = new ArrayList<String>();
        parejas = new ArrayList<Grupo>();
        alumno.add("Adeva Tranche, Adrián");
        alumno.add("Aller González, Francisco Javier");
        alumno.add("Álvarez Prieto, Noelia");
        alumno.add("Barrionuevo Pérez, Manuel");
        alumno.add("Bóveda del Río, José Antonio");
        alumno.add("de la Viuda Crespo, Ignacio");
        alumno.add("Encina Maestro, David");
        alumno.add("Felix Nañez, Kevin");
        alumno.add("Fernández Diez, Daniel");
        alumno.add("Fernández González, Javier");
        alumno.add("Fernández Rincón, Jesús");
        alumno.add("Fuentes Álvarez, Francisco José");
        alumno.add("García Juárez, David");
        alumno.add("García Serrano, Rubén");
        alumno.add("González Álvarez, David");
        alumno.add("López Beltrán, Víctor");
        alumno.add("Lora García, Sandra");
        alumno.add("Melcón Diez, Víctor");
        alumno.add("Menéndez Pouso, Francisco José");
        alumno.add("Pérez Bayón, Álvaro");
        alumno.add("Pradera San José, Daniel");
        alumno.add("Prieto Mediavilla, Gabriel");
        alumno.add("Robles González, Miguel Ángel");
        alumno.add("Sánchez Manzano, Adán");
        alumno.add("Serrano García, Verónica");
        alumno.add("Tascón González, Anibal");
    }

    /**
     * Empareja a los alumnos aleatoriamente
     */
    public void emparejarAlumnos()
    {
        int contador = 0;
        Collections.shuffle(alumno);
        for (String alumnos : alumno) {
            while (contador == 0) {
                contador++;
                Grupo.alumnosEmparejados.add(alumno);
            }
            contador = 0;
        }
    }
    
    /**
     * Tamaño de la lista
     */
    public int numeroAlumnos() {
        return alumno.size();
    }
}