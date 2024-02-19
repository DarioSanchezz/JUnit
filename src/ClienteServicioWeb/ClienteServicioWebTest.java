package ClienteServicioWeb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ClienteServicioWebTest {
    @Test
    void deberiaObtenerInformacionUsuarioExitosamente() {
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);
        when(servicioWebMock.obtenerDatosUsuario("userId")).thenReturn("Informacion del usuario");

        ClienteServicioWeb clienteServicioWeb = new ClienteServicioWeb(servicioWebMock);

        String resultado = clienteServicioWeb.obtenerInformacionUsuario("userId");

        verify(servicioWebMock, times(1)).obtenerDatosUsuario("userId");

        assertEquals("Informacion del usuario", resultado);
    }

    @Test
    void deberiaManejarErrorDelServicioWeb() {
        ServicioWeb servicioWebMock = mock(ServicioWeb.class);
        when(servicioWebMock.obtenerDatosUsuario("userId")).thenThrow(new RuntimeException("Error en el servicio web"));

        ClienteServicioWeb clienteServicioWeb = new ClienteServicioWeb(servicioWebMock);

        String resultado = clienteServicioWeb.obtenerInformacionUsuario("userId");

        verify(servicioWebMock, times(1)).obtenerDatosUsuario("userId");

        assertTrue(resultado.startsWith("Error:"));
    }
}

