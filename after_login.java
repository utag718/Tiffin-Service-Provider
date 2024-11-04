package com.example.mad_project;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class after_login extends AppCompatActivity {

    private SearchView searchView;
    private TextView tiffinOneName;
    private TextView tiffinOneRating;
    private TextView tiffinOneLocation;
    private TextView tiffinOneDescription;

    private TextView tiffinTwoName;
    private TextView tiffinTwoRating;
    private TextView tiffinTwoLocation;
    private TextView tiffinTwoDescription;

    private TextView tiffinfourName;
    private TextView tiffinfourRating;
    private TextView tiffinfourLocation;
    private TextView tiffinfourDescription;

    private TextView tiffinfiveName;
    private TextView tiffinfiveRating;
    private TextView tiffinfiveLocation;
    private TextView tiffinfiveDescription;

    private TextView tiffinsixName;
    private TextView tiffinsixRating;
    private TextView tiffinsixLocation;
    private TextView tiffinsixDescription;

    private TextView tiffinsevenName;
    private TextView tiffinsevenRating;
    private TextView tiffinsevenLocation;
    private TextView tiffinsevenDescription;

    private TextView tiffineightName;
    private TextView tiffineightRating;
    private TextView tiffineightLocation;
    private TextView tiffineightDescription;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_after_login);
        searchView = findViewById(R.id.search);
        tiffinOneName = findViewById(R.id.tiffin_one_name);
        tiffinOneRating = findViewById(R.id.tiffin_one_rating);
        tiffinOneLocation = findViewById(R.id.tiffin_one_location);
        tiffinOneDescription = findViewById(R.id.tiffin_one_description);

        tiffinTwoName = findViewById(R.id.tiffin_two_name);
        tiffinTwoRating = findViewById(R.id.tiffin_two_rating);
        tiffinTwoLocation = findViewById(R.id.tiffin_two_location);
        tiffinTwoDescription = findViewById(R.id.tiffin_two_description);

        tiffinfourName = findViewById(R.id.tiffin_four_name);
        tiffinfourRating = findViewById(R.id.tiffin_four_rating);
        tiffinfourLocation = findViewById(R.id.tiffin_four_location);
        tiffinfourDescription = findViewById(R.id.tiffin_four_description);

        tiffinfiveName = findViewById(R.id.tiffin_five_name);
        tiffinfiveRating = findViewById(R.id.tiffin_five_rating);
        tiffinfiveLocation = findViewById(R.id.tiffin_five_location);
        tiffinfiveDescription = findViewById(R.id.tiffin_five_description);

        tiffinsixName = findViewById(R.id.tiffin_six_name);
        tiffinsixRating = findViewById(R.id.tiffin_six_rating);
        tiffinsixLocation = findViewById(R.id.tiffin_six_location);
        tiffinsixDescription = findViewById(R.id.tiffin_six_description);

        tiffinsevenName = findViewById(R.id.tiffin_seven_name);
        tiffinsevenRating = findViewById(R.id.tiffin_seven_rating);
        tiffinsevenLocation = findViewById(R.id.tiffin_seven_location);
        tiffinsevenDescription = findViewById(R.id.tiffin_seven_description);

        tiffineightName = findViewById(R.id.tiffin_eight_name);
        tiffineightRating = findViewById(R.id.tiffin_eight_rating);
        tiffineightLocation = findViewById(R.id.tiffin_eight_location);
        tiffineightDescription = findViewById(R.id.tiffin_eight_description);

        ImageButton btn_vaishali= (ImageButton) findViewById(R.id.one);
        btn_vaishali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, vaishali.class );
                startActivity(i);
            }
        });
        ImageButton btn_renu= (ImageButton) findViewById(R.id.spt_one);
        btn_renu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, renu.class );
                startActivity(i);
            }
        });
        ImageButton btn_ruchira= (ImageButton) findViewById(R.id.spt_two);
        btn_ruchira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, ruchira.class );
                startActivity(i);
            }
        });
        ImageButton btn_tiffin_house= (ImageButton) findViewById(R.id.spt_three);
        btn_tiffin_house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, tiffin_house.class );
                startActivity(i);
            }
        });



        ImageButton btn_kharghar= (ImageButton) findViewById(R.id.two);
        btn_kharghar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, kharghar.class );
                startActivity(i);
            }
        });
        ImageButton btn_namrata= (ImageButton) findViewById(R.id.four);
        btn_namrata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, namrata.class );
                startActivity(i);
            }
        });

        ImageButton btn_dadi= (ImageButton) findViewById(R.id.south);
        btn_dadi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, dadi.class );
                startActivity(i);
            }
        });

        ImageButton btn_jyoti= (ImageButton) findViewById(R.id.jyoti);
        btn_jyoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, jyoti.class );
                startActivity(i);
            }
        });

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageButton btn_maa= (ImageButton) findViewById(R.id.maa);
        btn_maa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, maa.class );
                startActivity(i);
            }
        });

        ImageButton btn_uran= (ImageButton) findViewById(R.id.uran);
        btn_uran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(after_login.this, uran.class );
                startActivity(i);
            }
        });


        // Set up the search functionality
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                filterTiffinServices(newText);
                return false;
            }
        });
    }

    private void filterTiffinServices(String query) {
        String searchQuery = query.toLowerCase();

        // Filter for Tiffin One
        boolean isTiffinOneVisible = tiffinOneName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinOneRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinOneLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinOneDescription.getText().toString().toLowerCase().contains(searchQuery);

        // Filter for Tiffin Two
        boolean isTiffinTwoVisible = tiffinTwoName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinTwoRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinTwoLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinTwoDescription.getText().toString().toLowerCase().contains(searchQuery);

        boolean isTiffinfourVisible = tiffinfourName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinfourRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinfourLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinfourDescription.getText().toString().toLowerCase().contains(searchQuery);

        boolean isTiffinfiveVisible = tiffinfiveName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinfiveRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinfiveLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinfiveDescription.getText().toString().toLowerCase().contains(searchQuery);

        boolean isTiffinsixVisible = tiffinsixName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinsixRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinsixLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinsixDescription.getText().toString().toLowerCase().contains(searchQuery);

        boolean isTiffinsevenVisible = tiffinsevenName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinsevenRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinsevenLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffinsevenDescription.getText().toString().toLowerCase().contains(searchQuery);

        boolean isTiffineightVisible = tiffineightName.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffineightRating.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffineightLocation.getText().toString().toLowerCase().contains(searchQuery) ||
                tiffineightDescription.getText().toString().toLowerCase().contains(searchQuery);

        // Set visibility based on search results
        tiffinOneName.setVisibility(isTiffinOneVisible ? View.VISIBLE : View.GONE);
        tiffinOneRating.setVisibility(isTiffinOneVisible ? View.VISIBLE : View.GONE);
        tiffinOneLocation.setVisibility(isTiffinOneVisible ? View.VISIBLE : View.GONE);
        tiffinOneDescription.setVisibility(isTiffinOneVisible ? View.VISIBLE : View.GONE);

        tiffinTwoName.setVisibility(isTiffinTwoVisible ? View.VISIBLE : View.GONE);
        tiffinTwoRating.setVisibility(isTiffinTwoVisible ? View.VISIBLE : View.GONE);
        tiffinTwoLocation.setVisibility(isTiffinTwoVisible ? View.VISIBLE : View.GONE);
        tiffinTwoDescription.setVisibility(isTiffinTwoVisible ? View.VISIBLE : View.GONE);

        tiffinfourName.setVisibility(isTiffinfourVisible ? View.VISIBLE : View.GONE);
        tiffinfourRating.setVisibility(isTiffinfourVisible ? View.VISIBLE : View.GONE);
        tiffinfourLocation.setVisibility(isTiffinfourVisible ? View.VISIBLE : View.GONE);
        tiffinfourDescription.setVisibility(isTiffinfourVisible ? View.VISIBLE : View.GONE);

        tiffinfiveName.setVisibility(isTiffinfiveVisible ? View.VISIBLE : View.GONE);
        tiffinfiveRating.setVisibility(isTiffinfiveVisible ? View.VISIBLE : View.GONE);
        tiffinfiveLocation.setVisibility(isTiffinfiveVisible ? View.VISIBLE : View.GONE);
        tiffinfiveDescription.setVisibility(isTiffinfiveVisible ? View.VISIBLE : View.GONE);

        tiffinsixName.setVisibility(isTiffinsixVisible ? View.VISIBLE : View.GONE);
        tiffinsixRating.setVisibility(isTiffinsixVisible ? View.VISIBLE : View.GONE);
        tiffinsixLocation.setVisibility(isTiffinsixVisible ? View.VISIBLE : View.GONE);
        tiffinsixDescription.setVisibility(isTiffinsixVisible ? View.VISIBLE : View.GONE);

        tiffinsevenName.setVisibility(isTiffinsevenVisible ? View.VISIBLE : View.GONE);
        tiffinsevenRating.setVisibility(isTiffinsevenVisible ? View.VISIBLE : View.GONE);
        tiffinsevenLocation.setVisibility(isTiffinsevenVisible ? View.VISIBLE : View.GONE);
        tiffinsevenDescription.setVisibility(isTiffinsevenVisible ? View.VISIBLE : View.GONE);

        tiffineightName.setVisibility(isTiffineightVisible ? View.VISIBLE : View.GONE);
        tiffineightRating.setVisibility(isTiffineightVisible ? View.VISIBLE : View.GONE);
        tiffineightLocation.setVisibility(isTiffineightVisible ? View.VISIBLE : View.GONE);
        tiffineightDescription.setVisibility(isTiffineightVisible ? View.VISIBLE : View.GONE);
    }
}





