package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ReportCard Student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student = new ReportCard("Adam", "Verano", "6C");
        Student.setMathGrade("5+");
        Student.setChemistryGrade("4-");
        Student.setArtGrade("3+");
    }

    public void ShowReportCard(View v){
        TextView show=(TextView) findViewById(R.id.Output);
        show.setText(Student.toString());
    }
}
