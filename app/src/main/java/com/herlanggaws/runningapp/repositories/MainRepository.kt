package com.herlanggaws.runningapp.repositories

import com.herlanggaws.runningapp.db.Run
import com.herlanggaws.runningapp.db.RunDAO
import javax.inject.Inject

/**
 * Designed and developed by Herlangga Wicaksono on 23/11/23.
 * @LinkedIn (https://www.linkedin.com/in/herlangga-wicaksono-4072a5a2/)
 */

class MainRepository @Inject constructor(
    val runDao: RunDAO
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunsSortedByDate() = runDao.getAllRunSortedByDate()

    fun getAllRunSortedByTimeInMillis() = runDao.getAllRunSortedByTimeInMillis()

    fun getAllRunSortedByCaloriesBurned() = runDao.getAllRunSortedByCaloriesBurned()

    fun getAllRunSortedByAvgSpeed() = runDao.getAllRunSortedByAvgSpeed()

    fun getAllRunSortedByDistance() = runDao.getAllRunSortedByDistance()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalCaloriesBurned() = runDao.getTotalCaloriesBurned()

    fun getTotalDistance() = runDao.getTotalDistance()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()
}