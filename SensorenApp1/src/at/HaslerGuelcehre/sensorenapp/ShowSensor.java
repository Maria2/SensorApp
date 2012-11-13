package at.HaslerGuelcehre.sensorenapp;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class ShowSensor extends Activity implements SensorEventListener{
	
	StringBuilder builder= new StringBuilder();
	TextView textView;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hauptmenue);
         textView = new TextView(this);
       
         
	}
	public void getSensor()
	{
		SensorManager manager=(SensorManager) getSystemService(Context.SENSOR_SERVICE);
        Sensor acceleormeter=manager.getSensorList(Sensor.TYPE_ACCELEROMETER).get(0);
        manager.registerListener(this,  acceleormeter, SensorManager.SENSOR_DELAY_NORMAL);
		
	}
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
		builder.setLength(0);
		builder.append("x: ");
		builder.append(event.values[0]);
		builder.append("\n");//line break
		builder.append("y: ");
		builder.append(event.values[1]);
		builder.append("\n");
		builder.append("z: ");
		builder.append(event.values[2]);
		textView=(TextView)findViewById(R.id.TextView1); // sets the local var 
		// textView to the TextView I created in the laout file -> you can see both the pic and the axis
		textView.setText(builder.toString());
		
		
	}
}
