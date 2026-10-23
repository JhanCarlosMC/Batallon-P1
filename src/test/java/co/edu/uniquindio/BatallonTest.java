package co.edu.uniquindio;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BatallonTest {

    private Batallon batallon;
    private TransporteTropas transporte;

    @BeforeEach
    void iniciar() {
        batallon = new Batallon("01", "Cacique", "03", "Calarcá", 3);
        transporte = new TransporteTropas("T-01", "Camión de tropas", 2020, 12000, EstadoOperativo.DISPONIBLE, 25);
    }

    @Test
    void testAgregarVehiculoIdNuevo() {
        assertTrue(batallon.registrarVehiculo(transporte));
        assertNotNull(batallon.buscarVehiculo("T-01"));
        assertEquals(1, batallon.getListaVehiculos().size());
    }

    @Test
    void testNoAgregarVehiculoIdRepetido() {
        batallon.registrarVehiculo(transporte);
        TransporteTropas repetido = new TransporteTropas("T-01", "Otro camión", 2019, 100, EstadoOperativo.DISPONIBLE, 10);

        assertFalse(batallon.registrarVehiculo(repetido));
        assertEquals(1, batallon.getListaVehiculos().size());
        assertEquals("Camión de tropas", batallon.buscarVehiculo("T-01").getModelo());
    }

}
