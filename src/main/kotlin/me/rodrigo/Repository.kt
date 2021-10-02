package me.rodrigo

class Repository<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value
        // (Mesmo comando acima) map.put(id, value)
    }

    fun remove(id: String) = map.remove(id)

    fun findViewById(id: String) = map[id]

    fun findAll() = map.values
}