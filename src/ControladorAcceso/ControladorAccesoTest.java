package ControladorAcceso;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorAccesoTest {

    private final ControladorAcceso controlador = new ControladorAcceso();

    @Test
    void verificarAcceso_UsuarioAdmin_GestionUsuarios_AccesoPermitido() {
        assertTrue(controlador.verificarAcceso("admin", "GESTION_USUARIOS"));
    }

    @Test
    void verificarAcceso_UsuarioEditor_GestionUsuarios_AccesoDenegado() {
        assertFalse(controlador.verificarAcceso("editor", "GESTION_USUARIOS"));
    }

    @Test
    void verificarAcceso_UsuarioEditor_OtraFuncionalidad_AccesoPermitido() {
        assertTrue(controlador.verificarAcceso("editor", "OTRA_FUNCIONALIDAD"));
    }

    @Test
    void verificarAcceso_UsuarioVisitante_Consulta_AccesoPermitido() {
        assertTrue(controlador.verificarAcceso("visitante", "CONSULTA"));
    }

    @Test
    void verificarAcceso_UsuarioVisitante_OtraFuncionalidad_AccesoDenegado() {
        assertFalse(controlador.verificarAcceso("visitante", "OTRA_FUNCIONALIDAD"));
    }

    @Test
    void verificarAcceso_UsuarioSinRolAsignado_AccesoDenegado() {
        assertFalse(controlador.verificarAcceso("sin_rol", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void verificarAcceso_UsuarioConRolDesconocido_AccesoDenegado() {
        assertFalse(controlador.verificarAcceso("rol_desconocido", "CUALQUIER_FUNCIONALIDAD"));
    }
}

