package com.example.lab3simplecalulator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.util.Log;
import android.annotation.SuppressLint;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private enum Operator { name, add, minus, multiply, none, divide, eq }
    private double data01 = 0, data02 = 0;
    private Operator opp = Operator.none;

    private boolean requiresCleaning = false;
    private boolean hasDot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    //Function called every time a number button is pressed
    public void onClickNumericalButton(View view) {
//Getting ID of pressed Button
        int pressID = view.getId();

//Getting Text object where we display the current number value
        TextView curText = (TextView)findViewById(R.id.resultEdit);

//If we had an equal sign pressed last, standard operation is to clean
        if (opp == Operator.eq) {
            opp = Operator.none;
            curText.setText("");
        }
            if (requiresCleaning) {
                requiresCleaning = false;
                curText.setText("");
            }

//Figuring out which button was pressed and updating the represented text field object
                switch (pressID) {
                    case R.id.button00:
                        curText. setText (curText.getText() + "0");
                        break;
                    case R.id.button01:
                        curText.setText(curText.getText() + "1");
                        break;
                    case R.id.button02:
                        curText. setText (curText.getText() + "2");
                        break;
                    case R.id.button03:
                        curText.setText(curText.getText() + "3");
                        break;
                    case R.id.button04:
                        curText. setText (curText.getText() + "4");
                        break;
                    case R.id.button05:
                        curText.setText(curText.getText() + "5");
                        break;
                    case R.id.button06:
                        curText.setText(curText.getText() + "6");
                        break;
                    case R.id.button07:
                        curText.setText(curText.getText() + "7");
                        break;
                    case R.id.button08:
                        curText.setText(curText.getText() + "8");
                        break;
                    case R.id.button09:
                        curText.setText(curText.getText() + "9");
                        break;
                    case

                            R.id.button_Decimal:
                        if (!hasDot) {
                            curText.setText(curText.getText() + ".");
                            hasDot = true;
                        } else {
//TODO Decide if we will implement a special case for when we already have a decimal point.
//For now we follow android guidelines and ignore
                        }

                            break;
                            default:
                                curText.setText("ERROR");
                                Log.d( "Error", "Error: Unknown Button pressed!");
                                break;
                }
    }
    @SuppressLint("NonConstantResourceId")
    public void onClickFunctionButton(View view) {
//Getting ID of pressed Button
        int pressID = view.getId();

//Getting Text object where we display the current number value
        TextView curText = (TextView)findViewById(R.id.resultEdit);

//CE clears all regardless of context
        if (pressID == R.id.buttonCE) {
            opp = Operator.none;
            curText.setText("");
            data01 = 0;
            data02 = 0;
            requiresCleaning = false;
            return;
        }
            String dataText = curText.getText().toString();
            double numberVal = dataText.length() > 0 ? Double.parseDouble(dataText) : 0;

//Checking if we have "prior data" aka something stored in data1 that we should use
//Having data1 != 0 is not enough, we need to know of a previous operator, hence this
            if (opp == Operator.none) {
                data01 = numberVal;
                requiresCleaning = true;
                switch (pressID) {
                    case R.id.button_Equals:
//TODO Decide if we will implement a special function for the no data equal operation
                        opp = Operator.eq;
                        data01 = 0;
                        break;

                    case R.id.button_plus:
                        opp = Operator.add;
                        break;

                    case R.id.button_Minus:
                        opp = Operator.minus;
                        break;

                    case R.id.button_Divide:
                        opp = Operator.divide;
                        break;

                    case R.id.buttonX:
                        opp = Operator.multiply;
                        break;

                    case R.id.buttonCE:
                        opp = Operator.none;
                        break;
                }
                } else {

                double result = 0;
                data02 = numberVal;

                switch (opp) {
                    case eq:
//TODO: Technically this doesn't do anything and shouldn't accur
                        break;

                    case none:
//TODO: Technically this can't do anything and will never occur
                        break;

                    case add:
                        result = data01 + data02;
                        break;

                    case minus:
                        result = data01 - data02;
                        break;

                    case divide:
                        result = data01 / data02;
                        break;

                    case multiply:
                        result = data01 * data02;
                        break;
                }
                    data01 = result;
                    opp = Operator.none;
                    if ( (result - (int)result) != 0) {
                        curText.setText(String.valueOf(result));
                    } else {
                        curText.setText(String.valueOf((int) result));
                    }
            }
    }







}
