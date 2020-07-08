package com.example.kw_favorite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kw_favorite.Library.LibrarySearchActivity;
import com.example.kw_favorite.University.UniversityNoticeActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnLibrary, btnUniversityNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLibrary = findViewById(R.id.btnLibrary);//도서관 버튼 누를 시
        btnLibrary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LibrarySearchActivity.class);
                startActivity(intent);//액티비티 이동
            }
        });

        btnUniversityNotice = findViewById(R.id.btnUniversityNotice);   //학교 공지사항 누를 시
        btnUniversityNotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UniversityNoticeActivity.class);
                startActivity(intent);
            }
        });


    }

}
