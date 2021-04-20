package sg.edu.rp.c346.id19023702.pslesson1c347;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import android.os.Bundle;
import android.widget.Toast;

public class SecondExtend extends AppCompatActivity {

    ListView lv;
    TextView tvSecond;
    ArrayList<Second> holiday;
    ArrayAdapter<Second> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView) this.findViewById(R.id.lvDates);
        tvSecond = (TextView) findViewById(R.id.tvSecular);

        Intent i = getIntent();
        String year = i.getStringExtra("type");
        tvSecond.setText(year);

        holiday = new ArrayList<Second>();

        if (year.equals("Secular")) {
            holiday.add(new Second("1st May 2021", R.drawable.labour_day));
            holiday.add(new Second("9th August 2021", R.drawable.national_day));
        } else if (year.equals("Ethnic and Religion")) {
            holiday.add(new Second("25th December 2021", R.drawable.christmas));
            holiday.add(new Second("12th February 2021", R.drawable.cny));
            holiday.add(new Second("4th November 2021", R.drawable.deepavali));
        }

        lv = findViewById(R.id.lvDates);

        aa = new SecondAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Second selectedHoliday = holiday.get(position);

                Toast.makeText(SecondExtend.this, selectedHoliday.getHoliday()
                                + " Star: " + selectedHoliday.getHoliday(),
                        Toast.LENGTH_LONG).show();
            }
        });


    }
}