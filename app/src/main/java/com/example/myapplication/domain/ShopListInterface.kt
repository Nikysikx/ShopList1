package com.example.myapplication.domain

import androidx.lifecycle.LiveData

interface ShopListInterface {
    fun addShopItem(shopItem: ShopClass)

    fun deleteShopItem(shopItem: ShopClass)

    fun editShopItem(shopItem: ShopClass)

    fun ShopItemId(id: Int): ShopClass

    fun ShopList(): LiveData<List<ShopClass>>

}