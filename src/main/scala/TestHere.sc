object mergesort {
  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length/2
    println(n)
    if (n == 0) {
      println("if")
      xs
    }
    else {
      println("else");
      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
        case (Nil, ys) => {
          println("1st case")
          ys
        }
        case (xs, Nil) => {
          println("2nd case")
          xs
        }
        case (x :: xs1, y :: ys1) => {
          println("3rd case")
          if(x < y){
            println("2nd if")
            x :: merge(xs1, ys)
          }
          else {
            println("2nd else")
            y :: merge(xs, ys1)
          }
        }
      }
      val (first, second) = xs.splitAt(n)
      println("after def")
      merge(msort(first), msort(second))
    }
  }
  //val nums = List(10, -3, 1, 0, 54, -5, 9, 11)
  //msort(nums)
  msort(List(10, -3, 1, 0, 54, -5, 9, 11))
}
