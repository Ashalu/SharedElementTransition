package loadingdata.ashish.sharedelemnttransition.Fragment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import loadingdata.ashish.sharedelemnttransition.R;

/**
 * Main activity that holds our fragments
 *
 * @author bherbst
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new GridFragment())
                    .commit();
        }
    }
}
