package com.educate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebView;

public class EducateActivity extends AppCompatActivity {
    private WebView educateView;
    private static final String STARTUP_URL = "https://elearning.prernaeducation.co.in";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        educateView = (WebView) findViewById(R.id.educateView);
        educateView.clearCache(true);
        educateView.getSettings().setJavaScriptEnabled(true);
        educateView.getSettings().setAppCacheEnabled(false);
        educateView.setWebViewClient(new EducateWebViewClient());
        educateView.addJavascriptInterface(
                new EducateViewInterface(EducateActivity.this, this),
                "AndroidSystem"
        );

        educateView.loadUrl(EducateActivity.STARTUP_URL);
    }
}
