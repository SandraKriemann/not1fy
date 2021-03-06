package de.beuth.not1fy.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch(item.getItemId()){
            case R.id.action_settings:
                Log.d("TAG","Button0");
                break;
            case R.id.action_cross_example:
                Log.d("TAG","Button1");
                Intent crossExampleIntent = new Intent(this, CrossExampleActivity.class);
                this.startActivity(crossExampleIntent);
                break;
            case R.id.action_frequency_domain:
                Log.d("TAG","Button2");
                Intent frequenzDomainIntent = new Intent(this, FrequenzDomainActivity.class);
                this.startActivity(frequenzDomainIntent);
                break;
            case R.id.action_hls_example:
                Log.d("TAG","Button3");
                Intent hlsExampleIntent = new Intent(this, HLSExampleActivity.class);
                this.startActivity(hlsExampleIntent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
