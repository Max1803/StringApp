package myapp.max.string;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class StringActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override   // Функция для отображения меню
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_string, menu);
        return true;
    }

    @Override   //Функция для обработки нажатий на каждый пунк меню
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        et1 = (EditText) findViewById(R.id.editText);
        et2 = (EditText) findViewById(R.id.editText2);
        String s1 = et1.getText().toString();
        String s2 = et2.getText().toString();
        tv = (TextView) findViewById(R.id.textView);

        //noinspection SimplifiableIfStatement

        if (id == R.id.compareTo) {

            if (s1.compareTo(s2) == 0) {
                tv.setText("Строки совпадают с учетом регистра");
            } else {
                tv.setText("Строки не совпадают с учетом регистра");
            }


        }

        if (id == R.id.compareToIgnoreCase) {

            if (s1.compareToIgnoreCase(s2) == 0) {
                tv.setText("Строки совпадают без учета регистра");
            } else {
                tv.setText("Строки не совпадают без учета регистра");
            }

        }

        if (id == R.id.contains) {

            if (s1.contains(s2)) {
                tv.setText("Входит");
            } else {
                tv.setText("Не входит");
            }
        }

        if (id == R.id.endsWith) {

            if (s1.endsWith(s2)) {
                tv.setText("Строка завершается указанным суффиксом");
            } else {
                tv.setText("Строка не завершается указанным суффиксом");
            }

        }

        if (id == R.id.startsWith) {
            if (s1.startsWith(s2)) {
                tv.setText("Строка начинается с указанного префикса");
            } else {
                tv.setText("Строка не начинается с указанного префикса");
            }
        }
        if (id == R.id.equals) {
            if (s1.equals(s2)) {
                tv.setText("Строка идентична указанному символу");
            } else {
                tv.setText("Строка не идентична указанному символу");
            }
        }
        if (id == R.id.split) {
            String strMas[];//etString = Потолок:Дверь:Окно  etString = ":"
            String res = "";
            strMas = s1.split(s2);//["ПОтолок", "Дверь"]
            for (int i = 0; i < strMas.length; i++) {
                res = res + " " + strMas[i];  //ПОтолок*Дверь*Окно
            }
            tv.setText(res);
        }
        if (id == R.id.indexOf){
            Integer n = Integer.valueOf(s2);
            if(s1.indexOf(n))

            }



        return super.onOptionsItemSelected(item);


    }


}
