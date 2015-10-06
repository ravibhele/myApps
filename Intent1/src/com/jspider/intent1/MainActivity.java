package com.jspider.intent1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
Button firstbutton;
EditText firsttext;
TextView firstview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
firstbutton=(Button) findViewById(R.id.firstbutton);
firsttext=(EditText) findViewById(R.id.firsttext);
firstview=(TextView) findViewById(R.id.firstView);
firstbutton.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		
	Intent intent = new Intent(MainActivity.this,SecondActivity.class);
	startActivityForResult(intent, 0);
	}
});
    }
    @Override
    	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
    		// TODO Auto-generated method stub
    		super.onActivityResult(requestCode, resultCode, data);
    	    	
    			Bundle b1=data.getExtras();
    			String s1=b1.getString("Key1");
    			firstview.setText(s1);
    		
    		/*else if(resultCode==RESULT_CANCELED)
    		{
    			firsttext.setText("none");
    		}*/
    	}
}