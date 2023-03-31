fun main(){
     var list=longList()
    println(list)
   var human=height(listOf(5.43,5.97,6.2,5.55))
    val person1= Person("Jack",33,5.78,60.90)
    sortAge()

}
fun longList():List<String>{
    var myList= mutableListOf("book","pen","pencil","bag","charcoal","bus","heaven","girl","cook","office")
    for (x in myList){
        if ((myList.indexOf(x)%2)!==1){

        }

    }
    return myList
    }

fun height(height:List<Double>):Double{
   var sum=height.sum()
    var ave= height.average()
    return sum
    return ave

}
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
     fun sortAge(){
         val person1= Person("Jack",33,5.78,60.90)
         val person2=Person("Marther",23,5.45,50.00)
         val person3=Person("Michael",45,6.20,60.30)

         val people =listOf(person1,person2,person3)
         var sortedPerson=people.sortedByDescending { people -> people.age }
         println(sortedPerson)

     }
data class Car(var registration:Int, var mileage:Double)
   fun aveMileage():Double{
       val car1=Car(5678,130.40)
       val car2=Car(5686,145.90)
       val car3=Car(5454,200.09)
       val car4=Car(6756,109.00)
       var cars= listOf(car1,car2,car3,car4)
       val ave= cars.filter { car -> car.mileage }
   }


