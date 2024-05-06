package com.notes.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
