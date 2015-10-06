package com.jspider.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
Button add,sub,mul,div;
EditText firsttxt,secondtxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  add=(Button) findViewById(R.id.addbutton);
  sub=(Button) findViewById(R.id.subtractbutton);
  mul=(Button) findViewById(R.id.multiplybutton);
  div=(Button) findViewById(R.id.dividebutton);
  firsttxt=(EditText) findViewById(R.id.firsttext);
  secondtxt=(EditText) findViewById(R.id.secondtext);
    
    add.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			
		int i=Integer.parseInt(firsttxt.getText().toString());
		int j=Integer.parseInt(secondtxt.getText().toString());
		int k=i+j;	
		Intent intent=new Intent(MainActivity.this, SecondActivity.class);
			intent.putExtra("key1",k);
			startActivity(intent);
	
		}
	});
    
    sub.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			int i=Integer.parseInt(firsttxt.getText().toString());
			int j=Integer.parseInt(secondtxt.getText().toString());
			int k=i-j;	
			Intent intent=new Intent(MainActivity.this, SecondActivity.class);
				intent.putExtra("key1",k);
				startActivity(intent);
		
			
		}
	});
    
    mul.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			int i=Integer.parseInt(firsttxt.getText().toString());
			int j=Integer.parseInt(secondtxt.getText().toString());
			int k=i*j;	
			Intent intent=new Intent(MainActivity.this, SecondActivity.class);
				intent.putExtra("key1",k);
				startActivity(intent);
		
			
		}
	});

    div.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			int i=Integer.parseInt(firsttxt.getText().toString());
			int j=Integer.parseInt(secondtxt.getText().toString());
			int k=i/j;	
			Intent intent=new Intent(MainActivity.this, SecondActivity.class);
				intent.putExtra("key1",k);
				startActivity(intent);
			
		}
	});
    
    }


 
    
}
