package com.potemkinas.floppy.Profile;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import com.potemkinas.floppy.AddedPhoto;
import com.potemkinas.floppy.AddedVideo;
import com.potemkinas.floppy.LoginIn;
import com.potemkinas.floppy.MainActivity;
import com.potemkinas.floppy.PhotoCameraPage;
import com.potemkinas.floppy.R;
import com.potemkinas.floppy.settings;

public class ProfilePage extends AppCompatActivity {
    private TextView name,photoNum;
    private String nameS;
    private int PhotoCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        name = (TextView) findViewById(R.id.username);
        photoNum=(TextView) findViewById(R.id.NumberOfAddedPhotos);
        nameS=(LoginIn.UserName);
        ImageView imageView = (ImageView) findViewById(R.id.DevInfoPic);
        PhotoCount=(PhotoCameraPage.counter);
        TextView TextInfo = (TextView) findViewById(R.id.PhoneInfo);
        TextInfo.setText(
                "Устройство: " + Build.DEVICE + "\n"
                + "Изготовитель: " + Build.MANUFACTURER + "\n"
                + "Модель: " + Build.MODEL + "\n"+
                "Наименование версии ОС: " + Build.ID + "\n");

        name.setText("Имя: "+nameS);
        photoNum.setText("Фото добавлено: "+PhotoCount);



    }


    public void onClickHome(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void onClickSettings(View view) {
        Intent intent=new Intent(this, settings.class);
        startActivity(intent);
    }

    public void onClickAddedPhoto(View view) {
        Intent intent=new Intent(this, AddedPhoto.class);
        startActivity(intent);
    }
    public void onClickAddedVideo(View view) {
        Intent intent=new Intent(this, AddedVideo.class);
        startActivity(intent);
    }
}