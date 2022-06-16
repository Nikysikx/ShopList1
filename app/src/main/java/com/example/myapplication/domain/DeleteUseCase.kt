package com.example.myapplication.domain

class DeleteUseCase (val ShopListInterface: ShopListInterface){

    fun deleteShopItem(shopItem: ShopClass) {
        ShopListInterface.deleteShopItem(shopItem)
    }
}