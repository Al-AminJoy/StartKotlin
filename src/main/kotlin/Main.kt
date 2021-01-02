val name="This Is Name";
var greeting: String?=null;

/**
 * single expression function
 */
fun check()=if (greeting!=null) greeting else "Null Greetings"

fun recheck(){
    print(check());
}
fun param(firstMsg:String,secondMsg:String)= println("$firstMsg $secondMsg");
fun listCheck(list:List<String>){
    list.forEach { list-> println("$list") }
}

/**
 * Var Arg Parameter
 */
fun checkVarArg(vararg names:String){
    names.forEach { names-> println("$names") }
}
fun main() {
    /**
     * if else
     */
   // greeting="hi";
   /* greeting="hi";
    if (greeting==null){
        print("Hello")
    }
    else{
        print("Not Null")
    }

    */
    /**
     * When same as java switch case
     */
    /*when(greeting){
        null-> print("Null");
        else-> print(greeting);
    }

     */
    /**
     * Insert If else or whens result
     */
   /* var checkedGreeting=if (greeting!=null) greeting else "hey";
    print(checkedGreeting);

    */
   // recheck();
   // param("Hello","Kotlin");

    /**
     * Array
     */
  /*  var arr= arrayOf("Al-Amin","Islam","Joy");
    println(arr.size);

   */
    /**
     * Normal for loop
     */
    /*
    for (arr in arr){
        println(arr)
    }

     */
    /**
     * For Each
     */


     /*
    arr.forEach { arr-> println(arr)}
    */
    /**
     * For Each Indexed
     */
    /*
    arr.forEachIndexed { index,arr->
        println("This is $arr which index is $index") }

     */
    /**
    *List
     */
    //var lists= listOf("Al-Amin","Joy");
    val lists= mutableListOf("Al-Amin","Joy");
   /* lists.add("Value Added Mutable List");
    lists.forEach{lists ->
    println(lists)}

    */
    //listCheck(lists);
    /**
     * Map Variable
     */
    //var map= mapOf(1 to "My" , 2 to "Name",3 to "Al-Amin");
   /* var map= mutableMapOf(1 to "My" , 2 to "Name",3 to "Al-Amin");
    map.put(4, "Mutable Map Added");
    map.forEach{ (key, value) -> println("$key -> $value")};

    */
    /**
     * VarArg
     */
   //checkVarArg("This","Is","VarArg");
}