sealed class DB {
    data class MySQL(var id: Int, val conn: String):DB()
    data class MongoBD(var id: Int, val conn: String):DB(){

    }
    data class PostgreSQL(var id: Int, val conn: String, val IsDone: Boolean):DB()

    object Help : DB(){
        val conn = "Connection done"
    }
}

val DB.MongoBD.info: String
    get() = "MongoBD has id $id and conn $conn"

fun DB.MongoBD.printInfo(){
    println(info)
}