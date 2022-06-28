package com.example.lunara_030522;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.view.ViewTreeObserver.OnPreDrawListener;

// fazer importação do textView e Button

public class MainActivity extends AppCompatActivity {

    private Button btnMudar;
    private textView textoBase;
    private boolean texto2 = false;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btMudar = (Button) findViewById(R.id.btnMudar);
        textoBase = (TextView) findViewById(R.id.txtBase);

                btnMudar.SetOnClickListerner(new View.OnClickListener()){
            @Override
                    public void onClick (View view) {
              if(texto2){
                textoBase.setText(Alo turma);
                textobase.setRotation(39);
              }
              else {
                  textoBase.setText(turma ola);
                  textobase.setRotation(-39);
              }
              texto2 = !texto2;
            }

        }
      }
    }


}