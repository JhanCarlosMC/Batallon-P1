package co.edu.uniquindio;

// Caso 4: buscar vehículos existentes e inexistentes


@Test
void testBuscarVehiculoExistente() {
    LOG.info("Inicio de prueba testBuscarVehiculoExistente...");

    batallon.registrarVehiculo(blindado);

    Vehiculo encontrado = batallon.buscarVehiculo("B-01");
    assertNotNull(encontrado);
    assertEquals("B-01", encontrado.getId());
    assertSame(blindado, encontrado);

    LOG.info("Fin de prueba testBuscarVehiculoExistente...");
}

@Test
void testBuscarVehiculoInexistente() {
    LOG.info("Inicio de prueba testBuscarVehiculoInexistente...");

    batallon.registrarVehiculo(blindado);

    assertNull(batallon.buscarVehiculo("X-99"));
    assertNull(batallon.buscarVehiculo(null));

    LOG.info("Fin de prueba testBuscarVehiculoInexistente...");
}
