object lab06_q_01 {

    var inventory1: Map[Int, (String, Int, Double)] = Map(
        1 -> ("Laptop", 10, 100000),
        2 -> ("Mouse", 14, 1200),
        3 -> ("Keyboard", 25, 1500)
    )

    var inventory2: Map[Int, (String, Int, Double)] = Map(
        2 -> ("Mouse", 30, 1200),
        3 -> ("Keyboard", 5, 1500),
        4 -> ("Headset", 10, 3000)
    )

    def getProductNames(inventory: Map[Int, (String, Int, Double)]): Unit = {
        println("")
        for((id, (product, quantity, price)) <- inventory){
            println(s"|ItemID| $id\t|Product| $product\t|Quantity| $quantity\t|Price| $price")
        }
    }

    def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
        var value: Double = 0.0
        for((id, (product, quantity, price)) <- inventory){
            value = value + (quantity * price)
        }
        value
    }

    def checkIfEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
        inventory.isEmpty
    }

    def mergeInventories(inventory_1: Map[Int, (String, Int, Double)], inventory_2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
        var concatedInventory = scala.collection.mutable.Map[Int , (String , Int , Double)]()
        concatedInventory ++= inventory_1
        for((id , (product , quantity , price)) <- inventory_2){
            if(concatedInventory.contains(id)){
                val (product1 , quantity1 , price1) = concatedInventory(id)
                concatedInventory(id) = (product , quantity + quantity1 , price)
            }else{
                concatedInventory(id) = (product , quantity , price)
            }
        }
        concatedInventory.toMap
    }

    def checkProduct(checkID: Int, inventory: Map[Int, (String, Int, Double)]): Boolean ={
        var isThere: Boolean = false
        for((id, (product, quantity, price)) <- inventory){
            if(id == checkID){
                isThere = true
            }
        }
        return isThere
    }

    def main(args: Array[String]): Unit ={
        getProductNames(inventory1)
        getProductNames(inventory2)

        println(s"\ntotal value of all products in inventory1: ${calculateTotalValue(inventory1)}")
        println(s"\ntotal value of all products in inventory2: ${calculateTotalValue(inventory2)}")

        var mergeInventory = mergeInventories(inventory1, inventory2)
        println("--------Merged Inventory--------")
        getProductNames(mergeInventory)

        println(s"\nIs product with ID 4 in inventory 1: ${checkProduct(4 , inventory1)}")

    }

    

}