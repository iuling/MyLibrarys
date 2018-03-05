package com.iuling.mylibrarys;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.iuling.nicespinner.NiceSpinner;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private NiceSpinner spinner;

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        //tv.setText(stringFromJNI());
        spinner = findViewById(R.id.spinner);
        List<String> dataset = new LinkedList<>(Arrays.asList(getResources().getStringArray(R.array.spinnerItem)));
        spinner.attachDataSource(dataset);
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}
