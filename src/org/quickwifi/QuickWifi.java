package org.quickwifi;

import android.app.Activity;
import android.os.Bundle;

/**
 * QuickWifi main activity.
 * 
 * @author takayuki hirota
 */
public class QuickWifi extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quick_wifi);

		if (new WifiSwitch(this).toggle()) {
			new AirplaneModeSwitch(this).disable();
		} else {
			new AirplaneModeSwitch(this).enable();
		}

		finish();
	}
}
