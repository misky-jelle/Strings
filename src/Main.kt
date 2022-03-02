fun main() {
    var name="Akirachix"
    var y=(name[1].toString()+name[3]+name[4])
    println(y)
    var results= statement("Misky",21)
    println(results)
    var t =text()
    println(t)
    var d=identity("Misky")


}
fun statement(x: String,y: Int): String{
    var name=x
    var age=y
    var statement="Hi my name is $x i am $y years old"
    return statement



}
fun text(): Int{
    var stmt="ilovemeat"
    return (stmt.length)
}
fun identity(name: String){
    if(name=="Misky")
        println("That's me")
    else
        println("i don't know what that is")
}