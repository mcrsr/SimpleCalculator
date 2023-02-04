package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String expression="0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView result = (TextView) findViewById(R.id.result);

        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);
        Button eight = (Button)findViewById(R.id.eight);
        Button nine = (Button)findViewById(R.id.nine);
        Button zero = (Button)findViewById(R.id.zero);
        Button plus = (Button)findViewById(R.id.plus);
        Button minus = (Button)findViewById(R.id.minus);
        Button into = (Button)findViewById(R.id.into);
        Button divide = (Button)findViewById(R.id.divide);
        Button modulas = (Button)findViewById(R.id.modulas);
        Button equlas = (Button)findViewById(R.id.equals);
        Button openBracket = (Button)findViewById(R.id.openBracket);
        Button closeBracket = (Button)findViewById(R.id.closeBracket);
        Button clear = (Button) findViewById(R.id.clear);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += one.getText().toString();
                result.setText(expression);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += two.getText().toString();
                result.setText(expression);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += three.getText().toString();
                result.setText(expression);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += four.getText().toString();
                result.setText(expression);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += five.getText().toString();
                result.setText(expression);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += six.getText().toString();
                result.setText(expression);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += seven.getText().toString();
                result.setText(expression);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += eight.getText().toString();
                result.setText(expression);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += nine.getText().toString();
                result.setText(expression);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += zero.getText().toString();
                result.setText(expression);
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += plus.getText().toString();
                result.setText(expression);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += minus.getText().toString();
                result.setText(expression);
            }
        });

        into.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += into.getText().toString();
                result.setText(expression);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += divide.getText().toString();
                result.setText(expression);
            }
        });


        modulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += modulas.getText().toString();
                result.setText(expression);
            }
        });
        openBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += openBracket.getText().toString();
                result.setText(expression);
            }
        });


        closeBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression += closeBracket.getText().toString();
                result.setText(expression);
            }
        });
        equlas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Expression expressionBuilder = new ExpressionBuilder(expression).build();
                    result.setText(String.valueOf(expressionBuilder.evaluate()));
                }catch (Exception e){
                    result.setError("Syntax Error!");
                    result.setText("Syntax Error!");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                expression="0";
                result.setText(expression);
            }
        });
    }

}