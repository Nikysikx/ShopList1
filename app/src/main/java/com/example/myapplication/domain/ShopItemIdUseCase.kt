package com.example.myapplication.domain

class ShopItemIdUseCase (val ShopListInterface: ShopListInterface){

    fun ShopItemId(id: Int): ShopClass {
        return  ShopListInterface.ShopItemId(id)
    }
}