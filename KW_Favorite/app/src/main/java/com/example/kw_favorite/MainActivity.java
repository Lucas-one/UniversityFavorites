package com.example.kw_favorite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kw_favorite.calender.CalenderActivity;
import com.example.kw_favorite.library.LibrarySearchActivity;
import com.example.kw_favorite.university.UniversityNoticeActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLibrary, btnUniversityNotice, btnCalender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLibrary = findViewById(R.id.btnLibrary);//도서관 버튼 누를 시
        btnUniversityNotice = findViewById(R.id.btnUniversityNotice);   //학교 공지사항 누를 시
        btnCalender = findViewById(R.id.btnCalender);

        //도서관
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LibrarySearchActivity.class);
                startActivity(intent);//액티비티 이동
            }
        });

        //대학 홈페이지
        btnUniversityNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UniversityNoticeActivity.class);
                startActivity(intent);
            }
        });

        //학사일정
        btnCalender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CalenderActivity.class);
                startActivity(intent);
            }
        });

    }

}
