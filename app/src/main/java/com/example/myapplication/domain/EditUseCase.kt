package com.example.myapplication.domain

class EditUseCase (val ShopListInterface: ShopListInterface){

    fun editShopItem(shopItem: ShopClass) {
        ShopListInterface.editShopItem(shopItem)
    }
}