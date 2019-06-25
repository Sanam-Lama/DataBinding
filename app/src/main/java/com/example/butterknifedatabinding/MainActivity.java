package com.example.butterknifedatabinding;

/* The Data Binding Library is a support library that allows you to bind UI components in your layouts to
 * data sources in your app using a declarative format rather than programmatically.
 *
 * In the xml file, layout needs to be the root layout containing data variable and the textviews or
 * other tabs can be added in any other layout
 *
 * The android:text="@{viewmodel.userName}" is the text provided in layout that removes the need to call
 * any of the Java code such as findViewById()
 * */

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.butterknifedatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        Contact contact = new Contact("Sanam", "Lama Tamang");
        activityMainBinding.setContact(contact);
    }
}
