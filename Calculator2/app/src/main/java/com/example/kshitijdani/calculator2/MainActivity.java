package com.example.kshitijdani.calculator2;

import java.util.*;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import java.lang.*;
import java.io.Serializable;

// APP STOPS ON UNNECESSARY OPERATIONS

public class MainActivity extends AppCompatActivity {

    double firstValue=0,secondValue;
    StringBuilder firstString = new StringBuilder("0");
    StringBuilder secondString = new StringBuilder("");
    long integerChecking;
    double NaN;
    boolean flag=false;
    boolean tttt = false;
    boolean zeroflag=false;
    boolean dotflag=false;
    boolean mflag = false;
    char op = '~';
    String sb = "";
    StringBuilder aaa = new StringBuilder(sb);
    ArrayList<String> arr= new ArrayList<>();
    boolean breakFlag = false;
    Character plus = new Character('+');
    Character minus = new Character('-');
    Character mul = new Character('x');
    Character div = new Character('/');
    Character eq = new Character('=');


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button b1 = findViewById(R.id.b1);
        final Button b2 = findViewById(R.id.b2);
        final Button b3 = findViewById(R.id.b3);
        final Button b4 = findViewById(R.id.b4);
        final Button b5 = findViewById(R.id.b5);
        final Button b6 = findViewById(R.id.b6);
        final Button b7 = findViewById(R.id.b7);
        final Button b8 = findViewById(R.id.b8);
        final Button b9 = findViewById(R.id.b9);
        final Button b0 = findViewById(R.id.b0);
        final Button badd = findViewById(R.id.badd);
        final Button bsub = findViewById(R.id.bsub);
        final Button bmul = findViewById(R.id.bmul);
        final Button bdiv = findViewById(R.id.bdiv);
        final Button bdot = findViewById(R.id.bdot);
        final Button bcl = findViewById(R.id.bcl);
        final Button beq = findViewById(R.id.beq);
        final Button bhist = findViewById(R.id.bhist);

        final TextView dis = findViewById(R.id.dis);
        final TextView screen = findViewById(R.id.screen);

        //boolean addOp,subOp,mulOp,divOp;



        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("1");
                dis.setText(dis.getText()+"1");// Code here executes on main thread after user presses button
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("2");
                dis.setText(dis.getText()+"2");// Code here executes on main thread after user presses button
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("3");
                dis.setText(dis.getText()+"3");// Code here executes on main thread after user presses button
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("4");
                dis.setText(dis.getText()+"4");// Code here executes on main thread after user presses button
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("5");
                dis.setText(dis.getText()+"5");// Code here executes on main thread after user presses button
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("6");
                dis.setText(dis.getText()+"6");// Code here executes on main thread after user presses button
            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("7");
                dis.setText(dis.getText()+"7");// Code here executes on main thread after user presses button
            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("8");
                dis.setText(dis.getText()+"8");// Code here executes on main thread after user presses button
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("9");
                dis.setText(dis.getText()+"9");// Code here executes on main thread after user presses button
            }
        });


        b0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                aaa.append("0");
                dis.setText(dis.getText()+"0");// Code here executes on main thread after user presses button
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dotflag=false;
                aaa.append("+");
//                if(flag==false){
//                    flag=true;
//                    firstValue=Float.parseFloat(dis.getText()+"");
//                }
//                else{
//                    if(op=='~'){
//                        op = '+';
//                    }
//                    else {
//                        secondValue = Float.parseFloat(dis.getText() + "");
//                        if (op == '+')
//                            firstValue += secondValue;
//                        else if (op == '-')
//                            firstValue -= secondValue;
//                        else if (op == '*')
//                            firstValue *= secondValue;
//                        else {
//                            if (secondValue == 0) {
//                                zeroflag = true;
//                                screen.setText("NaN");
//                                firstValue = 0;
//                            } else {
//                                firstValue /= secondValue;
//                            }
//                        }
//                        if (zeroflag == false) {
//                            screen.setText(String.format("%.2f", firstValue));
//                        }
//                    }
//                    secondValue=0;
//                }
//                op = '+';

                dis.setText(dis.getText() + "+");// Code here executes on main thread after user presses button

            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotflag=false;
                aaa.append("-");
//                if(flag==false){
//                    flag=true;
//                    firstValue=Float.parseFloat(dis.getText()+"");
//                }
//                else{
//                    if(op=='~'){
//                        op = '-';
//                    }
//                    else {
//                        secondValue = Float.parseFloat(dis.getText() + "");
//                        if (op == '+')
//                            firstValue += secondValue;
//                        else if (op == '-')
//                            firstValue -= secondValue;
//                        else if (op == '*')
//                            firstValue *= secondValue;
//                        else if (op == '~')
//                            op = '-';
//                        else {
//                            if (secondValue == 0) {
//                                zeroflag = true;
//                                screen.setText("NaN");
//                                firstValue = 0;
//                            } else {
//                                firstValue /= secondValue;
//                            }
//                        }
//                        if (zeroflag == false) {
//                            screen.setText(String.format("%.2f", firstValue));
//                        }
//                    }
//                    secondValue=0;
//                }
//                op = '-';


                dis.setText(dis.getText()+"-");// Code here executes on main thread after user presses button

            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotflag=false;
                aaa.append("x");
