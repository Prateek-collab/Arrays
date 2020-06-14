import java.util.*

fun main(){
    var numArray=arrayOf(1,2,3,4)

    println(Arrays.toString(numArray))

    var evenArray=arrayOf(0,2,4,6,8)
    var oddArray=arrayOf(1,3,5,7,9)

    evenArray[0]+=oddArray[0]
    evenArray[1]+=oddArray[1]
    evenArray[2]+=oddArray[2]
    evenArray[3]+=oddArray[3]
    evenArray[4]+=oddArray[4]

    println(Arrays.toString(evenArray))
}