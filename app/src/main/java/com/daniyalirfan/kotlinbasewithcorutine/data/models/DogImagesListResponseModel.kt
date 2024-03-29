package com.daniyalirfan.kotlinbasewithcorutine.data.models


import com.google.gson.annotations.SerializedName

data class DogImagesListResponseModel(
    @SerializedName("breeds")
    val breeds: List<Breed?>?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("url")
    val url: String?,
    @SerializedName("width")
    val width: Int?
) {
    data class Breed(
        @SerializedName("bred_for")
        val bredFor: String?,
        @SerializedName("breed_group")
        val breedGroup: String?,
        @SerializedName("height")
        val height: Height?,
        @SerializedName("id")
        val id: Int?,
        @SerializedName("life_span")
        val lifeSpan: String?,
        @SerializedName("name")
        val name: String?,
        @SerializedName("origin")
        val origin: String?,
        @SerializedName("reference_image_id")
        val referenceImageId: String?,
        @SerializedName("temperament")
        val temperament: String?,
        @SerializedName("weight")
        val weight: Weight?
    ) {
        data class Height(
            @SerializedName("imperial")
            val imperial: String?,
            @SerializedName("metric")
            val metric: String?
        )

        data class Weight(
            @SerializedName("imperial")
            val imperial: String?,
            @SerializedName("metric")
            val metric: String?
        )
    }
}