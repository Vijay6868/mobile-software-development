package com.example.dbdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dbdemo.db.Student;
import com.example.dbdemo.db.StudentDao;
import com.example.dbdemo.db.Studentdb;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    StudentDao studentDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentDao = Studentdb.getInstance(this).studentDao();
    }
    public void addStudent(View view){
        Student s = new Student("John",85);
        studentDao.insertStudent(s);
    }
    public void deleteStudent(View view){
        studentDao.deleteAllStudents();
        Toast.makeText(this, "All students deleted", Toast.LENGTH_SHORT).show();
    }
    public void displayAll(View view){
        List<Student> students = studentDao.getAllStudents();

    }
}