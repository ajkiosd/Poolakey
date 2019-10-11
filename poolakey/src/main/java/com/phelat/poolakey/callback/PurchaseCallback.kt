package com.phelat.poolakey.callback

import com.phelat.poolakey.entity.PurchaseInfo

class PurchaseCallback {

    internal var purchaseSucceed: (PurchaseInfo) -> Unit = {}

    internal var purchaseCanceled: () -> Unit = {}

    internal var purchaseFailed: () -> Unit = {}

    fun purchaseSucceed(block: (PurchaseInfo) -> Unit) {
        purchaseSucceed = block
    }

    fun purchaseCanceled(block: () -> Unit) {
        purchaseCanceled = block
    }

    fun purchaseFailed(block: () -> Unit) {
        purchaseFailed = block
    }

}
