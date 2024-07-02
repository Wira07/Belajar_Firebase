package com.example.projectjava;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class javainterview extends AppCompatActivity  {
TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_javainterview);
        tv1 = findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);
        tv5=findViewById(R.id.tv5);
        tv6=findViewById(R.id.tv6);
        tv7=findViewById(R.id.tv7);
        tv8=findViewById(R.id.tv8);
        tv9=findViewById(R.id.tv9);
        tv10=findViewById(R.id.tv10);

        tv11=findViewById(R.id.tv11);
        tv12=findViewById(R.id.tv12);
        tv13=findViewById(R.id.tv13);
        tv14=findViewById(R.id.tv14);
        tv15=findViewById(R.id.tv15);

        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert11();
            }
        });
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert12();
            }
        });
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert13();
            }
        });
        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert14();
            }
        });
        tv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert15();
            }
        });

        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert9();
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert8();
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert7();
            }
        });
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert10();
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert6();
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert5();
            }
        });


        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert4();
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert3();
            }
        });

        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert2();
            }
        });
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openalert1();
            }
        });
    }

    private void openalert13() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("In Java, constructor refers to a block of code which is used to initialize an object. It must have the same name as that of the class. Also, it has no return type and it is automatically called when an object is created.\n" +
                "\n" +
                "There are two types of constructors:\n" +
                "\n" +
                "Default Constructor: In Java, a default constructor is the one which does not take any inputs. In other words, default constructors are the no argument constructors which will be created by default in case you no other constructor is defined by the user. Its main purpose is to initialize the instance variables with the default values. Also, it is majorly used for object creation. \n" +
                "Parameterized Constructor: The parameterized constructor in Java, is the constructor which is capable of initializing the instance variables with the provided values. In other words, the constructors which take the arguments are called parameterized constructors.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert14() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("In Java, the super keyword is a reference variable that refers to an immediate parent class object.The uses of the Java super Keyword are- \n" +
                "\n" +
                "To refer to an immediate parent class instance variable, use super.\n" +
                "The keyword super can be used to call the method of an immediate parent class.\n" +
                "Super() can be used to call the constructor of the immediate parent class");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert12() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Wrapper classes convert the Java primitives into the reference types (objects). Every primitive data type has a class dedicated to it. These are known as wrapper classes because they “wrap” the primitive data type into an object of that class. Refer to the below image which displays different primitive type, wrapper class and constructor argument.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert15() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Packages in Java, are the collection of related classes and interfaces which are bundled together. By using packages, developers can easily modularize the code and optimize its reuse. Also, the code within the packages can be imported by other classes and reused. Below I have listed down a few of its advantages:\n" +
                "\n" +
                "Packages help in avoiding name clashes\n" +
                "They provide easier access control on the code\n" +
                "Packages can also contain hidden classes which are not visible to the outer classes and only used within the package\n" +
                "Creates a proper hierarchical structure which makes it easier to locate the related classes");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert11() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("public: Public is an access modifier, which is used to specify who can access this method. Public means that this Method will be accessible by any Class.\n" +
                "static: It is a keyword in java which identifies it is class-based. main() is made static in Java so that it can be accessed without creating the instance of a Class.void: It is the return type of the method. Void defines the method which will not return any value.\n" +
                "main: It is the name of the method which is searched by JVM as a starting point for an application");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert7() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Constructor overloading is the process of creating multiple constructors in the class consisting of the same name with a difference in the constructor parameters. Depending upon the number of parameters and their corresponding types, distinguishing of the different types of constructors is done by the compiler.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert8() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Copy Constructor is the constructor used when we want to initialize the value to the new object from the old object of the same class. ");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert9() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("In Java, the final keyword is used as defining something as constant /final and represents the non-access modifier.\n" +
                "\n" +
                "final variable:\n" +
                "When a variable is declared as final in Java, the value can’t be modified once it has been assigned.\n" +
                "If any value has not been assigned to that variable, then it can be assigned only by the constructor of the class");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert10() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Yes, It is possible to overload the main method. We can create as many overloaded main methods we want. However, JVM has a predefined calling method");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert6() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("JIT stands for Just-In-Time and it is used for improving the performance during run time. It does the task of compiling parts of byte code having similar functionality at the same time thereby reducing the amount of compilation time for the code to run.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert5() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("There are no default values assigned to the variables in java. We need to initialize the value before using it. Otherwise, it will throw a compilation error of (Variable might not be initialized). \n" +
                "But for instance, if we create the object, then the default value will be initialized by the default constructor depending on the data type. \n" +
                "If it is a reference, then it will be assigned to null. \n" +
                "If it is numeric, then it will assign to 0.\n" +
                "If it is a boolean, then it will be assigned to false. Etc.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert4() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Data Encapsulation is an Object-Oriented Programming concept of hiding the data attributes and their behaviours in a single unit.\n" +
                "It helps developers to follow modularity while developing software by ensuring that each object is independent of other objects by having its own methods, attributes, and functionalities.\n" +
                "It is used for the security of the private properties of an object and hence serves the purpose of data hiding.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    private void openalert3() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("C++ is only a  compiled language, whereas Java is compiled as well as an interpreted language.\n" +
                "Java programs are machine-independent whereas a c++ program can run only in the machine in which it is compiled. \n" +
                "C++ allows users to use pointers in the program. Whereas java doesn’t allow it. Java internally uses pointers. \n" +
                "C++ supports the concept of Multiple inheritances whereas Java doesn't support this. And it is due to avoiding the complexity of name ambiguity that causes the diamond problem");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }

    private void openalert2() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Easy: Java is a language that is considered easy to learn. One fundamental concept of OOP Java has a catch to understand.\n" +
                "\n" +
                "Secured Feature: Java has a secured feature that helps develop a virus-free and tamper-free system for the users.\n" +
                "\n" +
                "OOP: OOP stands for Object-Oriented Programming language. OOP signifies that, in Java, everything is considered an object.\n" +
                "\n" +
                "Independent Platform: Java is not compiled into a platform-specific machine; instead, it is compiled into platform-independent bytecode. This code is interpreted by the Virtual Machine on which the platform runs.");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void openalert1() {
        AlertDialog.Builder builder = new AlertDialog.Builder(javainterview.this);
        builder.setMessage("Java language was developed in such a way that it does not depend on any hardware or software due to the fact that the compiler compiles the code and then converts it to platform-independent byte code which can be run on multiple systems.\n" +
                "\n" +
                "The only condition to run that byte code is for the machine to have a runtime environment (JRE) installed in it");
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }






}