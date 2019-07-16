package com.example.apple.alc4phase1;

import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ActivityC extends AppCompatActivity {
    TextView tvTitle, tvTrack, tvTrackValue, tvCountry, tvCountryValue, tvEmail, tvEmlValue, tvPhone,tvPhoneValue,tvStackName,tvStackNameValue ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Drawable upArrow = getResources().getDrawable(R.drawable.back_arrow);
        upArrow.setColorFilter(getResources().getColor(R.color.color_white), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(upArrow);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.ttf");
        //
        tvTitle = (TextView) findViewById(R.id.fullName);
        tvTrack = (TextView) findViewById(R.id.track);
        tvTrackValue = (TextView) findViewById(R.id.trackValue);
        tvCountry = (TextView) findViewById(R.id.country);
        tvCountryValue = (TextView) findViewById(R.id.countryValue);
        tvEmail = (TextView) findViewById(R.id.email);
        tvEmlValue = (TextView) findViewById(R.id.emailValue);
        tvPhone = (TextView) findViewById(R.id.phoneNumber);
        tvPhoneValue = (TextView) findViewById(R.id.phoneNumberValue);
        tvStackName = (TextView) findViewById(R.id.stackName);
        tvStackNameValue = (TextView) findViewById(R.id.stackNameValue);
        //
        tvTitle.setTypeface(tf);
        tvTrack.setTypeface(tf2);
        tvTrackValue.setTypeface(tf2);
        tvCountry.setTypeface(tf2);
        tvCountryValue.setTypeface(tf2);
        tvEmail.setTypeface(tf2);
        tvEmlValue.setTypeface(tf2);
        tvPhone.setTypeface(tf2);
        tvPhoneValue.setTypeface(tf2);
        tvStackName.setTypeface(tf2);
        tvStackNameValue.setTypeface(tf2);
    }
}
