package com.example.aaa;

import cn.jpush.android.api.JPushInterface;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author 李静南
 */
public class PushActivity extends Activity {
	TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.one);
		tv = (TextView) findViewById(R.id.tv_one);

		Intent intent = getIntent();
		if (null != intent) {
			Bundle bundle = intent.getExtras();
			String titleString = bundle
					.getString(JPushInterface.EXTRA_NOTIFICATION_TITLE);
			String contentString = bundle.getString(JPushInterface.EXTRA_ALERT);

			tv.setText("title:" + titleString + "   content:" + contentString);

		}

	}

}
