package com.jspider.intentprogram;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
Button ok;
EditText sendtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ok=(Button) findViewById(R.id.okbutton);
        sendtext=(EditText) findViewById(R.id.sendtext);
        ok.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				String i=sendtext.getText().toString();
				Intent intent = new Intent(MainActivity.this,SecondActivity.class);
				intent.putExtra("key1",i);
				startActivity(intent);
							
			}
		});
    }


 
    
}
