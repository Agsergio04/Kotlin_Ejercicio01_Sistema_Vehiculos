




fun main(){
    val vehiculo  = Vehiculo("Hola","V1")
    val automovil  = Automovil("Hola","V1",50,"1")
    val motocicleta  = Motocicleta("Hola","V1",50,15)

    println(vehiculo.calcularAutonomia())
    println(automovil.calcularAutonomia())
    println(motocicleta.calcularAutonomia())

}