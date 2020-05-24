object Cost extends App {
  def cost(z:Double)=if(z>50){
    (z*24.95*0.6)+3+(z-50)*0.75
  }
  else
  {
    3+24.5*0.6*z
  }

  println(cost(60))

}
