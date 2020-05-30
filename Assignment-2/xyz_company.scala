object xyz_company extends App{
  def normal(hours:Int): Int=hours*150
  def ot(hours:Int): Int=hours*75
  def salary(hours_1:Int,hours_2:Int)=normal(hours_1)+ot(hours_2)
  def income(salary:Double)=salary*0.9
  println(income(salary(40,20)):Double)

}