//                if(flag==false){
//                    flag=true;
//                    firstValue=Float.parseFloat(dis.getText()+"");
//                }
//                else{
//                    if(op=='~'){
//                        op = '*';
//                    }
//                    else {
//                        secondValue = Float.parseFloat(dis.getText() + "");
//                        if (op == '+')
//                            firstValue += secondValue;
//                        else if (op == '-')
//                            firstValue -= secondValue;
//                        else if (op == '*')
//                            firstValue *= secondValue;
//                        else if (op == '~')
//                            op = '*';
//                        else {
//                            if (secondValue == 0) {
//                                zeroflag = true;
//                                screen.setText("NaN");
//                                firstValue = 0;
//                            } else {
//                                firstValue /= secondValue;
//                            }
//                        }
//                        if (zeroflag == false) {
//                            screen.setText(String.format("%.2f", firstValue));
//                        }
//                    }
//                    secondValue=0;
//                }
//                op = '*';

                dis.setText(dis.getText()+"x");// Code here executes on main thread after user presses button

            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotflag=false;
                aaa.append("/");
//                if(flag==false){
//                    flag=true;
//                    firstValue=Float.parseFloat(dis.getText()+"");
//                }
//                else{
//                    if(op=='~'){
//                        op = '/';
//                    }
//                    else {
//                        secondValue = Float.parseFloat(dis.getText() + "");
//                        if (op == '+')
//                            firstValue += secondValue;
//                        else if (op == '-')
//                            firstValue -= secondValue;
//                        else if (op == '*')
//                            firstValue *= secondValue;
//                        else if (op == '~')
//                            op = '/';
//                        else {
//                            if (secondValue == 0) {
//                                zeroflag = true;
//                                screen.setText("NaN");
//                                firstValue = 0;
//                            } else {
//                                firstValue /= secondValue;
//                            }
//                        }
//                        if (zeroflag == false) {
//                            screen.setText(String.format("%.2f", firstValue));
//                        }
//                    }
//                    secondValue=0;
//                }
//                op = '/';
                dis.setText(dis.getText()+"/");// Code here executes on main thread after user presses button

            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(dotflag==false) {
                    aaa.append(".");
                    dis.setText(dis.getText() + ".");
                    dotflag=true;
                }
                // Code here executes on main thread after user presses button
            }
        });

        bcl.setOnLongClickListener(new View.OnLongClickListener() {

            public boolean onLongClick(View v) {
                dotflag=false;
                aaa = new StringBuilder((""));
                firstValue=0;
                secondValue=0;
                flag = false;
                zeroflag=false;
                screen.setText("0");
                dis.setText("");// Code here executes on main thread after user presses button
                return true;
            }
        });

        bcl.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(aaa.length() == 0){
                    aaa = new StringBuilder("");
                    dis.setText(null);
                }

                else {
                    Character c1 = new Character(aaa.charAt(aaa.length() - 1));
                    Character c2 = new Character('.');
                    if (c1.equals(c2)) {
                        dotflag = false;
                    }
                    aaa.setLength(aaa.length() - 1);
                }


                dis.setText(aaa.toString());
            }
        });


        // FIND VALUE OF STRING
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dotflag=false;
                aaa.append("=");
//                dis.setText(aaa.toString());
//                if(flag==false){
//                    flag=true;
//                    firstValue=Float.parseFloat(dis.getText()+"");
//                }
//                else{
//                    secondValue=Float.parseFloat(dis.getText()+"");
//                    if(op == '+')
//                        firstValue+=secondValue;
//                    else if(op == '-')
//                        firstValue-=secondValue;
//                    else if(op == '*')
//                        firstValue*=secondValue;
//                    else{
//                        if(secondValue==0){
//                            zeroflag=true;
//                            screen.setText("NaN");
//                            firstValue=0;
//                        }
//                        else{
//                            firstValue/=secondValue;
//                        }
//                    }
//                    secondValue=0;
//                }
//                op = '~';
//                // op has to be set as NULL
////                flag=false;
//
//                if(zeroflag==false) {
////                    screen.setText(null);
//                    dis.setText(null);
//                    String secondString=String.format("%.2f", firstValue);
//                    Float  secondFloat = Float.parseFloat(secondString);
//                    secondFloat*=100;
//                    if(secondFloat%100==0){
//                        aaa.append(String.format("%.0f",firstValue));
//                        screen.setText(String.format("%.0f",firstValue));
//                    }
//                    else{
//                        aaa.append(String.format("%.2f",firstValue));
//                        screen.setText(String.format("%.2f",firstValue));
//                    }
//                }


                String ans = aaa.toString();

