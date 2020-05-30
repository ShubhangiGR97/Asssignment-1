object Q2_sumOfPrimeNumbers extends App {
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
  def printSeq(s:Int):Int=
    {
      if(s<2)
        return 0
      if (prime(s-1))
        {
          printf("%d ",s-1)
        }
      printSeq(s-1)
    }
  printSeq(20)

}
