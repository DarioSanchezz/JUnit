package GestorDeTareas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {

    GestorDeTareas gestor;

    @BeforeEach
    void setUp() {
        gestor = new GestorDeTareas();
    }

    @Nested
    class AgregarTareaTest {

        @Test
        void deberiaAgregarTareaCorrectamente() {
            gestor.agregarTarea("1", "Tarea 1");
            assertTrue(gestor.buscarTareaPorId("1").isPresent());
        }

        @Test
        void noDeberiaAgregarTareaConIdExistente() {
            gestor.agregarTarea("1", "Tarea 1");
            assertFalse(gestor.agregarTarea("1", "Tarea 2"));
        }
    }

    @Nested
    class EliminarTareaTest {

        @Test
        void deberiaEliminarTareaExistente() {
            gestor.agregarTarea("1", "Tarea 1");
            assertTrue(gestor.eliminarTarea("1"));
        }

        @Test
        void noDeberiaEliminarTareaInexistente() {
            assertFalse(gestor.eliminarTarea("1"));
        }
    }

    @Nested
    class BuscarTareaPorIdTest {

        @Test
        void deberiaEncontrarTareaExistente() {
            gestor.agregarTarea("1", "Tarea 1");
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Tarea 1", descripcion.get());
        }

        @Test
        void noDeberiaEncontrarTareaInexistente() {
            Optional<String> descripcion = gestor.buscarTareaPorId("1");
            assertFalse(descripcion.isPresent());
        }
    }
}

