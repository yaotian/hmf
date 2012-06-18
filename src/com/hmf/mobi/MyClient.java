package com.hmf.mobi;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.hmf.mobi.R;

public class MyClient extends WebViewClient {
	@Override
	public boolean shouldOverrideUrlLoading(WebView view, String url) {
		// only open new browser when access protocal of ext://
		if (url.contains("ext://")) {
			System.out.println("using ext:// and return false");
			return false;
		} else {
			System.out.println("load url");
			view.loadUrl(url);
			return true;
		}
	}

}
