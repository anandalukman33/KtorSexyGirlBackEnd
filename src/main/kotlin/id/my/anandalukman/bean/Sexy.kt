package id.my.anandalukman.bean

import kotlinx.serialization.Serializable

/**
 * Data Bean Sexy Girl
 */

@Serializable
data class Sexy(
    val name: String,
    val description: String,
    val imageUrl: String
)