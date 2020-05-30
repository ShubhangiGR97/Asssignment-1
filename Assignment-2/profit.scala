object profit extends App {
  def attendees(ticket_price:Int)=120+(15-ticket_price)*20/5
  def revenue(ticket_price:Int):Int =attendees(ticket_price)*ticket_price
  def cost(ticket_price:Int)=500+3*attendees(ticket_price)
  def profit(ticket_price:Int):Int= revenue(ticket_price)-cost(ticket_price)
  //println(attendees(10))
  //println(revenue(10))
  //println(cost(10))
  println(profit(25),profit(30),profit(35),profit(40))
  println(profit(5),profit(10),profit(15),profit(20))
}
