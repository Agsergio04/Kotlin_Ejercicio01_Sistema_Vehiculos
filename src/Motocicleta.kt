class Motocicleta(marca : String,modelo : String,capacidad: Int,cilindrada : Int) : Vehiculo(marca,modelo, capacidad){
    override fun calcularAutonomia(): Int {
        return super.calcularAutonomia() - 40
    }
}