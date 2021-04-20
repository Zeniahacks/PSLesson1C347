package sg.edu.rp.c346.id19023702.pslesson1c347;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FirstExtend extends AppCompatActivity {

    ListView lv;
    ArrayList<First> al;
    ArrayAdapter<First> aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvDays);

        al = new ArrayList<First>();
        al.add(new First("Secular"));
        al.add(new First("Ethnic and Religion"));

        aa = new FirstAdapter(this, R.layout.types, al);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(FirstExtend.this, SecondExtend.class);
                intent.putExtra("type", al.get(i).getType());
                startActivity(intent);
            }
        });




    }
}
