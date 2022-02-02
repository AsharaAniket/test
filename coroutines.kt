/*
    Executed within a thread
    coroutines are suspendable      // execute some instructions pause it and continue when we want to. Threads cant do it
    They can easyily change/switch their context       // 1 thread ma start kari ne 2nd thread ma switch kari saki

*/
/*
    it is a feature in kotlin that helps us write asynchronus code in very simplified and readable manner

    suspend keyword use karva no function ni pela example - suspent fun try(){}

    suspend means this function needs coroutines to execute   //we cant call suspend function directly we need a coroutine to call a suspend function 


    network request is called asynchronusly in the IO Thread and we will get result and process it in the main thread
*/

/*
    suspend fun fetchDataFromNetwork(){
        val result = networkRequest()
        updateUI(result)                            // here it is our callback
    }
*/

