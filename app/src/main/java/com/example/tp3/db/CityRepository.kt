package com.example.tp3.db

import androidx.lifecycle.LiveData
import com.example.tp3.dao.CityDao
import com.example.tp3.entities.City

// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
class CityRepository(private val cityDao: CityDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allCities: LiveData<List<City>> = cityDao.getAlphabetizedCities()

    suspend fun insert(city: City) {
        cityDao.insert(city)
    }

    suspend fun deleteAll(){
        cityDao.deleteAll()
    }

}