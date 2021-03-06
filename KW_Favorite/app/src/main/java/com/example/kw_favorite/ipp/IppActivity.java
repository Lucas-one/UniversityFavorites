package com.example.kw_favorite.ipp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.example.kw_favorite.MainActivity;
import com.example.kw_favorite.R;

public class IppActivity extends AppCompatActivity {

    private WebView webView;
    private String url = "https://ipp.kw.ac.kr/common/common.do?jsp_path=/index";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ipp);

        Intent intent = getIntent();//Main에서 데이터 넘길 경우 받는다.

        webView = (WebView)findViewById(R.id.webView);
        MainActivity.connectSite(webView, url);

    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if((keyCode == KeyEvent.KEYCODE_BACK) && webView.canGoBack()){
            webView.goBack();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private class WebViewClientClass extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {//현재 페이지의 url읽어오기
            view.loadUrl(url);
            return true;
        }
    }
}
