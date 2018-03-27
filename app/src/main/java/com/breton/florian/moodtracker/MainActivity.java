package com.breton.florian.moodtracker;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mImageHumour1;
    private ImageView mImageHumour2;
    private ImageView mImageHumour3;
    private ImageView mImageHumour4;
    private ImageView mImageHumour5;
    private ImageView mHistoric1;
    private ImageView mHistoric2;
    private ImageView mHistoric3;
    private ImageView mHistoric4;
    private ImageView mHistoric5;
    private ImageView mMessage1;
    private ImageView mMessage2;
    private ImageView mMessage3;
    private ImageView mMessage4;
    private ImageView mMessage5;

    protected EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageHumour1 = (ImageView) findViewById(R.id.image_humour_1);
        mImageHumour2 = (ImageView) findViewById(R.id.image_humour_2);
        mImageHumour3 = (ImageView) findViewById(R.id.image_humour_3);
        mImageHumour4 = (ImageView) findViewById(R.id.image_humour_4);
        mImageHumour5 = (ImageView) findViewById(R.id.image_humour_5);

        mMessage1 = (ImageView) findViewById(R.id.image_message_1);
        mMessage2 = (ImageView) findViewById(R.id.image_message_2);
        mMessage3 = (ImageView) findViewById(R.id.image_message_3);
        mMessage4 = (ImageView) findViewById(R.id.image_message_4);
        mMessage5 = (ImageView) findViewById(R.id.image_message_5);

        mImageHumour1.setTag(0);
        mImageHumour2.setTag(1);
        mImageHumour3.setTag(2);
        mImageHumour4.setTag(3);
        mImageHumour5.setTag(4);

    }

    private void commentaire() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Commentaire");
        builder.setMessage("Commentaire");

        input = new EditText(this);
        builder.setView(input);

        builder.setPositiveButton("VALIDER", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String txt=input.getText().toString();
                Toast.makeText(MainActivity.this,txt , Toast.LENGTH_SHORT).show();
            }
        });

        builder.setNegativeButton("ANNULER", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        final AlertDialog ad=builder.create();

        //BUTTON
        mMessage1 = (ImageView) findViewById(R.id.image_message_1);
        mMessage2 = (ImageView) findViewById(R.id.image_message_2);
        mMessage3 = (ImageView) findViewById(R.id.image_message_3);
        mMessage4 = (ImageView) findViewById(R.id.image_message_4);
        mMessage5 = (ImageView) findViewById(R.id.image_message_5);

        mMessage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.show();
            }
        });
    }

}
