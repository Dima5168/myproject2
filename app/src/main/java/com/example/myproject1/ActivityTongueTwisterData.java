package com.example.myproject1;
//в эту активность будут выведены данные из TongueTwisterData
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityTongueTwisterData extends AppCompatActivity {
    private Button back;
    private TextView title;
    private TextView text;
    private ImageView illustration;
    private TongueTwisterData data;
    private int aaa;
    private String aaa1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tongue_twister_data);
        title = findViewById(R.id.title);
        text = findViewById(R.id.text);
        illustration = findViewById(R.id.illustration);

        //выгрузка данных из TongueTwisterData
        Bundle bundle = getIntent().getExtras();
            data = (TongueTwisterData) bundle.getSerializable("data1");
            title.setText(data.getTitle());
            text.setText(data.getText());
            aaa1 = data.getIllustration1();
            aaa = Integer.parseInt(aaa1.trim());

            //иллюстрации из первой страницы
        if (aaa==1){
            illustration.setImageResource(R.drawable.a1);
        }
        if (aaa==2){
            illustration.setImageResource(R.drawable.a2);
        }
        if (aaa==3){
            illustration.setImageResource(R.drawable.a3);
        }
        if (aaa==4){
            illustration.setImageResource(R.drawable.a4);
        }
        if (aaa==5){
            illustration.setImageResource(R.drawable.a5);
        }
        if (aaa==6){
            illustration.setImageResource(R.drawable.a6);
        }
        if (aaa==7){
            illustration.setImageResource(R.drawable.a7);
        }
        if (aaa==8){
            illustration.setImageResource(R.drawable.a8);
        }
        if (aaa==9){
            illustration.setImageResource(R.drawable.a9);
        }
        if (aaa==10){
            illustration.setImageResource(R.drawable.a10);
        }
        if (aaa==11){
            illustration.setImageResource(R.drawable.a11);
        }
        if (aaa==12){
            illustration.setImageResource(R.drawable.a12);
        }




        if (aaa==13){
            illustration.setImageResource(R.drawable.b1);
        }
        if (aaa==14) {
            illustration.setImageResource(R.drawable.b2);
        }
        if (aaa==15) {
            illustration.setImageResource(R.drawable.b3);
        }
        if (aaa==16) {
            illustration.setImageResource(R.drawable.b4);
        }
        if (aaa==17){
            illustration.setImageResource(R.drawable.b5);
        }
        if (aaa==18){
            illustration.setImageResource(R.drawable.b6);
        }
        if (aaa==19){
            illustration.setImageResource(R.drawable.b7);
        }

        //кнопочка назад (ГОТОВО)
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (aaa<13) {
                    Intent intent = new Intent(getApplicationContext(), Page1.class);
                    startActivity(intent);
                }
                if (aaa>12 & aaa<25){
                    Intent intent = new Intent(getApplicationContext(), Page2.class);
                    startActivity(intent);
                }
            }
        });
    }
}