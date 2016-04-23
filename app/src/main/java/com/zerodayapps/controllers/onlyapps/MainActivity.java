package com.zerodayapps.controllers.onlyapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://category/APPLICATION"));
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/category/APPLICATION")));
        finish();
    }
}
