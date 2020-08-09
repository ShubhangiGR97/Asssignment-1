object test extends App {
  val p1 = Point1(2,3)
  val p2 = Point1(5,4)
  println("Addition of point p1 and p2 :")
  println(p1+p2)

  println("Move point p1:\n"+p1.move(4,5))
  println("Move point p2:\n "+p2.move(4,5))

  println("Distance between point p1 and p2: \n"+p1.distance(p2))

  println("Invert of point p1:\n"+p1.invert())
  println("Invert of point p2:\n "+p2.invert())

}

case class Point1(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  def +(that:Point1)=Point1(this.x+that.x, this.y+that.y)

  def move(dx:Int,dy:Int) = Point1(this.x+dx,this.y+dy)

  def distance(p1:Point1)= math.sqrt(math.pow(this.x - p1.x,2)+ math.pow(this.y-p1.y,2))

  def invert()=Point1(this.y,this.x)
}