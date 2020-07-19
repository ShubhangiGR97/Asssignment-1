object caesarCipher extends App {
  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val s = "UCSC"
  val E = (x:Char, key:Int,a:String)=> a((a.indexOf(x.toUpper)+key)%a.size)

  val D = (x:Char, key:Int,a:String)=> a((a.indexOf(x.toUpper)-key+a.size)%a.size)

  val cipher = (algo:(Char,Int,String)=>
    Char,s:String, key:Int,a:String)=>
    s.map(algo(_ , key,a))

  val encrypt = cipher (E,s,5,alphabet)
  val decrypt= cipher(D,encrypt,5,alphabet)
  println(encrypt)
  println(decrypt)

}
