val list = List(3, 5, 9, 11, 15, 19, 21, 24, 32, 46)
val it = list sliding 3
it.next()
it.next()
val l1 = List(1,2)
l1.takeRight(3)

val l2 = List(List(1), List(2, 3, 4), List(5, 6, 7), List(8, 9, 10))
val result = l2.flatMap(_.map(_ * 4))
import Stream.cons
val stream = cons(0, cons(1, Stream.empty))
