package com.example.ageofempires.ui.list

import com.example.ageofempires.model.Civilization

interface ListScreen {
    fun showCivilizations(civList: List<Civilization>)
}