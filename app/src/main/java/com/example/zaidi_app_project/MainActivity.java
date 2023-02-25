package com.example.zaidi_app_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.example.zaidi_app_project.API.Methods;
import com.example.zaidi_app_project.Handler.DBHandler;
import com.example.zaidi_app_project.Models.Model;
import com.example.zaidi_app_project.Retrofit.RetrofitClient;
import com.example.zaidi_app_project.databinding.ActivityMainBinding;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mainBinding;
    private String number = "";

    private DBHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = mainBinding.getRoot();
        setContentView(view);


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_DENIED ||
                ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_DENIED) {
            ActivityCompat.requestPermissions(this, new String[]{
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.WRITE_EXTERNAL_STORAGE
                    },
                    100);
        }

        mainBinding.phoneNumber.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().length() == 1 && editable.toString().startsWith("0")) {
                    Toast.makeText(MainActivity.this, "Start the number without zero", Toast.LENGTH_SHORT).show();
                    editable.clear();
                }
            }
        });


        mainBinding.submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = mainBinding.phoneNumber.getText().toString();
                Methods methods = RetrofitClient.getRetrofitInstance().create(Methods.class);

                handler = new DBHandler(getApplicationContext());

                Call<Model> call = methods.getAllData(number);
                call.enqueue(new Callback<Model>() {
                    @Override
                    public void onResponse(@NonNull Call<Model> call, @NonNull Response<Model> response) {

                        if (response.body() == null) {
                            Toast.makeText(MainActivity.this, "Body is null", Toast.LENGTH_SHORT).show();
                        } else {
                            ArrayList<Model.UserModel> data = response.body().getData();
                            Model.UserModel model = data.get(0);

                            handler.addUser(model.getCustomerid(),
                                    model.getCustomercode(),
                                    model.getCustomername(),
                                    model.getGender(),
                                    model.getAgencycode(),
                                    model.getPersonalcontact(),
                                    model.getHomecontact(),
                                    model.getEmailid(),
                                    model.getAddress(),
                                    model.getStateid(),
                                    model.getPincode(),
                                    model.getBirtdate(),
                                    model.getMarriagedate(),
                                    model.getCategory(),
                                    model.getMdrttick(),
                                    model.getBusinessprofile(),
                                    model.getProfilepicture(),
                                    model.getLicBranchid(),
                                    model.getLicDivisionEntryid(),
                                    model.getPassword(),
                                    model.getDesignation(),
                                    model.getClubnumber(),
                                    model.isLifeinsurance(),
                                    model.isNonlife(),
                                    model.isHealthinsurance(),
                                    model.isMutualfunds(),
                                    model.isOther(),
                                    model.getWebsite(),
                                    model.getEform(),
                                    model.getEdate(),
                                    model.getGst(),
                                    model.getFblink(),
                                    model.getAuth_key(),
                                    model.getInstance_id(),
                                    model.getAccess_token(),
                                    model.getCityname(),
                                    model.getDomainname(),
                                    model.getStatename(),
                                    model.getBimacare_start_date(),
                                    model.getBimacare_end_date());


                            Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                            startActivity(intent);


//                            Toast.makeText(MainActivity.this, data.get(0).getCustomername(), Toast.LENGTH_SHORT).show();
                        }


                    }

                    @Override
                    public void onFailure(Call<Model> call, Throwable t) {
                        Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();

                        t.printStackTrace();
                    }
                });
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100) {
            Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show();
        }
    }

}



