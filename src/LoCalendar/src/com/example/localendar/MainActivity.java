package com.example.localendar;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	GPSTracker gps;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	}

	public void onClickB(View v) {
		Intent i = new Intent(getApplicationContext(), CalendarActivity.class);
		//test add event
		
		// create class object
        gps = new GPSTracker(MainActivity.this);
        double maxLatId = -6.054967,maxLatMy = 3.26395,maxLatSG = 1.410767;
        double minLatId = -6.664883,minLatMy = 3.076317,minLatSG = 1.262583;
        double minLonId = 106.454883,minLonMy = 101.361333,minLonSG = 103.613267;
        double maxLonId = 107.163333,maxLonMy = 101.74245,maxLonSG = 104.072983;
		// check if GPS enabled		
        if(gps.canGetLocation()){
        	
        	double latitude = gps.getLatitude();
        	double longitude = gps.getLongitude();
        	GlobalDataClass gds = new GlobalDataClass(this);
        	if(((latitude>minLatId) && (latitude<maxLatId)) && ((longitude>minLonId) && (longitude<maxLonId))){
        		Toast.makeText(getApplicationContext(), "Your country:  Indonesia", Toast.LENGTH_LONG).show();	
        		gds.createIDSession("Indonesia");
        	}
        	else if(((latitude>minLatMy) && (latitude<maxLatMy)) && ((longitude>minLonMy) && (longitude<maxLonMy))){
        		Toast.makeText(getApplicationContext(), "Your country:  Malaysia", Toast.LENGTH_LONG).show();	
        		gds.createIDSession("Malaysia");
        	}
        	else if(((latitude>minLatSG) && (latitude<maxLatSG)) && ((longitude>minLonSG) && (longitude<maxLonSG))){
        		Toast.makeText(getApplicationContext(), "Your country:  Singapore", Toast.LENGTH_LONG).show();	
        		gds.createIDSession("Singapura");
        	}else{
        		Toast.makeText(getApplicationContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude , Toast.LENGTH_LONG).show();
        		gds.createIDSession("Indonesia");
        	}
        	// \n is for new line
        		
        }else{
        	// can't get location
        	// GPS or Network is not enabled
        	// Ask user to enable GPS/network in settings
        	gps.showSettingsAlert();
        }

		
		startActivity(i);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
