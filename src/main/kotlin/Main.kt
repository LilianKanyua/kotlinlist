fun main(){
     println( longList(listOf( "book","pen","pencil","bag","charcoal","bus","heaven","girl","cook","office")))
   println( height(listOf(5.43,5.97,6.2,5.55)))
    sortAge()
    var mileage=aveMileage()
    println(mileage)
}
fun longList(list:List<String>):List<String>{

    var indexStrings= listOf<String>()
    for (x in list){
        if ((list.indexOf(x)%2)==0){
         indexStrings+=x
        }

    }
    return indexStrings
    }
data class Height(var ave:Double, var sum:Double)
fun height(height:List<Double>):Height{
   var sum=height.sum()
    var ave= height.average()
    var sumave= Height(sum,ave)
    return sumave


}
data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
     fun sortAge(){
         val person1= Person("Jack",33,5.78,60.90)
         val person2=Person("Marther",23,5.45,50.00)
         val person3=Person("Michael",45,6.20,60.30)
         var people= listOf(person1,person2,person3)
         var sortedAges=people.sortedByDescending { people-> people.age }
         println(sortedAges)
         }
     //fun addition(){
         //val persons1=Persons("Judith",56,5.70,60.45)
         //val persons2=Persons("Mark",32,5.00,50.00)
         //var w= mutableListOf<Any>(persons2,persons1)

   //}


data class Car(var registration:Int, var mileage:Double)
   fun aveMileage():Double{
       val car1=Car(5678,130.40)
       val car2=Car(5686,145.90)
       val car3=Car(5454,200.09)
       val car4=Car(6756,109.00)
       var cars= listOf(car1,car2,car3,car4)
        var carsMile=cars.sumOf { carMile-> carMile.mileage }
        var ave=carsMile/cars.size
       return ave
       }



