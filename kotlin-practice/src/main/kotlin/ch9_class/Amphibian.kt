package ch9_class

interface Boat {
    fun start() {
        println("Ready to swim")
    }
}

interface Car {
    fun start() {
        println("Ready to drive")
    }
}

class Amphibian: Car, Boat {
    override fun start() {
        // super<인터페이스_이름>.메서드()
        super<Car>.start()
        super<Boat>.start()
    }
}