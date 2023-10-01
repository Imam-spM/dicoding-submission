package com.imam.dicoding_ml.model

import android.provider.ContactsContract.CommonDataKinds.Nickname

data class ModelHero (
    var name: String = "",
    var role: String = "",
    var nickname: String = "",
    var bio: String = "",
    var pic: Int = 0,
    var background: Int = 0,
    var element: Int = 0,
)