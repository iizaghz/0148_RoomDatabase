package com.example.roomsiswa.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Update
import androidx.room.Delete
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import androidx.room.OnConflictStrategy

@Dao
interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(siswa: Siswa)

    // edit : tambah 3 fungsi
    @Query
    ("SELECT * from tabel_siswa WHERE id = :id")
    fun getSiswa(id: Int): Flow<Siswa>

    @Update
    suspend fun update(siswa: Siswa)

    @Delete
    suspend fun delete(siswa: Siswa)


    @Query("SELECT * from tabel_siswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}