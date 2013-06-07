package org.quickwifi;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.util.Log;

/**
 * Switch for Wifi.
 * 
 * <p>
 * uses-permission
 * <ul>
 * <li>android.permission.ACCESS_WIFI_STATE</li>
 * <li>android.permission.CHANGE_WIFI_STATE</li>
 * </ul>
 * </p>
 * 
 * @author takayuki hirota
 */
public class WifiSwitch {
	private static final String TAG = "WifiSwitch";

	private final Activity activity;

	public WifiSwitch(final Activity activity) {
		this.activity = activity;
	}

	/**
	 * turn on/off wifi.
	 * 
	 * @return current wifi status after toggled
	 */
	public boolean toggle() {
		final WifiManager wifi = (WifiManager) activity
				.getSystemService(Context.WIFI_SERVICE);
		final boolean wifiEnabled = wifi.isWifiEnabled();
		Log.i(TAG, "wifiEnabled: " + wifiEnabled);
		wifi.setWifiEnabled(!wifiEnabled);
		return !wifiEnabled;
	}

}
