package co.edu.uniquindio;

// Caso 3: no permitir ID repetido


@Test
void testNoRegistrarVehiculoConIdRepetido() {
    LOG.info("Inicio de prueba testNoRegistrarVehiculoConIdRepetido...");

    assertTrue(batallon.registrarVehiculo(transporte));

    Vehiculo repetido = new Blindado("T-01", "Otro modelo", 2021,
            1000, EstadoOperativo.DISPONIBLE, 3);
    assertFalse(batallon.registrarVehiculo(repetido));
    assertEquals(1, batallon.getListaVehiculos().size());
    assertSame(transporte, batallon.buscarVehiculo("T-01"));

    LOG.info("Fin de prueba testNoRegistrarVehiculoConIdRepetido...");
}
