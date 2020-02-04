package za.co.ncdscoding.scoralizer.activities.round;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.CalendarView;

import za.co.ncdscoding.scoralizer.R;
import za.co.ncdscoding.scoralizer.activities.hole.HoleActivity;

public class RoundActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_round);

        CalendarView calendarView = findViewById(R.id.calendarRoundDate);
        calendarView.setOnDateChangeListener(this);
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
        Intent intent = new Intent(this, HoleActivity.class);
        startActivity(intent);
    }
}
