package com.example.dbdemo.db;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface StudentDao {
    @Insert
    void insertStudent(Student s);
    @Delete
    void deleteStudent(Student s);
    @Query("SELECT * FROM Student")
    List<Student> getAllStudents();
    @Query("DELETE FROM Student")
    void deleteAllStudents();
}
