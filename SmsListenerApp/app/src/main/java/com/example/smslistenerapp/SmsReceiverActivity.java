package com.example.smslistenerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SmsReceiverActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView tvSmsFrom;
    private TextView tvSmsMassage;
    private Button btnClose;
    public static final String EXTRA_SMS_NO = "extra_sms_no";
    public static final String EXTRA_SMS_MASSAGE = "extra_sms_massage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms_receiver);
        tvSmsFrom = (TextView)findViewById(R.id.tv_no);
        tvSmsMassage = (TextView)findViewById(R.id.tv_massage);
        btnClose = (Button)findViewById(R.id.btn_close);
        btnClose.setOnClickListener(this);
        String senderNo = getIntent().getStringExtra(EXTRA_SMS_NO);
        String senderMessage = getIntent().getStringExtra(EXTRA_SMS_MASSAGE);
        tvSmsFrom.setText("from : "+senderNo);
        tvSmsMassage.setText(senderMessage);
    }
    @Override
    public void onClick(View v){
        if (v.getId() == R.id.btn_close){
            finish();
        }
    }
}