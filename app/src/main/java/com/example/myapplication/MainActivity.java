package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private int cash = 312;

    private int coat = 70;
    private int coatDiscount = 77;

    private int hat = 25;
    private int hatDiscount = 37;

    private int tuxedo = 53;
    private int tuxedoDiscount = 44;

    private int shirt = 19;

    private int shoes = 41;
    private int shoesDiscount = 32;

    public boolean canBuyIt() {
        float result;

        result = (coat * coatDiscount + hat * hatDiscount + tuxedo *
                tuxedoDiscount+shirt + shoes * shoesDiscount) / 100;

        result = cash - result;

        if (result<0) return false;
            else return true;

    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.txt);

        boolean flag = canBuyIt();

        if (flag==true) {
            txt.setText("мы можем купить это!!!!!");
        }else {
            txt.setText("мне жаль, но не в этот раз! мы не можем купить это((");
        }
    }
}