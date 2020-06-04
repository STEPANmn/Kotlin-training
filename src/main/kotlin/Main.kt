class Some {
    companion object {
        var count = 0
    }
    init {
        count++
        println("Создано объектов: $count")
    }
}

fun filterList(list: List<String>, filter: (String) -> Boolean){
    list.forEach{el ->
        if(filter(el))
            println(el)

    }
}

val filter: (String) -> Boolean ={
    it.startsWith("J")
}

fun main() {
    val list = listOf("Java", "PHP", "Perl", "C++", "JavaScript")
    filterList(list, filter)


    /*val db_1 = DB.MongoBD(5,"mongo")
    val db_2 = DB.PostgreSQL(5,"mongo", true)

    val db_1_copy = db_1.copy(conn =  "Done")
    if(db_1 == db_1_copy)
        println("Они равны")
    else
        println("Они не равны")

    if(db_1 is DB.MongoBD){
        db_1.printInfo()
    }*/
   /* var test_1 = Some()
    var test_2 = Some()
    var test_3 = Some()
    var test_4 = Some()*/


}














/*
enum class Animals{
    DOG,CAT,BEAR,LION
}
fun main (args : Array<String>){
 //   val user = NewClass()
    //user.printInfo(User())
   // println(user.getConnection())
   // CheckDateTypes(user)
  val animal = Animals.BEAR
    when(animal){
        Animals.CAT -> println("Кошка")
    }

}

fun CheckDateTypes(obj: MainProvider){
    if(obj is UserinfoProvider) obj.printInfo(User())
    if(obj is DbConnection) println(obj.getConnection())
}*/
