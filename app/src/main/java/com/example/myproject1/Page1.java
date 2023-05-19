package com.example.myproject1;
//Это страница 1 (ГОТОВО)
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page1 extends AppCompatActivity {
    private String title;
    private String text;
    private String illustration1;
    private Button back;
    private Button forward;
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
        setContentView(R.layout.activity_page1);

        Intent intent = new Intent(getApplicationContext(), ActivityTongueTwisterData.class);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    illustration1 = "1";
                    title = "Ехал грека через реку";
                    text = "Ехал Грека через реку,\n" +
                            "Видит Грека – в реке рак.\n" +
                            "Сунул Грека руку в реку, -\n" +
                            "Рак за руку Греку ЦАП !\n" +
                            "Раки сразу лезут в драки,\n" +
                            "Грустно в реках жить без драк.\n" +
                            "Раки злые, как собаки, -\n" +
                            "Рад при виде Греки рак.\n" +
                            "Раки в реках мрут от скуки,\n" +
                            "Грека, рак ведь не дурак.\n" +
                            "Суй пореже в реку руки, -\n" +
                            "Враз прокусит руку рак!";

                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);

            }
        });
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "2";
                title = "Пир у Киры и Фиры";
                text = "У Киры и Фиры\n" +
                        "В квартире был пир:\n" +
                        "Факир ел зефир и\n" +
                        "Кефир пил Факир.\n" +
                        "А Фира и Кира\n" +
                        "Не пили кефира,\n" +
                        "Не ели зефира –\n" +
                        "Кормили факира.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "3";
                title = "Мыла Мила";
                text = "Мыла Мила мишку мылом,\n" +
                        "Мила мыло уронила.\n" +
                        "Уронила Мила мыло,\n" +
                        "Мишку мылом не домыла.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "4";
                title = "Белка";
                text = "Белый снег. Белый мел.\n" +
                        "Белый сахар тоже бел.\n" +
                        "А вот белка не бела.\n" +
                        "Белой даже не была.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "5";
                title = "Поп и попугай";
                text = "Однажды галок поп пугая,\n" +
                        "в кустах увидел попугая.\n" +
                        "И говорит тот попугай:\n" +
                        "«Пугать ты галок, поп, пугай,\n" +
                        "но галок поп в кустах пугая,\n" +
                        "пугать не смей ты попугая».";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "6";
                title = "Лото";
                text = "Граф Тото играет в лото,\n" +
                        "а графиня Тото знает про то,\n" +
                        "что Граф Тото играет в лото,\n" +
                        "если бы граф Тото знал про то,\n" +
                        "что графиня Тото знает про то,\n" +
                        "что граф Тото играет в лото,\n" +
                        "то б граф Тото никогда бы в жизни\n" +
                        "не играл бы в лото.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "7";
                title = "Кто хочет разговаривать";
                text = "Кто хочет разговаривать,\n" +
                        "Тот должен выговаривать\n" +
                        "Все правильно и внятно,\n" +
                        "Чтоб было всем понятно.\n" +
                        "Мы будем разговаривать\n" +
                        "И будем выговаривать\n" +
                        "Так правильно и внятно,\n" +
                        "Чтоб было всем понятно.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "8";
                title = "Ежевика и земляника";
                text = "Ежели вы не жили возле ежевичника,\n" +
                        "но ежели вы жили возле земляничника,\n" +
                        "то значит земляничное варенье вам привычное\n" +
                        "и вовсе не привычное варенье ежевичное.\n" +
                        "Ежели вы жили возле ежевичника,\n" +
                        "то значит, ежевичное варенье вам привычное,\n" +
                        "и вовсе не привычное варенье земляничное.\n" +
                        "Но ежели вы жили возле ежевичника,\n" +
                        "и ежели вы жили возле земляничника\n" +
                        "и ежели вы времени на лес не пожалели,\n" +
                        "то значит, преотличное варенье ежевичное,\n" +
                        "варенье земляничное вы ежедневно ели.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "9";
                title = "Сшит колпак";
                text = "Сшит колпак, да не по-колпаковски, \n" +
                        "Вылит колокол, да не по-колоколовски. \n" +
                        "Надо колпак переколпаковать, перевыколпаковать. \n" +
                        "Надо колокол переколоколовать, перевыколоколовать ";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "10";
                title = "Бобры добры";
                text = "Как известно бобры добры,\n" +
                        "Добротою бобры полны,\n" +
                        "Если хочешь себе добра,\n" +
                        "Надо просто позвать бобра. \n" +
                        "Если ты без бобра добр, \n" +
                        "Значит сам ты в душе бобр!";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "11";
                title = "Ёжик";
                text = "Лежит ежик у елки, у ежа иголки,\n" +
                        "А внизу, похожие на маленьких ежат,\n" +
                        "Шишки прошлогодние на траве лежат.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                illustration1 = "12";
                title = "Сорока";
                text = "Огорченная сорока\n" +
                        "Возвращается с урока.\n" +
                        "Весь урок болтала с сойкой,\n" +
                        "И домой вернулась с двойкой.";
                TongueTwisterData data = new TongueTwisterData(title,text, illustration1);
                intent.putExtra("data1", data);
                startActivity(intent);
            }
        });

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent2);
                }
            });
        forward = findViewById(R.id.forward);
        forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), Page2.class);
                startActivity(intent1);
            }
        });
    }
}