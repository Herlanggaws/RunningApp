package com.herlanggaws.runningapp.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

/**
 * Designed and developed by Herlangga Wicaksono on 18/11/23.
 * @LinkedIn (https://www.linkedin.com/in/herlangga-wicaksono-4072a5a2/)
 */

@Dao
interface RunDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("select * from running_table order by timestamp desc")
    fun getAllRunSortedByDate(): LiveData<List<Run>>

    @Query("select * from running_table order by timeInMillis desc")
    fun getAllRunSortedByTimeInMillis(): LiveData<List<Run>>

    @Query("select * from running_table order by caloriesBurned desc")
    fun getAllRunSortedByCaloriesBurned(): LiveData<List<Run>>

    @Query("select * from running_table order by avgSpeedInKMH desc")
    fun getAllRunSortedByAvgSpeed(): LiveData<List<Run>>

    @Query("select * from running_table order by distanceInMeter desc")
    fun getAllRunSortedByDistance(): LiveData<List<Run>>

    @Query("select sum(timeInMillis) from running_table")
    fun getTotalTimeInMillis(): LiveData<Long>

    @Query("select sum(caloriesBurned) from running_table")
    fun getTotalCaloriesBurned(): LiveData<Int>

    @Query("select sum(distanceInMeter) from running_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("select avg(avgSpeedInKMH) from running_table")
    fun getTotalAvgSpeed(): LiveData<Float>
}