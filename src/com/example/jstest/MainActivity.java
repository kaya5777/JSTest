package com.example.jstest;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@SuppressLint("JavascriptInterface")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView wv = (WebView) findViewById(R.id.webView1);
		wv.getSettings().setJavaScriptEnabled(true);
		wv.setWebChromeClient(new WebChromeClient(){});
		JsObject jObj = new JsObject(this);
		wv.addJavascriptInterface(jObj, "hoge");
		wv.loadUrl("file:///android_asset/index.html");
		
	}
}
