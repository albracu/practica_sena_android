package co.alfredobravocuero.abracu.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class FourthActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        Bandas bandas_data[] = new Bandas[]{
                new Bandas(R.drawable.ic_launcher, "Coldplay", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Foo Figthers", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "The Killers", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Red Hot Chili", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Nirvana", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Pearl Jam", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Blink 182", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Asian Kung Fu Gen", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Foo Figthers", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "The Killers", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Red Hot Chili", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Metalica", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.ic_launcher, "Pearl Jam", "gsgagdsvvahdhdasv"),
                new Bandas(R.drawable.imagen1, "Blink 182", "gsgagdsvvahdhdasv"),
        };

    BandasAdapter adapter = new BandasAdapter(this, R.layout.listview_item_row, bandas_data);
        lv = (ListView) findViewById(R.id.lv);
        View header = (View) getLayoutInflater().inflate(R.layout.list_header_row, null);
        lv.addHeaderView(header);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                TextView v = (TextView)view.findViewById(R.id.tv);
                Toast.makeText(getApplicationContext(),v.getText(), Toast.LENGTH_SHORT).show();
            }
        });


        Log.i("Prueba", "Estamos probando");

    }
}