//                screen.setText(ans);

                for(int i = 0; i < ans.length(); i++){
//                    screen
//                    System.out.println(ans.charAt(i));



                    if(breakFlag){
                        breakFlag=false;
                        firstValue = 0;
                        secondValue = 0;
                        firstString = new StringBuilder("");
                        secondString = new StringBuilder("");
                        tttt = true;
                        flag = false;
                        dotflag = false;
                        mflag = false;
                        aaa = new StringBuilder("");
                        op = '~';
                        break;
                    }

                    Character temp = new Character(ans.charAt(i));
                    if(flag == false && (!temp.equals(plus) && !temp.equals(minus) && !temp.equals(mul) && !temp.equals(div) && !temp.equals(eq))){
                        firstString.append(ans.charAt(i));
//                        screen.setText(firstString);
                    }
                    else if (flag && (!temp.equals(plus) && !temp.equals(minus) && !temp.equals(mul) && !temp.equals(div) && !temp.equals(eq))){
                        secondString.append(ans.charAt(i));
                    }
                    else{
                        if(flag == false){
                            firstValue = Float.parseFloat(firstString.toString());
                            System.out.println(firstValue);
                            flag = true;
                            if(op == '~'){
                                op = ans.charAt(i);

                            }

                        }
                        else {


                            if (mflag) {
                                secondValue = Float.parseFloat(secondString.toString());
                                secondValue = -1 * secondValue;
                                tttt = true;
                                mflag = false;
                            }
                            if (i > 0) {
                                Character prev = new Character(aaa.charAt(i - 1));
                                if (prev.equals(plus) || prev.equals(minus) || prev.equals(mul) || prev.equals(div)) {
                                    mflag = true;
                                }
                            }

                            if (!mflag) {
                                if (!tttt)
                                    secondValue = Float.parseFloat(secondString.toString());
                                tttt = false;

                                if (op == '+')
                                    firstValue += secondValue;
                                else if (op == '-')
                                    firstValue -= secondValue;
                                else if (op == 'x')
                                    firstValue *= secondValue;
                                    //                            else if (op == '/')
                                    //                                op = '/';
                                else {
                                    if (secondValue == 0) {
                                        zeroflag = true;
                                        screen.setText("NaN");
                                        dis.setText(null);
                                        breakFlag = true;

                                        aaa.append("NaN");
                                        if(arr.size() == 20){
                                            arr.remove(0);
                                        }
                                        System.out.println("break flag set");
                                        arr.add(aaa.toString());
                                        firstValue = 0;
                                        secondValue = 0;
                                        firstString = new StringBuilder("0");
                                        secondString = new StringBuilder("");
                                        tttt = false;
                                        flag = false;
                                        dotflag = false;
                                        mflag = false;
                                        aaa = new StringBuilder("");
                                        op = '~';
                                    }
                                    else {
                                        firstValue /= secondValue;
                                    }

                                }
                                if(breakFlag){
                                    breakFlag=false;
                                    break;
                                }
                                //                            System.out.println(firstValue);
                                secondString = new StringBuilder("");


                                op = aaa.charAt(i);

                                //                            System.out.println(op);
                                if (op == '=' && !zeroflag) {
                                    //                                aaa.append(firstValue);
                                    //                                System.out.println(firstValue);
                                    dis.setText(null);
                                    String ansString = String.format("%.2f", firstValue);
                                    Double ansDouble = Double.parseDouble(ansString);
                                    ansDouble *= 100;
                                    if (ansDouble % 100 == 0) {
                                        aaa.append(String.format("%.0f", firstValue));
                                        screen.setText(String.format("%.0f", firstValue));
                                    } else {
                                        aaa.append(String.format("%.2f", firstValue));
                                        screen.setText(String.format("%.2f", firstValue));
                                    }

                                    if (arr.size() == 20) {
                                        arr.remove(0);
                                    }


                                    arr.add(aaa.toString());
                                    firstValue = 0;
                                    secondValue = 0;
                                    firstString = new StringBuilder("0");
                                    secondString = new StringBuilder("");
                                    zeroflag = false;
                                    flag = false;
                                    dotflag = false;
                                    aaa = new StringBuilder("");
                                    op = '~';
                                }
                                //                            if (zeroflag == false) {
                                //                                screen.setText(String.format("%.2f", firstValue));
                                //                            }
                            }
                        }
                    }
                    System.out.println("fs " + firstString);
                    System.out.println("ss " + secondString);
                    System.out.println("op " + op);
                    System.out.println("fv " + firstValue);
                    System.out.println("sv " + secondValue);
                    System.out.println();
                }
                for(int i=0;i<arr.size();i++){
                    System.out.println(arr.get(i));
                }
                breakFlag=false;
                //zeroflag=false;

                //ADDING INTO ARRAYLIST PRODUCING ERROR
                //arr.add(aaa.toString());

//                integerChecking=Math.round(firstValue);
//                if(integerChecking!=firstValue) {
//                    screen.setText(String.format("%.2f", firstValue));// Code here executes on main thread after user presses button
//                }
//                else{
//                    screen.setText(String.format("%d",integerChecking));
//                }
            }
        });

//        final Context context = this;
//
        bhist.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(getApplicationContext(), History2.class);
//                Bundle args = new Bundle();
//                args.putSerializable("ARRAYLIST",(Serializable)arr);
                intent.putExtra("BUNDLE",arr);
                startActivity(intent);
//                Intent intent = new Intent(getApplicationContext(), History2.class);
//                startActivity(intent);

            }

        });



    }
}
