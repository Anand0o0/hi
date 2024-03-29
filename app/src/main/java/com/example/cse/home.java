package com.example.cse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class home extends AppCompatActivity {

    ImageView spe,up,ty,no,abs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        spe=findViewById(R.id.special);
        up=findViewById(R.id.upgradess);
        ty=findViewById(R.id.trth);

        no=findViewById(R.id.notification);
        abs=findViewById(R.id.about);

        spe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,specializations.class);
                startActivity(intent);
            }
        });

        up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,upgradeyou.class);
                startActivity(intent);
            }
        });

        ty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,trythis.class);
                startActivity(intent);
            }
        });



        abs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this,abotus.class);
                startActivity(intent);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(home.this, notifications.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Close the app when the back button is pressed in this activity
        super.onBackPressed();
        finishAffinity();
    }
}