package com.example.aaa;

import android.R.integer;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author 李静南
 */
public class OneFragment extends Fragment {
	TextView tv;
	View view1;
	 int i=0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view1 = inflater.inflate(R.layout.one, container, false);
		MyToast.builder.init(getActivity());
		return view1;
	}

	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		tv = (TextView) view1.findViewById(R.id.tv_one);
		tv.setPadding(tv.getPaddingLeft(), -tv.getPaddingTop(), tv.getPaddingRight(), tv.getPaddingBottom());
		MyToast.builder.init(getActivity());
		tv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// Uri webpage = Uri.parse("http://www.baidu.com");
				// Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
				// startActivity(webIntent);
				i++;
				MyToast.builder.display(i+"", 1);
			}
		});
	}

	public enum MyToast {
		builder;
		private View v;
		private TextView tv;
		private Toast toast;

		private void init(Context c) {
			// v = Toast.makeText(c, "", Toast.LENGTH_SHORT).getView();
			v = LayoutInflater.from(c).inflate(R.layout.toast, null);
			tv = (TextView) v.findViewById(R.id.tv_toast);
			toast = new Toast(c);
			toast.setView(v);
		}

		public void display(int Resid, int duration) {
			if (Resid != 0) {
				tv.setText(Resid);
				toast.setDuration(duration);
				toast.show();
			}
		}

		public void display(CharSequence text, int duration) {
			if (text.length() != 0) {
				tv.setText(text);
				toast.setDuration(duration);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();
			}
		}
	}
}
