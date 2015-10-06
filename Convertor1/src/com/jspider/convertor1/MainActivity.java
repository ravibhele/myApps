package com.jspider.convertor1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {
	Spinner spin;
	Button button;
	EditText text1,text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        String p[]={"Length","Temperature","Currency"};
        spin=(Spinner) findViewById(R.id.spinner1);
        button=(Button) findViewById(R.id.button1);
        text1=(EditText) findViewById(R.id.editText1);
        text2=(EditText) findViewById(R.id.editText2);
        ArrayAdapter<String>adapter=new ArrayAdapter<String>

    (MainActivity.this, android.R.layout.simple_dropdown_item_1line,p);
        spin.setAdapter(adapter);
        
        spin.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int pos, long arg3) {
				// TODO Auto-generated method stub
				switch (pos) {
				case 0:
					text1.setHint("Meter");
					text2.setHint("Kilometer");
					button.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							if(text1.length()==0&&text2.length()==0)
							{
								
	Toast.makeText(MainActivity.this,"please enter value",Toast.LENGTH_SHORT).show();
							}
							else if(text1.length()!=0)
							{	
						
							int i=Integer.parseInt(text1.getText().toString());
							
							
					text2.setText(Integer.toString(i/1000));
							}
							else
							{
								
	int i=Integer.parseInt(text2.getText().toString());
								
								
	text1.setText(Integer.toString(i*1000));
							}
							
							
						
							
						}
					});
					
					break;
				case 1:
					text1.setText("");
					text2.setText("");
					text1.setHint("Celsius");
					text2.setHint("Frenhiet");
					button.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {

if(text1.length()==0&&text2.length()==0)
							
{
							
	Toast.makeText(MainActivity.this,"please enter value",Toast.LENGTH_SHORT).show();
							
}
							
else if(text1.length()!=0)
							
{
					float celsius=Float.parseFloat(text1.getText().toString());
					float t=celsius*(9/5)+32;
							
text2.setText(Float.toString(t));
							
}
							
else
							
{
							
	float ferenhiet=Float.parseFloat(text2.getText().toString());
							
	float t=(ferenhiet - 32) * 5/9;
							
			text1.setText(Float.toString(t));
							
}
						
							
						}
					});
					break;
				case 2:
					text1.setText("");
					text2.setText("");
					text1.setHint("Dollar");
					text2.setHint("Rupee");
					
					button.setOnClickListener(new OnClickListener() {
						
						@Override
						public void onClick(View arg0) {
							if(text1.length()==0&&text2.length()==0)
								
							{
														
								Toast.makeText(MainActivity.this,"please enter value",Toast.LENGTH_SHORT).show();
														
							}
														
							else if(text1.length()!=0){
														
							float doll=Float.parseFloat(text1.getText().toString());
														
							float o=doll*66.16f;
														
														
							text2.setText(Float.toString(o));
														
							}
														
							else
														
							{
														
								float rup=Float.parseFloat(text2.getText().toString());
														
								float o=rup/66.16f;
														
								text1.setText(Float.toString(o));
							}
							
						}
					});
					break;
				default:
					break;
				}
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
        	
		});
        
    
    }


    
    
}
