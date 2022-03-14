package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.beans.User;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;
    EditText ord;
    TextView tv1,tv2;

    TextView tv3;

    ///////////////////////////////
    //////////////////////////////

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv=findViewById(R.id.textview);
        tv.setText(String.valueOf(sum(100)));

        et1=findViewById(R.id.etname);
        et2=findViewById(R.id.etpass);

        ord=findViewById(R.id.etname2);
        tv1=findViewById(R.id.textView3);
        tv2=findViewById(R.id.textView4);

        //实现按钮功能，保存数据到数据库
        Button bt =findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user=new User();
                user.setName(et1.getText().toString());
                user.setPwd(et2.getText().toString());
                user.save();
            }
        });

        //实现按钮功能，从数据库中取数据
        Button bt2 =findViewById(R.id.button2);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User user=User.findById(User.class,Integer.valueOf(ord.getText().toString()));
                tv1.setText(user.getName().toString());
                tv2.setText(user.getPwd().toString());

            }
        });

    }

    public int sum(int n) {
        int s = 0;
        int i = 1;
        while (i <= n) {
            s += i;
            i++;
        }
        System.out.println("1到n累加的和为：" + s);
        return  s;
    }
}