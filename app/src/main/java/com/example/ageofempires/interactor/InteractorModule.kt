package com.example.ageofempires.interactor

import com.example.ageofempires.interactor.civilization.CivilizationInteractor
import com.example.ageofempires.network.CivilizationApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideCivilizationInteractor(civApi: CivilizationApi) = CivilizationInteractor(civApi)
}