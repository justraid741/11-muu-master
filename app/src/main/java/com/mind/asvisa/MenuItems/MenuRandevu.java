package com.mind.asvisa.MenuItems;

import androidx.appcompat.app.AppCompatActivity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.mind.asvisa.R;

public class MenuRandevu extends AppCompatActivity {
    private WebView webView;
    private CustomWebViewClient webViewClient;
    private String Url = "https://www.as-visa.com/online-randevu.aspx";
    ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_randevu);


        mProgressDialog = new ProgressDialog(this);//ProgressDialog objesi oluşturuyoruz
        mProgressDialog.setMessage("Yükleniyor...");//ProgressDialog Yükleniyor yazısı

        webViewClient = new CustomWebViewClient();//CustomWebViewClient classdan webViewClient objesi oluşturuyoruz

        webView = (WebView) findViewById(R.id.webRan);//webview mızı xml anasayfa.xml deki webview bağlıyoruz
        webView.getSettings().setBuiltInZoomControls(true); //zoom yapılmasına izin verir
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(webViewClient); //oluşturduğumuz webViewClient objesini webViewımıza set ediyoruz
        webView.loadUrl(Url);
    }

    private class CustomWebViewClient extends WebViewClient {


    }
}