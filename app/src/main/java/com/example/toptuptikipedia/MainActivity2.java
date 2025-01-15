package com.example.toptuptikipedia;

import androidx.appcompat.app.AppCompatActivity;



        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            // Inisialisasi ImageView dan TextView
            ImageView imageMlbb = findViewById(R.id.image_mlbb);
            ImageView imagePubg = findViewById(R.id.image_pubg);
            ImageView imageFreeFire = findViewById(R.id.image_free_fire);
            ImageView imageValo = findViewById(R.id.image_valo);
            ImageView imageJoki = findViewById(R.id.image_joki);
            ImageView imageFifa = findViewById(R.id.image_fifa);
            ImageView imageGenshin = findViewById(R.id.image_genshin);
            ImageView imageJokimbr = findViewById(R.id.image_jokimbr);
            ImageView imageCod = findViewById(R.id.image_cod);

            TextView textMlbb = findViewById(R.id.text_mlbb);
            TextView textPubg = findViewById(R.id.text_pubg);
            TextView textFreeFire = findViewById(R.id.text_free_fire);
            TextView textValo = findViewById(R.id.text_valo);
            TextView textJoki = findViewById(R.id.text_joki);
            TextView textFifa = findViewById(R.id.text_fifa);
            TextView textGenshin = findViewById(R.id.text_genshin);
            TextView textJokimbr = findViewById(R.id.text_jokimbr);
            TextView textCod = findViewById(R.id.text_cod);

            // Contoh penanganan klik pada ImageView
            imageMlbb.setOnClickListener(view -> showToast("Mobile Legends Clicked"));
            imagePubg.setOnClickListener(view -> showToast("PUBG Clicked"));
            imageFreeFire.setOnClickListener(view -> showToast("Free Fire Clicked"));
            imageValo.setOnClickListener(view -> showToast("Valorant Clicked"));
            imageJoki.setOnClickListener(view -> showToast("Joki Rank Clicked"));
            imageFifa.setOnClickListener(view -> showToast("FIFA Clicked"));
            imageGenshin.setOnClickListener(view -> showToast("Genshin Impact Clicked"));
            imageJokimbr.setOnClickListener(view -> showToast("Joki Mabar Clicked"));
            imageCod.setOnClickListener(view -> showToast("Call of Duty Clicked"));

            // Contoh penanganan klik pada TextView
            textMlbb.setOnClickListener(view -> showToast("Mobile Legends Text Clicked"));
            textPubg.setOnClickListener(view -> showToast("PUBG Text Clicked"));
            textFreeFire.setOnClickListener(view -> showToast("Free Fire Text Clicked"));
            textValo.setOnClickListener(view -> showToast("Valorant Text Clicked"));
            textJoki.setOnClickListener(view -> showToast("Joki Rank Text Clicked"));
            textFifa.setOnClickListener(view -> showToast("FIFA Text Clicked"));
            textGenshin.setOnClickListener(view -> showToast("Genshin Impact Text Clicked"));
            textJokimbr.setOnClickListener(view -> showToast("Joki Mabar Text Clicked"));
            textCod.setOnClickListener(view -> showToast("Call of Duty Text Clicked"));
        }

        // Method untuk menampilkan Toast
        private void showToast(String message) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }
    }
}