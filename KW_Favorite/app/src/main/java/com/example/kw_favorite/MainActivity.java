package com.example.kw_favorite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import com.example.kw_favorite.calender.CalenderActivity;
import com.example.kw_favorite.call.CallActivity;
import com.example.kw_favorite.campus.CampusActivity;
import com.example.kw_favorite.ipp.IppActivity;
import com.example.kw_favorite.library.LibrarySearchActivity;
import com.example.kw_favorite.university.UniversityNoticeActivity;
import com.example.kw_favorite.webMail.WebMailActivity;


public class MainActivity extends AppCompatActivity {

    private Button btnLibrary, btnUniversityNotice, btnCalender, btnCampus, btnCall, btnWebMail, btnIpp;

    public static void connectSite(WebView webView, String url){
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());

        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);

        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLibrary = findViewById(R.id.btnLibrary);//도서관 버튼 누를 시
        btnUniversityNotice = findViewById(R.id.btnUniversityNotice);   //학교 공지사항 누를 시
        btnCalender = findViewById(R.id.btnCalender);
        btnCampus = findViewById(R.id.btnCampus);
        btnCall = findViewById(R.id.btnCall);
        btnWebMail = findViewById(R.id.btnWebMail);
        btnIpp = findViewById(R.id.btnIPP);
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

        //캠퍼스
        btnCampus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CampusActivity.class);
                startActivity(intent);
            }
        });

        //전화번호
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CallActivity.class);
                startActivity(intent);
            }
        });

        //웹메일
        btnWebMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebMailActivity.class);
                startActivity(intent);
            }
        });

        //Ipp
        btnIpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IppActivity.class);
                startActivity(intent);
            }
        });

    }

}
