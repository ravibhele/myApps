package com.jspider.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SecondActivity extends Activity {
TextView result;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
					result=(TextView) findViewById(R.id.resultview);
			Intent intent=getIntent();
			Bundle b1=intent.getExtras();
			int p1=b1.getInt("key1");
				
			result.setText(Integer.toString(p1));

	
	}

	

}
