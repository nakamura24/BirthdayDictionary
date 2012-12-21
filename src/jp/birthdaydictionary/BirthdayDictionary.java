package jp.birthdaydictionary;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.webkit.WebView;

public class BirthdayDictionary extends Activity {
	   /** Called when the activity is first created. */
@SuppressLint("SetJavaScriptEnabled")
@Override
 public void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     // WebViewを生成
     WebView webView = new WebView(getApplicationContext());
	// WebViewをセット 
     setContentView(webView); 
	// JavaScriptを有効に 
     webView.getSettings().setJavaScriptEnabled(true);
	// HTMLを読み込む 
     webView.loadUrl("file:///android_asset/main.html");
 }
}
