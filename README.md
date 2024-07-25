Anotación:
- La vista de registrar las Task la dejé solamente con 2 campos ya que en el backend no me funcionó el HandleLocalDateType que había creado para convetir los varchar a LocalDate, así que le asigné un valor por defecto.
- Generalmente habría usado Loombok en la clase de Task para autogenerar los getter y setter.
- Generé un .sql para la creación de la BD para no tener que hacerlo a mano, fue hecha con PostgreSQL y probé las rutas con Postman.
