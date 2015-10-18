package com.example.localendar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.TextView;

public class CalendarActivity extends Activity {

	CalendarView cal;
	TextView tv;
	String country = "default";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar_layout);

		cal = (CalendarView) findViewById(R.id.calendarView1);
		tv  = (TextView)findViewById(R.id.textView1);
		GlobalDataClass gds = new GlobalDataClass(this);
		country = gds.getSessionID();
		cal.setOnDateChangeListener(new OnDateChangeListener() {
		
		
			@Override
			public void onSelectedDayChange(CalendarView view, int year,
					int month, int dayOfMonth) {
				// TODO Auto-generated method stub
				if (country.equals("Indonesia")){
				tv.setText(setIndonesiaHoliday(settDate(month+1,dayOfMonth)));
				} 
				else if(country.equals("Malaysia")){
				tv.setText(setMalaysiaHoliday(settDate(month+1,dayOfMonth)));	
				}else{
				tv.setText(setSingapuraHoliday(settDate(month+1,dayOfMonth)));
				}
			}
		});
	}

	public String setIndonesiaHoliday(String da){
    	String currentEvent = null;
    	if(da.equals("11")){
    		currentEvent = "New Year (Public Holiday)";
    	}else if(da.equals("114")){
    		currentEvent = "Prophet Muhammad Birthday (Public Holiday)";
    	}else if(da.equals("131")){
    		currentEvent = "Chinese New Year (Public Holiday)";
    	}else if(da.equals("29")){
    		currentEvent = "National Press";
    	}else if(da.equals("228")){
    		currentEvent = "National Nutritional Day";
    	}else if(da.equals("39")){
    		currentEvent = "Indonesian Woman Day";
    	}else if(da.equals("331")){
    		currentEvent = "Nyepi Day (Public Holiday)";
    	}else if(da.equals("418")){
    		currentEvent = "Good friday (Public Holiday)";
    	}else if(da.equals("421")){
    		currentEvent = "Kartini's Day";
    	}else if(da.equals("51")){
    		currentEvent = "Labour Day (Public Holiday)";
    	}else if(da.equals("52")){
    		currentEvent = "National Education Day";
    	}else if(da.equals("515")){
    		currentEvent = "Vesak (Waisak) Day (Public Holiday)";
    	}else if(da.equals("527")){
    		currentEvent = "Isra' Mi'raj (Public Holiday)";
    	}else if(da.equals("529")){
    		currentEvent = "Easter Day (Public Holiday)";
    	}else if(da.equals("728")){
    		currentEvent = "Eid al-fitr (Public Holiday)";
    	}else if(da.equals("817")){
    		currentEvent = "Indenpendent Day of Indonesia(Public Holiday)";
    	}else if(da.equals("93")){
    		currentEvent = "PMI's day";
    	}else if(da.equals("102")){
    		currentEvent = "Batik Guru";
    	}else if(da.equals("105")){
    		currentEvent = "Eid al-adha (Public Holiday)";
    	}else if(da.equals("1024")){
    		currentEvent = "Indonesian's Dokter Day";
    	}else if(da.equals("1025")){
    		currentEvent = "Islamic Years (Public Holiday)";
    	}else if(da.equals("1028")){
    		currentEvent = "Sumpah Pemuda";
    	}else if(da.equals("1110")){
    		currentEvent = "Hari Pahlawan";
    	}else if(da.equals("1125")){
    		currentEvent = "Hari Guru PGRI";
    	}else if(da.equals("1126")){
    		currentEvent = "No Shopping Day";
    	}else if(da.equals("1222")){
    		currentEvent = "Mother's Day";
    	}else if(da.equals("1225")){
    		currentEvent = "Christmas Day(Public Holiday)";
    	}else{
    		currentEvent = " ";
    	}
		return currentEvent;
    }
	
	public String setMalaysiaHoliday(String da){
    	String currentEvent = null;
    	if(da.equals("11")){
    		currentEvent = "New Years (Public Holiday)";
    	}else if(da.equals("114")){
    		currentEvent = "Prophet Muhammad Birthday (Public Holiday)";
    	}else if(da.equals("117")){
    		currentEvent = "Thaipusam";
    	}else if(da.equals("119")){
    		currentEvent = "Sultan of Kedah Birthday (Regional Holiday)";
    	}else if(da.equals("131")){
    		currentEvent = "Chinese New years (Public Holiday)";
    	}else if(da.equals("419")){
    		currentEvent = "Sultan of Perak's Birthday (Regional Holiday)";
    	}else if(da.equals("51")){
    		currentEvent = "Labour Day (Public Holiday)";
    	}else if(da.equals("513")){
    		currentEvent = "Vesak (Waisak) Day (Public Holiday)";
    	}else if(da.equals("517")){
    		currentEvent = "Raja Perlis's Birthday (Regional Holiday)";
    	}else if(da.equals("530")){
    		currentEvent = "Harvest Festival (Regional Holiday)";
    	}else if(da.equals("67")){
    		currentEvent = "Malaysian King's BrithDay (Public Holiday)";
    	}else if(da.equals("712")){
    		currentEvent = "Penang Governor's Birthday (Regional Holiday)";
    	}else if(da.equals("728")){
    		currentEvent = "Eid al-fitr (Public Holiday)";
    	}else if(da.equals("831")){
    		currentEvent = "Indenpendent Day of Malaysia(Public Holiday)";
    	}else if(da.equals("916")){
    		currentEvent = "Malaysia Day & Sabah Governor's Birthday (Public Holiday)";
    	}else if(da.equals("104")){
    		currentEvent = "Sabah Governor's Birthday (Regional Holiday)";
    	}else if(da.equals("105")){
    		currentEvent = "Eid al-adha (Public Holiday)";
    	}else if(da.equals("1010")){
    		currentEvent = "Malacca Governor's Birthday (Regional Holiday)";
    	}else if(da.equals("1023")){
    		currentEvent = "Deevavali (Public Holiday)";
    	}else if(da.equals("1024")){
    		currentEvent = "Sultan of Pahang's Birthday (Regional Holiday)";
    	}else if(da.equals("1025")){
    		currentEvent = "Islamic New Year (Public Holiday)";
    	}else if(da.equals("1111")){
    		currentEvent = "Sultan of Kelantan's Birthday (Regional Holiday)";
    	}else if(da.equals("1122")){
    		currentEvent = "Sultan of Johor's Birthday (Regional Holiday)";
    	}else if(da.equals("1211")){
    		currentEvent = "Sultan of Selangor's Birthday (Regional Holiday)";
    	}else if(da.equals("1225")){
    		currentEvent = "Christmas (Public Holiday)";
    	}else{
    		currentEvent = " ";
    	}
		return currentEvent;
    }
    
	public String setSingapuraHoliday(String da){
    	String currentEvent = null;
    	if(da.equals("11")){
    		currentEvent = "New Years (Public Holiday)";
    	}else if(da.equals("131")){
    		currentEvent = "Chinese New years (Public Holiday)";
    	}else if(da.equals("418")){
    		currentEvent = "Good friday (Public Holiday)";
    	}else if(da.equals("51")){
    		currentEvent = "Labour Day (Public Holiday)";
    	}else if(da.equals("513")){
    		currentEvent = "Vesak (Waisak) Day (Public Holiday)";
    	}else if(da.equals("728")){
    		currentEvent = "Eid al-fitr (Public Holiday)";
    	}else if(da.equals("89")){
    		currentEvent = "Indenpendent Day of Singapore(Public Holiday)";
    	}else if(da.equals("105")){
    		currentEvent = "Eid al-adha (Public Holiday)";
    	}else if(da.equals("1023")){
    		currentEvent = "Deevavali(Public Holiday)";
    	}else if(da.equals("1225")){
    		currentEvent = "Christmas (Public Holiday)";
    	}else{
    		currentEvent = " ";
    	}
		return currentEvent;
    }
	public String settDate(int mm, int dd) {
		String month = Integer.toString(mm);
		String day = Integer.toString(dd);
		String leDate = month + day;
		return leDate;
	}
}