package com.example.hw13.models

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Account(@PrimaryKey(autoGenerate = true)var id:Int,
                   var accountType:AccountType, var cardNumber:String, var balance:Double)

enum class AccountType{
    SavingsAccount , LongTerm , ShortTerm
}