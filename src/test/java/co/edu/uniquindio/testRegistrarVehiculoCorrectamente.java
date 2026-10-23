package co.edu.uniquindio;

// Caso 2: agregar un vehículo correctamente
void testRegistrarVehiculoCorrectamente() {
    LOG.info("Inicio de prueba testRegistrarVehiculoCorrectamente...");

    assertTrue(batallon.registrarVehiculo(transporte));
    assertEquals(1, batallon.getListaVehiculos().size());
    assertTrue(batallon.getListaVehiculos().contains(transporte));

    LOG.info("Fin de prueba testRegistrarVehiculoCorrectamente...");
}

