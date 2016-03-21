package com.example.aaa;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import cn.jpush.android.api.JPushInterface;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		JPushInterface.setDebugMode(true);
		JPushInterface.init(this);
		setContentView(R.layout.fragment_text);
//		PackageManager pm = getPackageManager();
//		boolean flag = (PackageManager.PERMISSION_GRANTED == pm
//				.checkPermission("android.permission.CALL_PHONE",
//						"com.example.aaa"));
//		Toast.makeText(getApplicationContext(), flag + "", 1).show();
//		int i = 1;
//		i = i << 2;
//		Log.d("123", i + "");
//		final WebView web = (WebView) findViewById(R.id.wv);
//		web.getSettings().setJavaScriptEnabled(true); 
//		// 设置可以支持缩放 
//		web.getSettings().setSupportZoom(true); 
//		// 设置出现缩放工具 
//		web.getSettings().setBuiltInZoomControls(true);
//		//扩大比例的缩放
//		web.getSettings().setUseWideViewPort(true);
//		//自适应屏幕
//		web.getSettings().setLoadWithOverviewMode(true);
//		web.setWebViewClient(new WebViewClient(){
//			@Override
//			public void onPageStarted(WebView view, String url, Bitmap favicon) {
//				// TODO Auto-generated method stub
//				super.onPageStarted(view, url, favicon);
//			}
//			
//
//			@Override
//			public boolean shouldOverrideUrlLoading(WebView view, String url) {
//
//				web.loadUrl(url);
//				return true;
//			}
//		});
////		web.loadUrl("http://www.qingzhou.net.cn/hd/2016315m/yq.html");
//		web.loadUrl("http://www.baidu.com");
	}

	@Override
	@Deprecated
	protected Dialog onCreateDialog(int id) {
		// TODO Auto-generated method stub

		return super.onCreateDialog(id);
	}

//	@Override
//	public boolean onKeyDown(int keyCode, KeyEvent event) {
//		if (keyCode == KeyEvent.KEYCODE_BACK) {
//			 Fragment1 dialogFragment = Fragment1.newInstance(
//	                    "Are you sure you want to do this?"); 
//	                dialogFragment.show(getFragmentManager(), "dialog"); 
//		}
//		return true;
//	}

	public void doPositiveClick() {
		Toast.makeText(getApplicationContext(), "确认退出", 1).show();
	}

	public void doNegativeClick() {
		// TODO Auto-generated method stub

	}
}
