object Q1_Prime extends App {
  def gdc(a:Int,b:Int):Int= b match {
  case 0=> a
  case y if(b>a) => gdc(b,a)
  case _ => gdc(b,a%b)
  }
  def prime(x:Int,n:Int=2):Boolean= n match {
    case a if(x==a) => true
    case a if(gdc(x,a)>1) => false
    case a => prime(x,a+1)

  }
println(prime(1))
}
