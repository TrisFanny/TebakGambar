package com.fanny.tugastebakgambar;

import com.fanny.tugastebakgambar.KeringatActivity;
import com.fanny.tugastebakgambar.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class KeringatActivity extends Activity {

	EditText JawabanTxt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_keringat);
		
		JawabanTxt = (EditText)findViewById(R.id.editText1);
		JawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}
	
	public void cekjawaban(View y){
    	String jawabanBenar = "BIANG KERINGAT";
    	String jawabanUser = JawabanTxt.getText().toString();
    	if(jawabanUser.equals(jawabanBenar)){
    		
    		Toast.makeText(getApplicationContext(), "JAWABAN TEPAT", Toast.LENGTH_LONG).show();
    		Intent i = new Intent(getApplicationContext(),KrisisActivity.class);
    		startActivity(i);
    	}
    	else{
    		
    		Toast.makeText(getApplicationContext(),"JAWABAN MASIH SALAH", Toast.LENGTH_LONG).show();
    	}
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.keringat, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
