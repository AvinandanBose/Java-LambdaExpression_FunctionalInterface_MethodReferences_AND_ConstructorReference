# Java: Lambda Expression ,Functional Interfaces AND Method Reference

<h1></h1>
<h1 align="Center">1.  Lambda Expression </h1>
<h3>Lambda expression in Java was included in Java SE 8. A lambda expression is, essentially, an anonymous (that is, unnamed) method. However, this method is not executed on its own. Instead, it is used to implement a method defined by a functional interface. Thus, a lambda expression results in a form of anonymous class. Lambda expressions are also known as closures in some other languages.</h3>

<h3> <i> '->' </i> is known as lambda operator or the arrow operator.</h3>

<h3>It divides lamda expression into two parts.</h3>

<h3><i><ins>Left side of Lambda Expression</ins></i> : It contains Parameters.</h3>

<h3><i><ins>Right side of Lambda Expression</ins></i> : It is known as 'lambda body', which specifies the actions of the lambda expression.</h3>

<h3>The '->' can be verbalized as "becomes" or "goes to" .</h3>

<h3>There are two types of lamda bodies : 1) One consists of a single expression, and 2) And other type is block of code. </h3>

<h1></h1>
<h1 align="Center">2.  Functional Interfaces </h1>

<h3>A <i> functional interface</i> is an interface that contains one and only one abstract method .Normally this method specifies the intended purpose of the interface.
Thus, a functional interface typically represents a single action. </h3>

```Syntax

Syntax:

interface MyNumber{  
    double getValue();  
}

MyNumber view=()-> returns 123.45;

which actually resembles:

double myMeth(){

   return 123.45;
}

where ,
interface MyNumber{double getValue();}

:is Functional Interface:

:AND:

(parameter)-> return val; 

:is Lambda function and return single value only:
:But it doesnot have a Block and Body :

:A Lambda function with body and block looks like:

(parameter)->{ //Start of a block

   :Here we can write more than one statement :
   :And Execute Them Before Return:
   
    return val; --> Return Statement
    
} //End of a block

```

<h1></h1>
<h1 align="Center"> Returns a Constant Value</h1>
<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp1.java" > Example : Returns a Constant Value </a></li></h3>

```Syntax

Below is functional interface:

interface output{  
    float view();  
}

Returns a single value only:

output view=()->123.45f;

Returns a single value with executing :
Multiple Lines of Code: 

output view=()->{

 :Executes multiple lines of code inside block:
 
    returns 123.45f;

};

```

</ul>


<h1></h1>
<h1 align="Center">Lambda Expression With Single Parameter</h1>
<ul>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp2.java" > Example : Lambda Expression With Single Parameter </a></li></h3>

```Syntax

Below is functional interface With Single Parameter:

interface output {
    double getValue(double n);
}

Returns a single value only:

output view = (a) -> Math.random() * a;

Returns a single value with executing :
Multiple Lines of Code: 

output view=(a)->{

 :Executes multiple lines of code inside block:
 
    returns Math.random() * a;

};


```

</ul>

<h1></h1>
<h1 align="Center">Lambda Expression With Multiple Parameter</h1>
<ul>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp4.java" > Example : Lambda Expression With Multiple Parameter </a></li></h3>

```Syntax

Below is functional interface With Multiple Parameter:

interface output {
    int add(int a, int b);
}

Returns a constant value :

output view = (a, b) -> {

         :Block of code:
         
            return a+b;
        };
        

```

</ul>


<h1></h1>
<h1 align="Center">Passing Lambda Expression as Argument.</h1>
<ul>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp5.java" > Example : Passing Lambda Expression as Argument. </a></li></h3>

```Syntax

Below is functional interface With Multiple Parameter:

interface output {
    int add(int a, int b);
}

Passing Lambda Exp as argument:

static int Add(output a,int b, int c){
        return a.add( b,c) ;
    }

Returns a constant value :

int view = Add((a, b) -> {
            System.out.print(a +"+"+b + "=" );
            return a + b;
        },10,20);
        

```

</ul>

<h1></h1>
<h1 align="Center">Lambda Expressions and Exceptions</h1>
<ul>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpressionAndFunctionalInterfaces/blob/main/lambdaexp6.java" > Example : Lambda Expressions and Exceptions-1 </a></li></h3>

```Syntax

interface Number {
    int add(int a, int b)throws MyOwnException;
}

class MyOwnException extends Exception{
    public MyOwnException(String s){
        super(s);
    }
}

:Here MyOwnException is Custom UserDefined Exception:
:Which inherits Exception class(java.lang.Exception) :
:And delivers a Message Upon Exception occurs: 

:Exception Condition here is:

 if(a+b>10)
 
:And it is thrown inside Lambda function:

Number view = (a, b) -> {
            System.out.print(a +"+"+b + "=" );
            if(a+b>10){
                throw new MyOwnException("Exception Occured");
            }
            return a + b;
        };


```

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpressionAndFunctionalInterfaces/blob/main/lambdaexp7.java" > Example : Lambda Expressions and Exceptions-2 </a></li></h3>

```Syntax

:Same as Above:

:Here condition is:

if(n.length==0)

:And then it throws EmptyArrayException:
:Which is a Custom UserDefined Exception :
:As Above:


```

</ul>

<h1></h1>
<h1 align="Center">Lambda Expressions and Variable Capture</h1>

<ul>
<h3>When a lambda expression uses a local variable from its enclosing scope, a special situation is created that is referred to as a <i><ins>variable capture</ins></i>.In this case, a lambda expression may only use local variable that are <i><ins>effectively final</ins></i>. An <i><ins>effectively final</ins></i> variable is one whose value doesnot change after its first assigned. There is no need to explicitly declare such a variable as <i><ins>final</ins></i>, although doing so would not be an error. </h3>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpressionAndFunctionalInterfaces/blob/main/lambdaexp8.java" > Example : Lambda Expressions and Variable Capture </a></li></h3>

```Syntax

interface MyFunc{
    int func(int n);
}

public class lambdaexp8 {
    public static void main(String[] args){
        int num=10;

        MyFunc myLambda = (n) -> {
            int v = num + n;
            // num++; // Error → num is effectively final:
            return v;
        };
        // num = 9; // Error → num is effectively final:
        System.out.println( myLambda.func(10));
    }
}

```

</ul>

<h1></h1>
<h1 align="Center">3.  Method References </h1>
<ul>
<li><h3>1 . A method reference provides a way to refer a method without executing it.</h3></li>
<li><h3>2. A method reference relates to lambda expressions , since it, too requires a target type context of a compatible functional interface.</h3></li>
<li><h3>3. When evaluated, a method reference also creates an instance of the functional interface.</h3></li>
    
<h1></h1>
<h1 align="Center">Method References to static Methods</h1> 

<h3 align="Center">
    
```Syntax 
   
ClassName::methodName   
    
```

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression_FunctionalInterface_AND_MethodReferences/blob/main/MethodsReftoStatMeth1.java" > Example : Method References to static Methods </a></li></h3>

</h3>
    
</ul>

