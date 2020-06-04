















/*
interface UserinfoProvider{
    var info:String
    fun printInfo(user: User)
    {
        println(info)
        user.printUser()
    }
}

interface DbConnection{
    fun getConnection():String
}

open class MainProvider: UserinfoProvider,DbConnection{
    protected open val db = "DB connection" +
            ""
    override var info: String
        get() = "Canceled"
        set(value) {}
    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Work-Work")
    }

    override fun getConnection(): String {
       return db
    }
}
*/
