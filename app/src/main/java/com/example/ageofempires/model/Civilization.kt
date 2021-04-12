package com.example.ageofempires.model

import com.google.gson.annotations.SerializedName

data class Civilization(
    @SerializedName("id")
    var id: Int? = null,
    @SerializedName("name")
    var name: String? = null,
    @SerializedName("expansion")
    var expansion: String? = null,
    @SerializedName("army_type")
    var army_type: String? =null,
    @SerializedName("unique_unit")
    var unique_unit: List<String>? = null,
    @SerializedName("unique_tech")
    var unique_tech: List<String>? = null,
    @SerializedName("team_bonus")
    var team_bonus: String? = null,
    @SerializedName("civilization_bonus")
    var civilization_bonus: List<String>? = null
)
