package co.alfredobravocuero.abracu.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity implements View.OnClickListener{
    TextView texto;
    Button button7;
    ListView listView;

    String[] valores = new String[] {"Colombia", "Mexico", "España", "Brazil", "Costa Rica", "Nicaragua", "Peru", "Estados Udidos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        texto = (TextView) findViewById(R.id.text);

        listView = (ListView) findViewById(R.id.lista);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);


        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        if(extras != null){
            String dato = extras.getString("DATO");
            texto.setText(dato);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, valores);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"Posicion" + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button7:
                Intent intent = new Intent(ThirdActivity.this, secondActivity.class);

                startActivity(intent);

                break;
        }

    }
}
