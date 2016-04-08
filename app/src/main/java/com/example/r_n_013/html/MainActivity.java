package com.example.r_n_013.html;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Window;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        WebView myWebView = (WebView) findViewById(R.id.webView1);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl("file:///android_asset/index.html");
        myWebView.getSettings().setJavaScriptEnabled(true);
    }


}


