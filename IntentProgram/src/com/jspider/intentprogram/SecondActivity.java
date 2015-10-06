package com.jspider.intentprogram;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
TextView second;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
second=(TextView) findViewById(R.id.secondtext);
	Intent intent=getIntent();
	Bundle b1=intent.getExtras();
	String p1=b1.getString("key1");
	second.setText(p1);
	}

}
