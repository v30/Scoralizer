package za.co.ncdscoding.scoralizer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import za.co.ncdscoding.scoralizer.activities.hole.HoleActivity;
import za.co.ncdscoding.scoralizer.activities.round.RoundActivity;
import za.co.ncdscoding.scoralizer.activities.shot.ShotActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check if the database exists
        // If the DB does not exist we need to create the database and the tables
    }

    // If the user clicks on start a new round they are sent to the new round screen
    public void newRound(View view) {
        Intent intent = new Intent(this, RoundActivity.class);
        startActivity(intent);
    }
}
