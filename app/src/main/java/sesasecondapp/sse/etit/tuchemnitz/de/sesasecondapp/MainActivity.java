package sesasecondapp.sse.etit.tuchemnitz.de.sesasecondapp;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity {


    private MainFragment mainFragment;
    private DisplayMessageFragment displayMessageFragment;
    private Bundle bundle = new Bundle();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //general layout appearance (in our case a blank layout called fragment_placeholder)
        setContentView(R.layout.activity_main);

        //instantiation of fragments (the bundle )
        mainFragment = (MainFragment) Fragment.instantiate(this, MainFragment.class.getName(), null);
        displayMessageFragment = (DisplayMessageFragment) Fragment.instantiate(this, DisplayMessageFragment.class.getName(), bundle);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment_placeholder, mainFragment);
        fragmentTransaction.commit();
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
