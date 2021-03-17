import java.util.*

fun main() {
schoolsnames()
    cities()
    numbers()
    var name= names("hamdi","abassi","mama")
    println(Arrays.toString(name))
}
fun schoolsnames() {
    var schoolsnamesArray= arrayOf("mwangaza","alliance","pangani","loreto")
    println(Arrays.toString(schoolsnamesArray))




}
fun cities() {
    var citiess= arrayOf("harare","mumbai","dodoma","jakarta")
    println("harare".capitalize())
    println("mumbai".capitalize())
    println("dodoma".capitalize())
    println("jakarta".capitalize())

}
fun numbers() {
    var numbersarray= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum=numbersarray[2]+numbersarray[5]
    println(sum)
    var index=numbersarray.indexOf(158)
    println(index)
    var sortedNumbers=numbersarray.sortedArray()
    println(Arrays.toString(sortedNumbers))


}
fun names(name1:String,name2:String,name3:String):Array<String>{
    var namesArrays= arrayOf("Hamdi","Abass","Abdullahi")
    return namesArrays
}

