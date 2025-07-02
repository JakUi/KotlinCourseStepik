package corporation

import java.io.File

class ProductCardsRepository {

    val fileProductCards = File("product_card.txt")
    val productCards = loadAllCards()

    fun removeProductCard(name: String) {
        for (card in productCards) {
            if (card.name == name) {
                productCards.remove(card)
                break
            }
        }
    }

    fun registerNewItem(productCard: ProductCard) {
        productCards.add(productCard)
    }


    private fun loadAllCards(): MutableList<ProductCard> {
        val cards = mutableListOf<ProductCard>()
        if (!fileProductCards.exists()) fileProductCards.createNewFile()
        val content = fileProductCards.readText().trim()
        if (content.isEmpty()) {
            return cards
        }
        val cardsAsString = content.split("\n")
        for (cardAsString in cardsAsString) {
            val properties = cardAsString.split("%")
            val name = properties[0]
            val brand = properties[1]
            val price = properties[2].toInt()
            val type = properties.last()
            val productType = ProductType.valueOf(type)
            val productCard = when (productType) {
                ProductType.FOOD -> {
                    val caloric = properties[2].toInt()
                    FoodCard(name, brand, price, caloric)
                }
                ProductType.APPLIANCE -> {
                    val wattage = properties[2].toInt()
                    ApplianceCard(name, brand, price, wattage)
                }
                ProductType.SHOE -> {
                    val size = properties[2].toFloat()
                    ShoeCard(name, brand, price, size)
                }
            }
            cards.add(productCard)
        }
        return cards
    }


    fun saveChanges() {
        val content = StringBuilder()
        for (productCard in productCards) {
            content.append("${productCard.name}%${productCard.brand}%${productCard.price}%")
            when (productCard) {
                is FoodCard -> {
                    val caloric = productCard.caloric
                    content.append("$caloric%")
                }

                is ShoeCard -> {
                    val size = productCard.size
                    content.append("$size%")
                }

                is ApplianceCard -> {
                    val wattage = productCard.wattage
                    content.append("$wattage%")
                }
            }
            content.append("${productCard.productType}\n")
        }
        fileProductCards.writeText(content.toString())
    }
}
