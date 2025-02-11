open class Vehiculo(val marca : String,val modelo : String,var capacidad : Int = 50){

    fun mostrarInformacion(){
        println("Este es un vehiculo de la marca $marca,modelo $modelo y con capacidad de $capacidad")
    }


    open fun calcularAutonomia(): Int {
        return capacidad * 10
    }

}