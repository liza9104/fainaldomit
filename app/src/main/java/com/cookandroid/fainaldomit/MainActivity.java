package com.cookandroid.fainaldomit;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    ImageButton mainIcon ;
    Button myPage_btn, bulletin_btn, rr_btn, reserve ;
    TextView notice_cont, todayMenu_cont ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("메인화면");

        mainIcon = (ImageButton) findViewById(R.id.mainIcon);
        myPage_btn = (Button) findViewById(R.id.myPage_btn);
        bulletin_btn = (Button) findViewById(R.id.bulletin_btn);
        rr_btn = (Button) findViewById(R.id.rr_btn);
        notice_cont = (TextView) findViewById(R.id.notice_cont);
        todayMenu_cont = (TextView) findViewById(R.id.todayMenu_cont);
        reserve= (Button) findViewById(R.id.reserve);


        myPage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),mypageActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bulletin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),boardActivity.class);
                startActivity(intent);
                finish();
            }
        });
        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getApplicationContext(),reserve.class);
                startActivity(intent);
                finish();
            }
        });


    }
    public void Clickhome(View view) {
        Toast.makeText(getApplicationContext(),"홈으로 이동",Toast.LENGTH_LONG).show();
    }
    public void ClickButton1(View view) {
        Toast.makeText(getApplicationContext(),"마이페이지 이동",Toast.LENGTH_LONG).show();
    }
    public void ClickButton2(View view) {
        Toast.makeText(getApplicationContext(),"마이페이지 이동",Toast.LENGTH_LONG).show();
    }


    public void ClickButton(View view) {
        Toast.makeText(getApplicationContext(),"예약이 완료되었습니다.",Toast.LENGTH_SHORT).show();
    }
    }








