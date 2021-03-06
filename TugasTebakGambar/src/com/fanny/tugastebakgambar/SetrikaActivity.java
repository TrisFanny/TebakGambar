package com.fanny.tugastebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SetrikaActivity extends Activity {

	EditText JawabanTxt;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setrika);
		
		JawabanTxt = (EditText)findViewById(R.id.editText1);
		JawabanTxt.setFilters(new InputFilter[] {new InputFilter.AllCaps()});
	}
	
	public void cekjawaban(View y){
    	String jawabanBenar = "SETRIKA LISTRIK";
    	String jawabanUser = JawabanTxt.getText().toString();
    	if(jawabanUser.equals(jawabanBenar)){
    		//pesan toast
    		Toast.makeText(getApplicationContext(), "JAWABAN TEPAT", Toast.LENGTH_LONG).show();
    		Intent i = new Intent(getApplicationContext(),SelesaiActivity.class);
    		startActivity(i);
    	}
    	else{
    		//pesan toast
    		Toast.makeText(getApplicationContext(),"JAWABAN MASIH SALAH", Toast.LENGTH_LONG).show();
    	}
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
