class User(var firstName:String, var secondname: String){
    var login:String? = null
        set(value){
            if (value != null) field = value
        }
        get(){
            println("Это $field")
            return field
        }
    var password:String? = null
        set(value){
            if (value != null) field = value
        }
        get(){
            println("Это $field")
            return field
        }


}