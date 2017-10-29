package co.alfredobravocuero.abracu.demo;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SensorEventListener {
    //Declarando Atributos varios
    TextView texto;
    ImageView imagen;
    EditText edit_text, edit_text_activity;
    Button button1, button2, button3, button4, button8, button9, button10;

    //Atributos sensor
    LinearLayout ln;
    SensorManager sm;
    Sensor sensor;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Casting para acceder a un Textview
        texto = (TextView) findViewById(R.id.texto);

        //Casting varios
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);

        edit_text = (EditText) findViewById(R.id.edit_text);

        imagen = (ImageView) findViewById(R.id.imagen);

        //Usar Sensor
        ln = (LinearLayout) findViewById(R.id.linear);
        tv = (TextView) findViewById(R.id.text);
        sm = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sm.getDefaultSensor(sensor.TYPE_PROXIMITY);
        sm.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        //setOnClickListener para Botones
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                String dato = edit_text.getText().toString();
                texto.setText(dato);
                break;

            case R.id.button2:
                texto.setText("Fixed text");
                break;

            case R.id.button3:
                Toast.makeText(getApplicationContext(), "This is a message", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button4:
                Intent intent = new Intent(MainActivity.this, secondActivity.class);

                startActivity(intent);
                break;

            case R.id.button8:
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);

                startActivity(intent2);
                break;

            case R.id.button9:
                Intent intent3 = new Intent(MainActivity.this, FourthActivity.class);

                startActivity(intent3);
                break;

            case R.id.button10:
                Intent intent4 = new Intent(MainActivity.this, FifthActivity.class);

                startActivity(intent4);
                break;
        }

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        String text = String.valueOf(event.values[0]);
        //tv.setText(text);

        //Poniendo color deacuerdo al sensor
        float valor = Float.parseFloat(text);

        if(valor == 0){
            ln.setBackgroundColor(Color.GRAY);
            texto.setTextColor(Color.WHITE);
        }else{
            ln.setBackgroundColor(Color.WHITE);
            texto.setTextColor(Color.GRAY);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
