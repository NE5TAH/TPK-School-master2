package au.com.codycodes.tpk.tamizhpallikoodam;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;

public class SocialActivity extends AppCompatActivity {

        CardView facebook;
        CardView twitter;

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_social);

            // Find the View that links to TPK's Facebook page
            facebook = (CardView) findViewById(R.id.CardView_facebook);

            // Set a click listener on that View
            facebook.setOnClickListener(new View.OnClickListener() {
                // This method calls the Facebook Link.
                @Override
                public void onClick(View view) {

                    openFacebook(view);
                }
            });

            // Find the View that links to TPK's Twitter page
            twitter = (CardView) findViewById(R.id.CardView_twitter);

            // Set a click listener on that View
            twitter.setOnClickListener(new View.OnClickListener() {
                // The code in this method will be executed when the colors category is clicked on.
                @Override
                public void onClick(View view) {

                    openTwitter(view);
                }
            });
        }

        public void openFacebook(View view) {

            String url = "http://www.facebook.com/tamizhpallikoodam/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }

        public void openTwitter(View view) {

            String url = "http://twitter.com/tamizhpallioz";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
    }


