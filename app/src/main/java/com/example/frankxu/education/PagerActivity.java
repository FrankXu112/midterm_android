package com.example.frankxu.education;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by frankxu on 2018-02-19.
 */

public class PagerActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private List<Major> mMajors;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mViewPager = (ViewPager) findViewById(R.id.activity_result);

        mMajors = MajorLab.get(this).getMajors();
    }
}
