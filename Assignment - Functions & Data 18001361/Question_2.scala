object question_2 extends App {

  val x = new Rational(5,6)
  val y = new Rational(6,9)
  val z = new Rational(4,9)

  println("x :"+x)
  println("x :"+y)
  println("x :"+z)

  val answer = x-y-z

  println("x-y-z :"+answer)
}

class Rational(n:Int,d:Int){

  require(d>0, " d must be greater than 0")

  def gcd(x:Int,y:Int):Int={
    val p = {if(x<0) -x else x}
    if (y==0) x else this.gcd(y,p%y)
  }
  val g = gcd(n,d)
  def numer = n/g
  def denom= d/g

  def neg=new Rational(-this.numer,this.denom)

  def +(that:Rational) = new Rational(this.numer * that.denom + this.denom * that.numer , this.denom * that.denom)

  def -(that:Rational) = new Rational(this.numer * that.denom - this.denom * that.numer , this.denom * that.denom)

  override def toString=numer+"/"+denom

}
