package basics.valuesvariables

object ValuesVariables {
  def main(args: Array[String]): Unit = {
    val x: Int = 11  //val are immutable; reassignment is not allowed
    println(x)
    //x=3

    val a = 83  // Compiler infer Types; and hence mentioning Type is optional
    println(a)

    val sString: String = "Hellow World"
    val aString = "Hello Scala";   //SEMI COLON IS ALLOWED IN SCALA, BUT NOT MANDATORY

    println(sString)
    println(aString)

    var vInt: Int = 100
    vInt = 120  // Variables are mutables and hence reassignment is allowed

    println(vInt)  //prefer values than variables
  }

}
