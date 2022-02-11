package id.my.anandalukman.bean

import kotlinx.serialization.Serializable

@Serializable
data class Sexy(
    val name: String,
    val description: String,
    val imageUrl: String
)