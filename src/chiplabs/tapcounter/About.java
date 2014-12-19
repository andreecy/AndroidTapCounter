package chiplabs.tapcounter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class About extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		Intent aboutIntent = getIntent();
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		getActionBar().setTitle("Tentang");
		

}
}