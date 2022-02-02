class Manager private constructor(){                                // singleton class banava mate use thai, we create a private instance of the class

    companion object{                                               // java ma static keyword hato e kotlin ma nathi atle comapanion use kari

        private var instance: Manager? = null
        fun getInstance() = synchronized(this){
            if(instance == null)
                instance = Manager()
            instance
        }
    }
}

fun main(){

    println(Manager.getInstance())
    println(Manager.getInstance())
    println(Manager.getInstance())
    println(Manager.getInstance())
    println(Manager.getInstance())
}