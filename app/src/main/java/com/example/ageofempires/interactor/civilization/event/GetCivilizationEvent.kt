package com.example.ageofempires.interactor.civilization.event

import com.example.ageofempires.model.Civilization

data class GetCivilizationEvent (
    var code: Int = 0,
    var civilization: List<Civilization>? = null,
    var throwable: Throwable? = null
)