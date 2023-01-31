# Java: Lambda Expression And Functional Interfaces

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

<h1></h1>
<h1 align="Center"> Returns a Constant Value</h1>
<u>
<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp1.java" > Example : Returns a Constant Value </a></li></h3>

```Syntax

Below is functional interface:

interface output{  
    float view();  
}

Returns a constant value :

output view=()->123.45f;

```

</u>


<h1></h1>
<h1 align="Center">Lambda Expression With Single Parameter</h1>
<u>

<h3><li><a href = "https://github.com/AvinandanBose/Java-LambdaExpression/blob/main/Lambdaexp2.java" > Example : Lambda Expression With Single Parameter </a></li></h3>

```Syntax

Below is functional interface:

interface output {
    int add(int a, int b);
}

Returns a constant value :

output view = (a) -> Math.random() * a;

```

</u>
