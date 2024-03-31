package com.example.chat_application.activities;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Base64;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.chat_application.R;
import com.example.chat_application.databinding.ActivityViewProfileBinding;
import com.example.chat_application.utilites.Constants;

public class ViewProfile extends AppCompatActivity {

    private ActivityViewProfileBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile);
        binding = ActivityViewProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        loadReceiverDetails();
        binding.imageBack.setOnClickListener(view -> onBackPressed());
    }

    private void loadReceiverDetails(){
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String uName = extras.getString(Constants.KEY_NAME);
        String uImage = extras.getString(Constants.KEY_IMAGE);
        String uEmail = extras.getString(Constants.KEY_EMAIL);
        binding.inputName.setText(uName);
        binding.imageProfile.setImageBitmap(getUserImage(uImage));

    }
    private Bitmap getUserImage(String encodedImage){
        byte[] bytes = Base64.decode(encodedImage, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes , 0, bytes.length);
    }
}