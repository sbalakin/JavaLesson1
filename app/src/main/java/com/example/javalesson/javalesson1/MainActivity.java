package com.example.javalesson.javalesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button; //Говорим, что у нас есть такая переменная "Кнопка" (объявляем переменную). Эта переменная пока пустая
    TextView textView; //Говорим, что у нас есть такая переменная "Text" (объявляем переменную). Эта переменная пока пустая

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//Подключаем файл с интерфейсом (лейоут)
        button = findViewById(R.id.button); //Находим там кнопку
        textView = findViewById(R.id.textView); //Находим текст

        button.setOnClickListener(new View.OnClickListener() {//говорим, что произойдет если нажать на кнопку
            @Override
            public void onClick(View view) {
                myAmazingMethod();//при нажатии на кнопку вызовется вот этот код (метод)
            }
        });
    }

    void myAmazingMethod(){//это наш изумительный метод
        String result = "Что-то новенькое"; //создаем текстовую строчку и присваиваем ей значение "Что-то новенькое"


        textView.setText(result);//Отображаем на нашей TextView текстовую строчку result
    }

}
