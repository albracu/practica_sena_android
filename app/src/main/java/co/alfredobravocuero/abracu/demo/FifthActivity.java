package co.alfredobravocuero.abracu.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FifthActivity extends AppCompatActivity {
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        webview = (WebView) findViewById(R.id.webview);

        webview.loadUrl("https://vtiger.com.co");

        webview.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlloading(WebView view, String url){
                return false;
            }

        }
        );
    }
}
