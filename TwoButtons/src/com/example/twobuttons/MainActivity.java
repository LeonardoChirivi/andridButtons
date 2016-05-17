package com.example.twobuttons;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputFilter.LengthFilter;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button buttonName, buttonLastName;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonName = (Button) findViewById(R.id.button1);
        buttonLastName = (Button) findViewById( R.id.button2 );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void toDo( View v ){
    	
    	if( v.equals(buttonName) )
    		v.setVisibility( v.INVISIBLE );
    	if( v.equals( buttonLastName ) )
    		Toast.makeText(getApplicationContext(), "To do to do to do", Toast.LENGTH_SHORT).show();
    	
    }
    
}
