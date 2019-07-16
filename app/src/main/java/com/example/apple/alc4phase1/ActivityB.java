package com.example.apple.alc4phase1;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityB extends AppCompatActivity {
    private WebView webView;
    //private String url = ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Drawable upArrow = getResources().getDrawable(R.drawable.back_arrow);
        upArrow.setColorFilter(getResources().getColor(R.color.color_white), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        webView = (WebView) findViewById(R.id.webView);
        webView.getSettings().getJavaScriptEnabled();
        final Activity activity = this;
        //customizing the text in action bar
//        TextView tv = new TextView(getApplicationContext());
//        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
//        tv.setLayoutParams(lp);
//        tv.setText("WelcALC 4 Phase 1ome!");
//        tv.setTextSize(14);
//        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
//        getSupportActionBar().setCustomView(tv);
        webView.setWebViewClient(new WebViewClient(){
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, String url) {
//                if (!url.equals("about:blank")) {
//                    view.loadUrl("https://www.google.com/");
//                }
//                return false;
//            }
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                //super.onReceivedSslError(view, handler, error);
                switch (error.getPrimaryError()) {
                    case SslError.SSL_UNTRUSTED:
                        Log.d("Error","SslError : The certificate authority is not trusted.");
                        break;
                    case SslError.SSL_EXPIRED:
                        Log.d("Error","SslError : The certificate has expired.");
                        break;
                    case SslError.SSL_IDMISMATCH:
                        Log.d("Error","The certificate Hostname mismatch.");
                        break;
                    case SslError.SSL_NOTYETVALID:
                        Log.d("Error","The certificate is not yet valid.");
                        break;
                }
                handler.proceed();
            }
//@SuppressWarnings("deprecation")
//@Override
//public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
//    Toast.makeText(activity, description, Toast.LENGTH_SHORT).show();
//}
//            @TargetApi(android.os.Build.VERSION_CODES.M)
//            @Override
//            public void onReceivedError(WebView view, WebResourceRequest req, WebResourceError rerr) {
//                // Redirect to deprecated method, so you can use it in all SDK versions
//                onReceivedError(view, rerr.getErrorCode(), rerr.getDescription().toString(), req.getUrl().toString());
//            }
        });
        webView.loadUrl("https://andela.com/alc/");

    }
}
