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
     // WebView�𐶐�
     WebView webView = new WebView(getApplicationContext());
	// WebView���Z�b�g 
     setContentView(webView); 
	// JavaScript��L���� 
     webView.getSettings().setJavaScriptEnabled(true);
	// HTML��ǂݍ��� 
     webView.loadUrl("file:///android_asset/main.html");
 }
}
