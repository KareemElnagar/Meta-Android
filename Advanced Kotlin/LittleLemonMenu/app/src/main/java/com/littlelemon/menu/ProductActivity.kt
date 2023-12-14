package com.littlelemon.menu

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productTitle = intent.getStringExtra(KEY_TITLE).toString()
        val productPrice = intent.getDoubleExtra(KEY_PRICE,0.0)
        val productImage = intent.getIntExtra(KEY_IMAGE,-1)
        val productCategory = intent.getStringExtra(KEY_CATEGORY).toString()


        val productItem =
            ProductItem(productTitle,productPrice,productCategory,productImage)
        setContent { ProductDetails(productItem) }
    }
    companion object{
        const val KEY_TITLE = "title"
        const val KEY_PRICE = "price"
        const val KEY_IMAGE = "image"
        const val KEY_CATEGORY = "category"

    }
}