package com.example.aaa;

import java.util.List;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author 李静南
 */
public class TwoFragment extends Fragment {
	TextView tv;
	View view1;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view1 = inflater.inflate(R.layout.two, container, false);
		return view1;
	}
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
		tv = (TextView) view1.findViewById(R.id.tv_two);
		tv.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
//				Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
				// Or map point based on latitude/longitude
				// Uri location = Uri.parse("geo:37.422219,-122.08364?z=14"); // z param is zoom level
//				Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
//				PackageManager packageManager=getActivity().getPackageManager();
//				List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
//				tv.setText(activities.size()+"");
//				startActivity(mapIntent);
				
//				Intent intent = new Intent(Intent.ACTION_SEND);
				// Always use string resources for UI text. This says something like "Share this photo with"
				// Create and start the chooser
//				Intent chooser = Intent.createChooser(intent, "hello");
//				startActivity(chooser);
				listAccounts(getActivity());
			}
		});
		
		
		RadioGroup radioGroup= (RadioGroup) view1.findViewById(R.id.radioGroup);
		radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				switch (checkedId) {
				case R.id.radio_one:
					Toast.makeText(getActivity(), "1", 0).show();
					break;
				case R.id.radio_two:
					Toast.makeText(getActivity(), "2", 0).show();
					break;

				default:
					break;
				}
			}
		});
		
		
		
		
		
	}
	
	private void listAccounts(Context context){
		AccountManager am =AccountManager.get(getActivity());
		Account[] accounts = am.getAccounts();
		for (Account account: accounts) {
			Log.d("123", account.name+"   "+account.type);
		}
	}

}
