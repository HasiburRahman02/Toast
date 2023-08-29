/*  Toast in App Development.

    Date:29 August,2023
    Author:Hasibur Rahman

 */
package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private Button installButton,uninstallButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        installButton = (Button) findViewById(R.id.installButtonId);
        uninstallButton = (Button) findViewById(R.id.uninstallButtonId);
        textView = (TextView) findViewById(R.id.textViewId);
    }
    public void showMassege(View view)
    {
        if(view.getId()==R.id.installButtonId)
        {
            Toast.makeText(MainActivity.this,"Install Completed",Toast.LENGTH_SHORT).show();
        }
        else if(view.getId()==R.id.uninstallButtonId)
        {
            Toast toast = Toast.makeText(MainActivity.this,"Uninstall Completed",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.NO_GRAVITY,0,0);
            toast.show();
        }
    }
}