package com.test.basicimgslider;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;

public class BasicimgsliderActivity extends Activity implements OnTouchListener {
	ImageView img;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        img = (ImageView) findViewById(R.id.picture1);
        img.setOnTouchListener(this);
    }

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		 switch (event.getAction())
	        {
	            case MotionEvent.ACTION_DOWN:
	            {       
	                  // Here u can write code which is executed after the user touch on the screen 
	                     break; 
	            }
	            case MotionEvent.ACTION_UP:
	            {             
	            	Context context = getApplicationContext();
	            	CharSequence text = "Hello toast!";
	            	int duration = Toast.LENGTH_SHORT;

	            	Toast toast = Toast.makeText(context, text, duration);
	            	toast.show();  
	                 break;
	            }
	            case MotionEvent.ACTION_MOVE:
	            {  
	               // Here u can write code which is executed when user move the finger on the screen   
	                break;
	            }
	        }
	        return true;
	}
}