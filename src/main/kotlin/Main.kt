fun main(){
     println( longList(listOf( "book","pen","pencil","bag","charcoal","bus","heaven","girl","cook","office")))
    println(heights(listOf(1.50,1.90,2.10,1.70,1.70)))
    sortAges(person= listOf(People("Auma",45,1.5,60.80),
        People("James",23,2.0,80.0),
        People("Mikel",13,1.3,40.5)))
    println( addPeople())
    println( aveMileage(vehicles = listOf(Car("kbz089",20.60),
        Car("MNH4566",30.50),
        Car("RTV0045",50.2),
        Car("CVR8742",32.45))))


}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun longList(list:List<String>):List<String>{

    var indexStrings= listOf<String>()
    for (x in list){
        if ((list.indexOf(x)%2)==0){
         indexStrings+=x
        }

    }
    return indexStrings
    }
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class Height(var average:Double, var total:Double)

fun heights(heightss:List<Double>):Height{
    return Height(
        average=heightss.average(),
        total=heightss.sum()
    )

    }
//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age


    data class People(var name:String, var age:Int, var height:Double, var weight:Double)
    fun sortAges(person:List<People>){
        println(person.sortedByDescending { person->person.age })
    }


//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun addPeople(): List<People>{
    var firstAdd= People("Njambi",21,1.7,56.70)
    var secondAdd= People("Njambi",21,1.7,56.70)
    return mutableListOf(firstAdd,secondAdd)
}
//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.
data class Car(var registration:String, var mileage:Double)
fun aveMileage(vehicles:List<Car>):Double{
    var sumMile= vehicles.sumOf { vehicles->vehicles.mileage }
    var average=sumMile/vehicles.size
    return average
}
