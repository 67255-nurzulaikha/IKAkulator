package com.example.ikakulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display= findViewById(R.id.textView);
        display.setShowSoftInputOnFocus(false);
        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getString(R.string.display).equals(display.getText().toString()))
                    display.setText("");
            }
        });
    }

    private void updateText (String strToAdd){
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftStr = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);

        display.setText(String.format("%s%s%s", leftStr, strToAdd, rightStr));

    }


    public void zero_btn(View view) {
        updateText(strToAdd: "0");
    }

    public void one_btn(View view) {
        updateText(strToAdd:"1");
    }

    public void two_btn(View view) {
        updateText(strToAdd:"2");
    }

    public void three_btn(View view) {
        updateText(strToAdd:"3");
    }

    public void four_btn(View view) {
        updateText(strToAdd:"4");
    }

    public void five_btn(View view) {
        updateText(strToAdd:"5");
    }

    public void six_btn(View view) {
        updateText(strToAdd:"6");
    }

    public void seven_btn(View view) {
        updateText(strToAdd:"7");
    }

    public void eight_btn(View view) {
        updateText(strToAdd:"8");
    }

    public void nine_btn(View view) {
        updateText(strToAdd:"9");
    }

    public void equal_btn(View view) {
        updateText(strToAdd:" ");
    }

    public void clear_btn(View view) {
        updateText(strToAdd:" ");
    }

    public void point_btn(View view) {
        updateText(strToAdd:".");
    }

    public void plusminus_btn(View view) {
        updateText(strToAdd:"9");
    }

    public void exponent_btn(View view) {
        updateText(strToAdd:"E");
    }

    public void parantheses_btn(View view) {
        updateText(strToAdd:" ");
    }

    public void add_btn(View view) {
        updateText(strToAdd:"+");
    }

    public void subtract_btn(View view) {
        updateText(strToAdd:"-");
    }

    public void divide_btn(View view) {
        updateText(strToAdd:"÷");
    }

    public void multiply_btn(View view) {
        updateText(strToAdd:"×");
    }

    public void backspace_btn(View view) {
        updateText(strToAdd:" ");
    }
}