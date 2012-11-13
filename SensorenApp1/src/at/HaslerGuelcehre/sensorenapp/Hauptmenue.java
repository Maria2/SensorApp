package at.HaslerGuelcehre.sensorenapp;



import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.widget.RadioButton;
import android.widget.TextView;

public class Hauptmenue extends Activity {

		RadioButton radio[];
		StringBuilder builder= new StringBuilder();
		TextView textView;
		String buttonID;
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        
	        
	        /*for(RadioButton x: radio)
	        {
	        	
	        }*/
	        textView= new TextView(this);
	        buttonID=getCheckedRadioButtonId();
		}
	    private void intializeRadio()
	    {
	    	
	    	
	    }
}
