package com.example.acts;

import com.example.screenlocker.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

public class Main extends ActionBarActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		startService(new Intent(Main.this, myService.class));
		
		Log.e("", "hello");
	}
	
}
