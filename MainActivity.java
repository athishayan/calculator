package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et1,et2;
    Button add,sub,mul,div;
    TextView tv,tv2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        tv=(TextView) findViewById(R.id.tv);
        tv2=(TextView)findViewById(R.id.tv2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                tv2.setText("+");
                a=f+s;
                tv.setText(String.format("%d", a));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                tv2.setText("-");
                a=f-s;
                tv.setText(String.format("%d", a));
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f,s,a;
                f=Integer.parseInt(et1.getText().toString());
                s=Integer.parseInt(et2.getText().toString());
                tv2.setText("*");
                a=f*s;
                tv.setText(String.format("%d", a));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int f, s, a;
                f = Integer.parseInt(et1.getText().toString());
                s = Integer.parseInt(et2.getText().toString());
                tv2.setText("/");
                if (s == 0) {
                    tv.setText("not possible!!!");
                } else {
                    a = f / s;
                    tv.setText(String.format("%d", a));
                }
            }
        });
    }
}