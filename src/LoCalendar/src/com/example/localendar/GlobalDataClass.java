package com.example.localendar;

import java.util.HashMap;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class GlobalDataClass {

	// Shared Preferences
	SharedPreferences pref;

	// Editor for Shared preferences
	Editor editor;

	// Context
	Context _context;

	// Shared pref mode
	int PRIVATE_MODE = 0;

	// Sharedpref file name
	private static final String PREF_NAME = "GlobalDataPref";

	// id (make variable public to access from outside)
	public static final String KEY_ID = "id";

	// Constructor
	public GlobalDataClass(Context context) {
		this._context = context;
		pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
		editor = pref.edit();
	}

	public void createIDSession(String id) {
		// Storing country name in pref
		editor.putString(KEY_ID, id);

		// commit changes
		editor.commit();
	}

	// this function use to get the country name of user
	public String getSessionID() {
		String sessionID = pref.getString(KEY_ID, null);
		return sessionID;
	}

	// this function to save the session id of user
	public HashMap<String, String> getUserDetails() {
		HashMap<String, String> user = new HashMap<String, String>();
		// user id
		user.put(KEY_ID, pref.getString(KEY_ID, null));

		// return user
		return user;
	}
}
