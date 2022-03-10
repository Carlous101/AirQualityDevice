package com.example.login_navview;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//Notificación Device**************
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;


public class MainActivitySingUp extends AppCompatActivity {
    /*
    //Notificación Device**************
    NotificationManagerCompat notificationManagerCompat;
    Notification notification;
     */

    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sing_up);

        btnLogin=findViewById(R.id.btnSesion);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent register= new Intent(MainActivitySingUp.this, MainActivity.class);//Que se valla a la de registrar.
                startActivity(register);
            }
        });
        //Guardar nuevo Usuario
        AlertDialog.Builder sms=new AlertDialog.Builder(this);
        sms.setMessage("Usuario registrado correctamente...!");

/*
//Notificación Device**************
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new NotificationChannel("myCh", "My channel", NotificationManager.IMPORTANCE_HIGH);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "myCh")
                .setSmallIcon(android.R.drawable.stat_notify_sync)
                .setContentTitle("Air Quality Device")
                .setContentText("Alerta Roja!!!");

        notification=builder.build();
        notificationManagerCompat= NotificationManagerCompat.from(this);
 */
    }
/*
    //Notificación Device**************
    public void push(View view) {
        notificationManagerCompat.notify(1, notification);
    }
 */

}