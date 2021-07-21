package sg.edu.rp.c346.id20029443.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView LV;
    ArrayList<AndroidVersion> alVersion;
    //ArrayAdapter<AndroidVersion> aaVersion;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LV = findViewById(R.id.LV);

        alVersion = new ArrayList<>();

        AndroidVersion item1 = new AndroidVersion("Pie", "9.0");
        AndroidVersion item2 = new AndroidVersion("Oreo", "8.0 - 8.1");
        AndroidVersion item3 = new AndroidVersion("Nougat", "7.0 - 7.1.2");

        alVersion.add(item1);
        alVersion.add(item2);
        alVersion.add(item3);


        //aaVersion = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, alVersion);
        adapter = new CustomAdapter(this, R.layout.row, alVersion);
        //LV.setAdapter(aaVersion);
        LV.setAdapter(adapter);






    }
}