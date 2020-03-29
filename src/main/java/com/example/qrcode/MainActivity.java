package com.example.qrcode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.WriterException;

import androidmads.library.qrgenearator.QRGContents;
import androidmads.library.qrgenearator.QRGEncoder;

public class MainActivity extends AppCompatActivity {

    EditText qrvalue;
    Button generateBtn,scanBtn;
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // qrvalue = findViewById(R.id.qrInput);
        //generateBtn = findViewById(R.id.generateBtn);
        scanBtn = findViewById(R.id.buttonScan);
        //qrImage = findViewById(R.id.qrPlaceHolder);



        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Scanner.class));
            }
        });



    }
}
