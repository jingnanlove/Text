package com.example.aaa.util;
/**
 *@author 李静南
 */
public class Utils {
	public static int getSystemVersion() {
		return android.os.Build.VERSION.SDK_INT;
	}

	/**
	 * 在button点击事件里面 button防止多次点击
	 * 
	 * */
	private static long lastClickTime;

	public static boolean isFastDoubleClick() {
		long time = System.currentTimeMillis();
		if (time - lastClickTime < 500) {
			return true;
		}
		lastClickTime = time;
		return false;
	}
}
