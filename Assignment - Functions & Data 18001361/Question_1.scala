object question_1 extends App {

  val x = new Rational(2,3)
  println("Rationan Num x :"+x)
  println("Rational Num -x :"+x.neg)
}

class Rational(n:Int,d:Int){

  require(d>0, " d must be greater than 0")

  def numer = n
  def denom= d

  def neg=new RationalNum(-this.numer,this.denom)
  override def toString=numer+"/"+denom

}
