package com.example.libraryapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button mBtnPutOnShelves;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnPutOnShelves=findViewById(R.id.btn_ShangJia);
        setlisenters();
    }
    private void setlisenters(){
        onclick onclick=new onclick();
        mBtnPutOnShelves.setOnClickListener(onclick);

    }
    private class onclick implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Intent intent=null;
            switch (view.getId()){
                case R.id.btn_ShangJia:
                    intent=new Intent(MainActivity.this,PutOnShelvesActivity.class);
                    break;

            }
            startActivity(intent);
        }
    }
}