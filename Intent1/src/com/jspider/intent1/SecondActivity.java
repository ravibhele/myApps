package com.jspider.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends Activity {
Button secondbutton;
EditText secondtext;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
secondbutton=(Button) findViewById(R.id.secondbutton);
secondtext=(EditText) findViewById(R.id.secondtext);

secondbutton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		String s=secondtext.getText().toString();
		Intent intent=new Intent();
		intent.putExtra("Key1",s);
		setResult(RESULT_CANCELED,intent);
		finish();
		
		
	}
});
	
	}


}
