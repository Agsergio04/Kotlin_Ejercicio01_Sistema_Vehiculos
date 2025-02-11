class Automovil(marca : String,modelo : String,capacidad: Int,tipo : String) : Vehiculo(marca,modelo, capacidad){
    override fun calcularAutonomia() : Int {
        return super.calcularAutonomia() + 100

    }
}