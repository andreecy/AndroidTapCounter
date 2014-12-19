package chiplabs.tapcounter;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

	private int count = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final Button btnCount = (Button)findViewById(R.id.btnCount);
		final Button btnReset = (Button)findViewById(R.id.btnReset);
		final TextView textCount = (TextView)findViewById(R.id.textCount);
		final MediaPlayer soundclick = MediaPlayer.create(this, R.raw.btnclick_sfx);
		
		
		//tombol hitung di klik
		btnCount.setOnClickListener(new OnClickListener() {
		 	
			@Override
			public void onClick(View v) { 
				count ++; // bertambah
				textCount.setText(""+count+""); //set text ke nilai yg bertambah itu
			    soundclick.start(); //bunyi klik
			}
		});
		
		//tombol reset di klik
		btnReset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
			count = 0; //kembalikan ke nelai 0
			textCount.setText(""+count+"");	// set text ke variable 0 lagi
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_about) {
			Intent aboutIntent = new Intent(MainActivity.this, About.class);
		//	aboutIntent.putExtra("key", "about");
			MainActivity.this.startActivity(aboutIntent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
