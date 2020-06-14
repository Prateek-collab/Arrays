fun main(){
    val a=arrayOf("Internshala","Trainings")
    val b=arrayOf("Android","App","Development")

    print(compareArrayLength(a,b))
}

fun compareArrayLength(a:Array<String>,b:Array<String>):Boolean{
    return a.size==b.size
}