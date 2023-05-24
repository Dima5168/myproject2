package com.example.myproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {

    private String title;
    private String text;
    private String illustration1;
    private Button forward;
    private Button back;

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);


        Intent intent = new Intent(getApplicationContext(), ActivityTongueTwisterData.class);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "13";
                title = "Курица с цыплятами" ;
                text = "Куд-куда? Куд-куда?\n" +
                        "Ну-ка, ну-ка все сюда!\n" +
                        "Ну-ка к маме под крыло!\n" +
                        "Куд-куда вас понесло?";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "14";
                title = "Косарь" ;
                text = "Косарь косил, косу носил,\n" +
                        "Коси, коса, пока роса.\n" +
                        "Роса долой - косец домой.\n" +
                        "Коса косит гладко,коса любит лопатку,\n" +
                        "Лопатка песочек, косец - пирожочек.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "15";
                title = "Чёрный кот" ;
                text = "Чёрной ночью чёрный кот\n" +
                        "Прыгнул в чёрный дымоход.\n" +
                        "В дымоходе чернота.\n" +
                        "Отыщи-ка там кота.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "16";
                title = "Волчата" ;
                text = "Были галчата в гостях у волчат,\n" +
                        "Были волчата в гостях в галчат,\n" +
                        "Нынче волчата галдят, как галчата,\n" +
                        "И, как волчата, галчата молчат.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "17";
                title = "Два дровосека" ;
                text = "Два дровосека, два дроворуба,\n" +
                        "Два дровокола отточили топоры,\n" +
                        "Топоры остры-то до поры,\n" +
                        "До поры остры топоры, до времени.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "18";
                title = "Бык" ;
                text = "Бык бодается с быком.\n" +
                        "Убегают все кругом.\n" +
                        "Береги, бегун, бока\n" +
                        "От бодливого быка.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "19";
                title = "Вертолет" ;
                text = "Воробья врачи спасли,\n" +
                        "В вертолет его внесли.\n" +
                        "Вертолет вертел винтами,\n" +
                        "Волновал траву с цветами.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "20";
                title = "Дуб" ;
                text = "Бык буянил перед дубом,\n" +
                        "Тряс под дубом бурым чубом.\n" +
                        "Дуб схватил его за чуб.\n" +
                        "-Не буянь! – воскликнул дуб.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "21";
                title = "Пекарь " ;
                text = "Бублик, баранку, батон и буханку\n" +
                        "Пекарь из теста испек спозаранку.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "22";
                title = "Обезьяне" ;
                text = "Забавной обезьяне бросили бананы,\n" +
                        "Бросили бананы забавной обезьяне.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "23";
                title = "Валя" ;
                text = "Валя на проталинке промочила валенки. \n" +
                        "Валенки у Валеньки сохнут на завалинке.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "24";
                title = "Дед Додон" ;
                text = "Дед Додон в дуду дудел,\n" +
                        "Димку дед дудой задел.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        Intent intent1 = new Intent(getApplicationContext(), Page1.class);
        //Кнопочки
        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
        forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent1);
            }
        });
    }
}