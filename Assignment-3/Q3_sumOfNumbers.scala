object Q3_sumOfNumbers extends App {
  def sum(n:Int) : Int=
    if(n==1) 1
  else
      sum(n-1)+n
  println(sum(5))

}
