interface MyInterfaceListener{    
    
//whatever you define inside interface is abstract and open by default, in interface noting is final everything is open in nature
//you cannot create instance of Interface   atle () nai lakhvanu jyare inherite kari tyare, create new object ne avu pan kai no kari saki
//abstract variables should not contain initialized values, it should be a empty declaration, cunstructor pan no nakhi saki 100 100gram abstraction jevu
// as we are inheriting interfaces IT IS COMPULSORY TO override functions inside interface
    var name: String              

    fun onTouch()              

    fun onClick(){                //public and open
         //code
         println("button was clicked by using super")
    }
}

class MyButton : MyInterfaceListener{
    //body
    override var name: String = "dummy name"

    override fun onTouch(){
        //code
        println("button was touched")
    }

    override fun onClick(){
        //code
        super.onClick()
        println("button was clicked")
    }
}

fun main(){
    var myBtn = MyButton()
    myBtn.onTouch()
    myBtn.onClick()
}