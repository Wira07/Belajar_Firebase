package com.example.projectjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.Random;

public class javaquiz extends AppCompatActivity {
    private TextView question, questionno;
    private Button option1, option2, option3, option4,stopquiz,showans;
    private ArrayList<quizmodel> quizmodelArrayList;
    Random random;
    Button dashboard;

    int currentscore=1, questionAttempt=1, currentpos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javaquiz);
        question=findViewById(R.id.questions);
        questionno=findViewById(R.id.idTVQuestionAttempted);
        option1=findViewById(R.id.idbtnoption1);
        option2=findViewById(R.id.idbtnoption2);
        option3=findViewById(R.id.idbtnoption3);
        option4=findViewById(R.id.idbtnoption4);
        stopquiz=findViewById(R.id.stopquiz);
        stopquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });


        quizmodelArrayList=new ArrayList<>();
        random=new Random();
        getQuizQuestion(quizmodelArrayList);
        currentpos= random.nextInt(quizmodelArrayList.size());
        setDatatoviews(currentpos);
        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option1.getText().toString().trim().toLowerCase())){
                    currentscore++;
                }
                questionAttempt++;
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDatatoviews(currentpos);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option2.getText().toString().trim().toLowerCase())){
                    currentscore++;
                }
                questionAttempt++;
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDatatoviews(currentpos);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option3.getText().toString().trim().toLowerCase())){
                    currentscore++;
                }
                questionAttempt++;
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDatatoviews(currentpos);
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(quizmodelArrayList.get(currentpos).getAnswer().trim().toLowerCase().equals(option4.getText().toString().trim().toLowerCase())){
                    currentscore++;
                }
                questionAttempt++;
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDatatoviews(currentpos);
            }
        });

    }
    private void showscore(){
        BottomSheetDialog bottomSheetDialog= new BottomSheetDialog(javaquiz.this);
        View bottomsheetview= LayoutInflater.from(getApplicationContext()).inflate(R.layout.displayscore,(LinearLayout)findViewById(R.id.llscore));
        TextView score=bottomsheetview.findViewById(R.id.score);
        Button restart=bottomsheetview.findViewById(R.id.restartbtn);
        Button showans=bottomsheetview.findViewById(R.id.showans);

        score.setText("Score is \n"+currentscore+"/20");
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentpos=random.nextInt(quizmodelArrayList.size());
                setDatatoviews(currentpos);
                questionAttempt=1;
                currentscore=0;
                bottomSheetDialog.dismiss();
            }
        });
        showans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),answers.class);
                startActivity(intent);
            }
        });
        Button gotodashboard=bottomsheetview.findViewById(R.id.gotodashboard);
        gotodashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
        bottomSheetDialog.setCancelable(false);
        bottomSheetDialog.setContentView(bottomsheetview);
        bottomSheetDialog.show();
    }



    private void setDatatoviews(int currentpos){
        questionno.setText("Questions Attempted "+questionAttempt+"/20");
        if(questionAttempt==20)
            showscore();
        else{
            question.setText(quizmodelArrayList.get(currentpos).getQuestion());
            option1.setText(quizmodelArrayList.get(currentpos).getOption1());
            option2.setText(quizmodelArrayList.get(currentpos).getOption2());
            option3.setText(quizmodelArrayList.get(currentpos).getOption3());
            option4.setText(quizmodelArrayList.get(currentpos).getOption4());

        }
    }

    private void getQuizQuestion(ArrayList<quizmodel> quizmodelArrayList) {
        quizmodelArrayList.add(new quizmodel("Number of primitive data types in Java are?", "6", "8","5","7","8"));
        quizmodelArrayList.add(new quizmodel("Find the output of the following code.\n" +
                "\n" +
                "int Integer = 24;\n" +
                "char String  = ‘I’;\n" +
                "System.out.print(Integer);\n" +
                "System.out.print(String);", "Compile Time Error", "Throws Exception","24","24 I","24 I"));
        quizmodelArrayList.add(new quizmodel("When an array is passed to a method, what does the method receive?", "reference of array", "copy of the array","length of the array","copy of first element","reference of array"));
        quizmodelArrayList.add(new quizmodel("\n" +
                "Identify the corrected definition of a package", "Collection of editing tools", "Collection of classes","Collection of clasess and interfaces","Collection of objects","Collection of clasess and interfaces"));
        quizmodelArrayList.add(new quizmodel("Which one of the following is not a Java feature?", "Object-oriented", "Use of pointers","Portable","Dynamic and Extensible","Use of pointers"));
        quizmodelArrayList.add(new quizmodel("What is the extension of java code files?", ".js", ".txt",".class",".java",".java"));
        quizmodelArrayList.add(new quizmodel("Which of the following is a type of polymorphism in Java Programming?", "Multiple polymorphism", "Compile time polymorphism","Execution time polymorphism","Multilevel polymorphism","Compile time polymorphism"));
        quizmodelArrayList.add(new quizmodel("Which exception is thrown when java is out of memory?", "MemoryError", "OutOfMemoryError","MemoryOutOfBoundsException","MemoryFullException","OutOfMemoryError"));
        quizmodelArrayList.add(new quizmodel("Which of these are selection statements in Java?", "break", "continue","if()","for()","if()"));
        quizmodelArrayList.add(new quizmodel("Which one of the following is not an access modifier?", "Protected", "Void","Private","Public","Void"));

        quizmodelArrayList.add(new quizmodel(" \n" +
                "Excepted created by try block is caught in which block.", "catch", "throw","final","none","catch"));
        quizmodelArrayList.add(new quizmodel(" _____ is used to find and fix bugs in the Java programs.", "JVM", "JRE","JDK","JDB","JDB"));
        quizmodelArrayList.add(new quizmodel("Which of the following is an immediate subclass of the Panel class?", "Applet class", "Window class","Frame class","Dialog class","Applet class"));
        quizmodelArrayList.add(new quizmodel("Which option is false about the final keyword?", "A final method cannot be overridden in its subclasses.", "A final class cannot be extended.","A final class cannot extend other classes.","A final method can be inherited.","A final class cannot extend other classes."));
        quizmodelArrayList.add(new quizmodel("Which keyword is used for accessing the features of a package?", "package", "import","extends","export","import"));
        quizmodelArrayList.add(new quizmodel("In java, jar stands for_____.", "Java Archive Runner", "Java Application Resource","Java Application Runner","none","none"));

        quizmodelArrayList.add(new quizmodel("Which statement about a valid .java file is true?", "It can only contain one class declaration.", " It can contain one pulic class declaration and one public interface definition.","It must define at least one public class.","It may define at most one public class.","It may define at most one public class."));
        quizmodelArrayList.add(new quizmodel("Which of the following declarations does not compile?", "double num1, int num2 = 0;", "int num1, num2;","int num1, num2 = 0;","int num1 = 0, num2 = 0;","double num1, int num2 = 0;"));
        quizmodelArrayList.add(new quizmodel("What is true of the finalize() method?", "It may be called zero or one times.", "It may be called zero or more times.","It will be called exactly once.","It may be called one or more times.","It may be called zero or one times."));
        quizmodelArrayList.add(new quizmodel("In java, jar stands for_____.", "Java Archive Runner", "Java Application Resource","Java Application Runner","none","none"));







    }
}