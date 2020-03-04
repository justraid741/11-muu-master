package com.mind.asvisa.MenuItems;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

import com.mind.asvisa.R;

public class MenuOnemli extends AppCompatActivity {
    private WebView webView;
    private String Url = "https://www.as-visa.com/DynamicPage.aspx?ID=415";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_onemli);

        webView = (WebView) findViewById(R.id.webOn);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(Url);
    }
}
