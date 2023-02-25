package com.example.zaidi_app_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.example.zaidi_app_project.Handler.DBHandler;
import com.example.zaidi_app_project.Models.Model;
import com.example.zaidi_app_project.databinding.ActivityDetailsBinding;
import com.example.zaidi_app_project.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding detailsBinding;
    private DBHandler handler;
    private ArrayList<Model.UserModel> userModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        detailsBinding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = detailsBinding.getRoot();
        setContentView(view);


        handler = new DBHandler(getApplicationContext());
        userModelArrayList = handler.readUser();

        detailsBinding.name.setText(userModelArrayList.get(0).getCustomername());
        detailsBinding.email.setText(userModelArrayList.get(0).getEmailid());
        detailsBinding.edate.setText(userModelArrayList.get(0).getEdate());
        detailsBinding.gender.setText(userModelArrayList.get(0).getGender());
        detailsBinding.password.setText(userModelArrayList.get(0).getPassword());





    }
}