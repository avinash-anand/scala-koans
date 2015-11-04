case class Person(first: String, last: String)
val p1 = new Person("Fred", "Jones")
val p2 = new Person("Shaggy", "Rogers")
val p3 = new Person("Fred", "Jones")
val p4 = p1
p1.## == p4.##

val x = List(1,2,3,4,4,5,1,2,3,5,6,4,3,4,7,8)
val x1 = x.toSet
var index = 0
var max = 0
var count = 0
for(i <- x1) {
  count = 0
  for(j <- x) {
    if(j==i){
      count += 1
    }
    if(count > max){
      max = count
      index = j
    }
  }
}
index
max
case class Dog(name: String, breed: String)
val d1 = Dog("Scooby", "Doberman")
d1.toString

def sum(a: Int, b: Int, c: Int) = a + b + c
val sum3 = sum _
sum3(1, 9, 7)
sum(4, 5, 6)