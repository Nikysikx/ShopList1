package com.example.myapplication.domain

import androidx.lifecycle.LiveData

class ShopLitUseCase (val ShopListInterface: ShopListInterface){


    fun ShopList(): LiveData<List<ShopClass>> {
        return ShopListInterface.ShopList()
    }
}