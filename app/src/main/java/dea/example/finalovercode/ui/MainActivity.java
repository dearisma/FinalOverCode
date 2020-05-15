package dea.example.finalovercode.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.startapp.android.publish.adsCommon.StartAppSDK;

import dea.example.finalovercode.R;

public class MainActivity extends AppCompatActivity {
    //private InterstitialAd mInterstitialAd;
    private Button buttonLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //startapp
        StartAppSDK.init(this, "203152689", true);

        setContentView(R.layout.activity_main);


    }

    public void handleList(View view) {
        Intent intent = new Intent(MainActivity.this, DaftarActivity.class);
        startActivity(intent);
    }

}

