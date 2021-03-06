package com.example.proyectodm.iu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.proyectodm.R;
/*
 *** Clase Help ***
 *
 * Un layout simple explicando el juego
 */
public class Help extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        ImageButton btn_backplayers = (ImageButton) findViewById(R.id.btn_backplayers);
        btn_backplayers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                v.startAnimation(AnimationUtils.loadAnimation(Help.this, R.anim.click_animation));
                Intent intent = new Intent(Help.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}