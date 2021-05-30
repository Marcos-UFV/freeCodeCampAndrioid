package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.tBtn);

        btn.setOnClickListener(onClickListener());
    }
    private View.OnClickListener onClickListener(){
        return new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                onHelloBtnClicked(v);
            }
        };
    }
    public void onHelloBtnClicked(View view){
        TextView txt = (TextView) findViewById(R.id.txtWelcome);
        txt.setText("Botão clicado");
    }
}