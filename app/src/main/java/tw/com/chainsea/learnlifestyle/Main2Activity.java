package tw.com.chainsea.learnlifestyle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "onCreate: 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: 2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: 2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: 2");
    }
}
