object InventoryManagement {

    //Function for display inventory in retail store
    def displayInventory(itemNames: Array[String], itemQuantity: Array[Int]): Unit = {
        if (itemNames.length != itemQuantity.length){
            println("Error: Item names and quantities array should be same length!")
            return
        }

        println("Inventory:")
        for(i <- itemNames.indices){
            println(s"${itemNames(i)}: ${itemQuantity(i)}")
        }
    }

    //Function for sell an item
    def sellItem(itemNames: Array[String], itemQuantity: Array[Int], itemName: String, quantity: Int): Unit = {
        val index = itemNames.indexOf(itemName)
        if (index >= 0){
            if(itemQuantity(index) >= quantity){
                itemQuantity(index) =  itemQuantity(index) - quantity
                println(s"Sold $quantity of $itemName. Remaining quantity: ${itemQuantity(index)}")
            }else{
                println(s"Not enough to sell $itemName. Available quantity: ${itemQuantity(index)}")
            }
        }else{
            println(s"Item '$itemName' does not exist in the inventory.")
        }
    }

    def main(args: Array[String]): Unit = {
        val itemNames = Array("Mangoes", "Banana", "Apples", "Grapes")
        val itemQuantity = Array(9, 5, 6, 15)

        //Display initial inventory
        displayInventory(itemNames, itemQuantity)

        //Sell items
        sellItem(itemNames, itemQuantity, "Apples", 3)
        sellItem(itemNames, itemQuantity, "cakes", 3)

        println("After selling.. ")
        displayInventory(itemNames, itemQuantity)
    }
}