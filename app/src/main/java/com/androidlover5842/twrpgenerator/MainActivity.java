package com.androidlover5842.twrpgenerator;

import android.os.Bundle;

import com.androidlover5842.twrpgenerator.Activity.InitActivity;
import com.androidlover5842.twrpgenerator.R;

import androidx.annotation.Nullable;

public class MainActivity extends InitActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
