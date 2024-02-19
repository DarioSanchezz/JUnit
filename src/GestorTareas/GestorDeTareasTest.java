package GestorTareas;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    private GestorDeTareas gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        // Agregar algunas tareas predeterminadas para cada prueba
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
        gestor.agregarTarea("Tarea 3");
    }

    @AfterEach
    public void tearDown() {
        // Limpiar las tareas después de cada prueba
        gestor.limpiarTareas();
    }

    @Test
    public void testAgregarTarea() {
        gestor.agregarTarea("Nueva tarea");
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(4, tareas.size());
        assertTrue(tareas.contains("Nueva tarea"));
    }

    @Test
    public void testEliminarTarea() {
        assertTrue(gestor.eliminarTarea("Tarea 2"));
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(2, tareas.size());
        assertFalse(tareas.contains("Tarea 2"));
    }

    @Test
    public void testObtenerTareas() {
        List<String> tareas = gestor.obtenerTareas();
        assertEquals(3, tareas.size());
        assertTrue(tareas.contains("Tarea 1"));
        assertTrue(tareas.contains("Tarea 2"));
        assertTrue(tareas.contains("Tarea 3"));
    }
}

