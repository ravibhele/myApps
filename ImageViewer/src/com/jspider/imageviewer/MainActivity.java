package com.jspider.imageviewer;

import android.os.Bundle;
import android.provider.MediaStore;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
Button camerabutton;
ImageView cameraimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        camerabutton =(Button) findViewById(R.id.camerabutton);
        cameraimage= (ImageView) findViewById(R.id.cameraview);
        
        camerabutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(intent, 1);
			}
		});
    
    }
@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
if(requestCode==1)
{
	if(resultCode==RESULT_OK)
	{
		Bitmap bm=(Bitmap) data.getExtras().get("data");
		cameraimage.setImageBitmap(bm);
			}
	else if(resultCode==RESULT_CANCELED)
	{
		Toast.makeText(MainActivity.this, "error",Toast.LENGTH_SHORT).show();
	}
}

}

  }
