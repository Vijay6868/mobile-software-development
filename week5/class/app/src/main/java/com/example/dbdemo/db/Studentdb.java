package com.example.dbdemo.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


@Database(entities = {Student.class}, version =2 , exportSchema = false)
public abstract class Studentdb extends RoomDatabase{
    private static Studentdb studentdb=null;
    public abstract StudentDao studentDao();

    public static Studentdb getInstance(Context context){
        if(studentdb==null){
            studentdb = Room.databaseBuilder(context.getApplicationContext(),
                    Studentdb.class,"StudentDB").allowMainThreadQueries().build();
        }
        return studentdb;
    }

}
