object Spiral {


  def SpiralIndex(ar: Array[Array[Int]]): Seq[(Int, Int)] = {

    val arr = ar
    val n = arr(0).length - 1
    val m = 0

    def indexes(n: Int, m: Int) = {

      val row1 = for {
        j <- 0 to n
      } yield (m, j)

      val collast = for {
        j <- 0 to n
      } yield (j, n)

      val rowlast = for {
        j <- (0 to n).reverse
      } yield (n, j)

      val col1 = for {
        j <- (0 to n).reverse
      } yield (j, m)

      Seq(row1, collast, rowlast, col1).flatten.distinct
    }

    (1 until n).foldLeft(indexes(n, m)) { (result, c) =>
      val newn = n - c
      val newm = m + c
      Seq(result ++ indexes(newn, newm)).flatten.distinct
    }

  }

}
