object Q5_sumOfEvenNumbers extends App {
  var sum:Int=0
def even(x:Int):Boolean={
  if(x%2==0)
    return true
  else
    return false
}
  def sum(x:Int):Int={
    if(x<2)
      return sum
    if(even(x-1)){
      sum=sum+x-1
    }
    sum(x-1)

  }
  println(sum(20))


}
