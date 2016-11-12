package com.example.maydaybonito.easykku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {   // Main Class นี่คือคลาสหลัก

    // ประกาศตัวแปร
    // มี 3 ส่วน Access - public(ใช้ได้ทุกคลาส) private(ใช้ภายในคลาส) / Type - ประเภทตัวแปร / Name - ชื่อตัวแปร
    private Button signInButton, signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) { // Main method
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // การทำ bind widget ผูกตัวแปรเข้ากับ widget
        signInButton = (Button) findViewById(R.id.button);
        signUpButton = (Button) findViewById(R.id.button2);

        // การเขียน controller คือ เราเอานิ้วกดที่ไหน ตัวนั้นเป็น controller
        signUpButton.setOnClickListener(new View.OnClickListener() { // คลิก 1 ครั้ง
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignUpActivity.class)); // ให้ไปที่หน้า SignUp
            }
        });
    }
}
