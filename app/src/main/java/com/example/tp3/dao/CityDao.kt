package com.example.tp3.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.tp3.entities.City

@Dao
interface CityDao {

    @Query("SELECT * from city_table ORDER BY city ASC")
    fun getAlphabetizedCities(): LiveData<List<City>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(city: City)

    @Query("DELETE FROM city_table")
    suspend fun deleteAll()


}