package com.example.chat_application.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;


import com.example.chat_application.R;
import com.example.chat_application.databinding.ActivityChatBinding;
import com.example.chat_application.models.User;
import com.example.chat_application.utilites.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetails();
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener(v -> onBackPressed() );
    }

    private void loadReceiverDetails(){
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }
}