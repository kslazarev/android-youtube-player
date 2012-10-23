package com.keyes.youtube;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sample extends Activity {

    @Override
    protected void onCreate(Bundle pSavedInstanceState) {
        super.onCreate(pSavedInstanceState);

        setContentView(R.layout.sample);

        final TextView videoIdTextView = (TextView) findViewById(R.id.youtubeIdText);
        final Button viewVideoButton = (Button) findViewById(R.id.viewVideoButton);

        viewVideoButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View pV) {

                String videoId = videoIdTextView.getText().toString();

                if (videoId == null || videoId.trim().equals("")) {
                    return;
                }

                Intent lVideoIntent = new Intent(null, Uri.parse("ytv://" + videoId), Sample.this, OpenYouTubePlayerActivity.class);
                startActivity(lVideoIntent);

            }
        });

    }


}
