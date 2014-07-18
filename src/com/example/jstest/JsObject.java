package com.example.jstest;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JsObject {
	private Context context;
	 
	  public JsObject(Context context) {
	    this.context = context;
	  }

	  @JavascriptInterface
	  public void viewToast(String text) {
		  Toast.makeText(context, text, Toast.LENGTH_LONG).show();
	  }
}
