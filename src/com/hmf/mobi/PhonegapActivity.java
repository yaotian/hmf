package com.hmf.mobi;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class PhonegapActivity extends DroidGap {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 super.loadUrl("file:///android_asset/www/index2.html");
		
		
//		super.onCreate(savedInstanceState);
//		setContentView(R.layout.main);
//		
//		WebView myWebView = ((WebView) findViewById(R.id.MyWebView));
//		// Required to work with Javascript
//		myWebView.getSettings().setJavaScriptEnabled(true);
//		myWebView.setWebViewClient(new MyClient());
//
////		super.setIntegerProperty("splashscreen", R.drawable.splash);
//		myWebView.loadUrl("file:///android_asset/www/index.html");

	}
}