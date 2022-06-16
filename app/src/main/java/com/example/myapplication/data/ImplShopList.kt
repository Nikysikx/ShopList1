package com.example.myapplication.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplication.domain.ShopClass
import com.example.myapplication.domain.ShopListInterface
import java.lang.Exception

object ImplShopList: ShopListInterface {

 val shopList = mutableListOf<ShopClass>()

   var idPlus = 0

    val liveDataShopList = MutableLiveData<List<ShopClass>>()
    init {
        for (i in 0 until 11) {
            val l = ShopClass(4, "name: $i", true)
            addShopItem(l)
        }
    }


    override fun addShopItem(shopItem: ShopClass) {
        if (shopItem.id == 0) {
            shopItem.id = idPlus
            idPlus++
        }
        shopList.add(shopItem)
        update()
    }

    override fun deleteShopItem(shopItem: ShopClass) {
        shopList.remove(shopItem)
        update()
    }

    override fun editShopItem(shopClass: ShopClass) {
        val element = ShopItemId(shopClass.id)
        shopList.remove(element)
        addShopItem(shopClass)

    }

    override fun ShopItemId(id: Int): ShopClass {
        return shopList.find {it.id == id}?:throw Exception("")
    }

    override fun ShopList(): LiveData<List<ShopClass>> {
        return liveDataShopList
    }

    fun update() {
        liveDataShopList.value = shopList.toList()
    }
}