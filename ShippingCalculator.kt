fun shippingCost(amount: Double, international: Boolean): Double {
    if (international == true){
        var cost = amount * 0.15
        if (cost >=50){
            return 50.0
        }
        else{
            return cost
        }

    }
    else{
        if(amount >= 75){
            return 0.0
        }
        else{
            return amount * 0.1
        }
    }
    
}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(total, international))
}
