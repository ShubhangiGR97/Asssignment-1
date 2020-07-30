object question_3 extends App {

  class Account(private var balance: Double = 0) {

    def transferMoney(account: Account, amount: Double): Unit = {
      this.balance = this.balance-amount
      account.balance = account.balance+amount
      println(n.balance)
      println(y.balance)
    }

  }

  val n = new Account(157.3)
  val m = new Account(40.7)

  n.transferMoney(m, 20)


}