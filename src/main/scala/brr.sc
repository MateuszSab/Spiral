import Spiral._

val arr = Array.ofDim[Int](5, 5)
val x = SpiralIndex(Array.ofDim[Int](5, 5))

for {
  a <- x.indices
  //    b <- 1 to  x.indices
} yield {
  arr(x(a)._1)(x(a)._2) = a
}
arr
println(arr.map(_.mkString).mkString(" \n "))