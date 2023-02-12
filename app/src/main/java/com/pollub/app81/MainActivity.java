package com.pollub.app81;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ActorAdapter cAdapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.actor_list);
        ArrayList<Actor> actorList = new ArrayList<Actor>();
        actorList.add(new Actor(R.drawable.norris, "chuckie@gmail.com","1122334455","Chuck Norris"));
        actorList.add(new Actor(R.drawable.chan, " jackie@gmail.com","4455667788","Jackie Chan"));
        actorList.add(new Actor(R.drawable.seagal, " stevsg@gmail.com","556677889","Steven Seagal"));
        cAdapter = new ActorAdapter(this, actorList);
        listView.setAdapter(cAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view,
                                            int position, long id) {
                        if (position == 0) {

                            Context context = getApplicationContext();
                            CharSequence text = "Your choise is norris";
                            int duration = Toast.LENGTH_SHORT;
                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();

                        } else if (position == 1) {
                            Context context = getApplicationContext();
                            CharSequence text = "Your choise is chan";
                            int duration = Toast.LENGTH_SHORT;

                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                        } else {
                            Context context = getApplicationContext();
                            CharSequence text = "Your choise is seagal";
                            int duration = Toast.LENGTH_SHORT;

                            Toast toast = Toast.makeText(context, text, duration);
                            toast.show();
                        }
                    }
                });

    }
}