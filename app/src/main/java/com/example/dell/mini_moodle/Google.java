package com.example.dell.mini_moodle;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static android.view.View.SCROLLBARS_INSIDE_OVERLAY;

/**
 * Created by DELL on 10/11/2017.
 */

public class Google extends MainActivity  {
    WebView Browser;
    private class WebClient extends WebViewClient
    {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.g_search);
        Browser = (WebView) findViewById(R.id.Webengine);
        Browser.getSettings().setLoadsImagesAutomatically(true);
        Browser.getSettings().setJavaScriptEnabled(true);

        Browser.setScrollBarStyle(SCROLLBARS_INSIDE_OVERLAY);
        Browser.loadUrl("http://www.google.co.co.za/");

    }
}
