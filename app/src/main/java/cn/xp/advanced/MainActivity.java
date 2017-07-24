package cn.xp.advanced;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.xp.advanced.draw1_1.BasicDrawActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1_1:
                startActivity(new Intent(this, BasicDrawActivity.class));
                break;


        }
    }
}



