package com.example.myapplication.domain

class AddUseCase(val ShopListInterface: ShopListInterface) {
   fun addShopItem(shopItem: ShopClass) {
       ShopListInterface.addShopItem(shopItem)
    }
}