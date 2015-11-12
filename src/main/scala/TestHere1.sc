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
//val l3 = List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9, 10))
//l3.transpose // transpose requires all collection of same size
val stringBuilder = new StringBuilder()
val l4 = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)
stringBuilder.append("I want all numbers 6-12: ")
l4.filter(it => it > 5 && it < 13).addString(stringBuilder, ",")
val l5 = List(1, 2, 3, 4, 5, 6, 7, 8)
val x = l5.view(3, 6).map(_ + 2).map(_ * 10).force
def inspect[T](l: List[T])(implicit manifest: scala.reflect.Manifest[T]) = manifest.toString()
val l6 = 1 :: 2 :: 3 :: 4 :: 5 :: Nil
val x2 = inspect(l6)

//val x3 = None.asInstanceOf[Any]




