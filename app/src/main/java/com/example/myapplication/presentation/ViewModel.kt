package com.example.myapplication.presentation
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.data.ImplShopList
import com.example.myapplication.domain.*

class ViewModel : ViewModel() {
    var implShopList = ImplShopList




    val editUseCase = EditUseCase(implShopList)
    val deleteUseCase = DeleteUseCase(implShopList)
    val listUseCase = ShopLitUseCase(implShopList)

    var liveData = listUseCase.ShopList()

    fun enable(shopClass: ShopClass) {
       var newItem = shopClass.copy(enabled = !shopClass.enabled)
        editUseCase.editShopItem(newItem)


    }

    fun delete(shopClass: ShopClass) {
        deleteUseCase.deleteShopItem(shopClass)
    }
}