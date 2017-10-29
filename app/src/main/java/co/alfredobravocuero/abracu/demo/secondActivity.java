package co.alfredobravocuero.abracu.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity implements View.OnClickListener {

    Button button5, button6;
    EditText edit_text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Casting para acceder a un Textview
        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        edit_text2 = (EditText) findViewById(R.id.edit_text2);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button5:
                Intent intent = new Intent(secondActivity.this, MainActivity.class);
                startActivity(intent);

                break;

            case R.id.button6:
                String dato = edit_text2.getText().toString();
                Intent intent2 = new Intent(secondActivity.this, ThirdActivity.class);
                intent2.putExtra("DATO",dato);

                startActivity(intent2);
                break;
        }

    }
}
