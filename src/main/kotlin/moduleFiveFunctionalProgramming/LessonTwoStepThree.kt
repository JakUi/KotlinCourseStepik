package org.example.moduleFiveFunctionalProgramming

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json


@Serializable
enum class ProductCategory {

    @SerialName("Electronics")
    ELECTRONICS,

    @SerialName("Clothing")
    CLOTHING,

    @SerialName("Home goods")
    HOME_GOODS,

    @SerialName("Beauty")
    BEAUTY,

    @SerialName("Sports")
    SPORTS
}

@Serializable
data class Product(
    @SerialName("id")
    val id: Int,

    @SerialName("product_name")
    val productName: String,

    @SerialName("product_description")
    val productDescription: String,

    @SerialName("product_category")
    val productCategory: ProductCategory,

    @SerialName("product_price")
    val productPrice: Double,

    @SerialName("product_brand")
    val productBrand: String,

    @SerialName("product_rating")
    val productRating: Double,

    @SerialName("product_availability")
    val productAvailability: Boolean
)

fun loadProducts(jsonContent: String): List<Product> {
    return Json.decodeFromString(jsonContent)
}

