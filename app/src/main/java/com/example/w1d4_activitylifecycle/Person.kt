package com.example.w1d4_activitylifecycle

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Person(var age:Int, val name:String) : Parcelable