package co.edu.uniquindio;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class VehiculoMilitarTest {

    private TransporteTropas transporte;
    private Blindado blindado;
    private Apoyo apoyo;

    @BeforeEach
    void iniciar() {
        transporte = new TransporteTropas("T-01", "Camión de tropas", 2020, 12000, EstadoOperativo.DISPONIBLE, 25);
        blindado = new Blindado("B-01", "Vehículo blindado", 2021, 8000, EstadoOperativo.DISPONIBLE, 4);
        apoyo = new Apoyo("A-01", "Ambulancia", 2022, 5000, EstadoOperativo.DISPONIBLE, TipoFuncion.MEDICO);
    }

    @Test
    void testCreacionTiposVehiculo() {
        assertNotNull(transporte);
        assertEquals("T-01", transporte.getId());
        assertEquals("Camión de tropas", transporte.getModelo());
        assertEquals(2020, transporte.getAnioFabricacion());
        assertEquals(12000.0, transporte.getKilometraje());
        assertEquals(EstadoOperativo.DISPONIBLE, transporte.getEstadoOperativo());
        assertEquals(25, transporte.getCapacidadSoldados());

        assertNotNull(blindado);
        assertEquals("B-01", blindado.getId());
        assertEquals("Vehículo blindado", blindado.getModelo());
        assertEquals(2021, blindado.getAnioFabricacion());
        assertEquals(8000.0, blindado.getKilometraje());
        assertEquals(EstadoOperativo.DISPONIBLE, blindado.getEstadoOperativo());
        assertEquals(4, blindado.getNivelBlindaje());

        assertNotNull(apoyo);
        assertEquals("A-01", apoyo.getId());
        assertEquals("Ambulancia", apoyo.getModelo());
        assertEquals(2022, apoyo.getAnioFabricacion());
        assertEquals(5000.0, apoyo.getKilometraje());
        assertEquals(EstadoOperativo.DISPONIBLE, apoyo.getEstadoOperativo());
        assertEquals(TipoFuncion.MEDICO, apoyo.getTipoFuncion());
    }

}
