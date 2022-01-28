<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--author--Katha Roy--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>KRoy/online quiz/mcqTest</title>
        <style>
div{border: 1px solid black;
  margin: 20px 200px 75px;
  background-color: #a83455;
  color: white;}
div1{ margin:400px;}
h1{color:indigo;
  text-align:center;
  font-family: sans-serif;}
h3
{font-family: sans-serif;
  text-align: center;}
 </style>
 <%--author--Katha Roy--%>
</head>
    <body>
       <h1>ONLINE QUIZ / MCQ</h1>
        <h3>You are requested to answer ALL the questions,else the result WONT BE SHOWN.</h3>
        <div>
   <%--author--Katha Roy--%>
            <br><br><br> 
    <form method="get" action="quizserv">
    <label>1: Which of the following are unary operators? </label><br>
    <input type="radio" name="ans1" value="1a">a)sizeof<br>
    <input type="radio" name="ans1" value="1b">b)-<br>
    <input type="radio" name="ans1" value="1c">c)++<br>
    <input type="radio" name="ans1" value="1d">d)All of the above<br><br><br> 
    <label>2: Where in C the order of precedence of operators do not exist? </label><br>
    <input type="radio" name="ans2" value="2a">a)Within if,else if<br>
    <input type="radio" name="ans2" value="2b">b)Within while,do while<br>
    <input type="radio" name="ans2" value="2c">c)Within a macro definition<br>
    <input type="radio" name="ans2" value="2d">d)None of the above<br><br><br>
    <label>3: What will be the output of the Python expression "~100"? </label><br>
    <input type="radio" name="ans3" value="3a">a)101<br>
    <input type="radio" name="ans3" value="3b">b)-101<br>
    <input type="radio" name="ans3" value="3c">c)100<br>
    <input type="radio" name="ans3" value="3d">d)-100<br><br><br>
    <label>4: Which package is directly available to our class without importing it? </label><br>
    <input type="radio" name="ans4" value="4a">a)swing<br>
    <input type="radio" name="ans4" value="4b">b)applet<br>
    <input type="radio" name="ans4" value="4c">c)net<br>
    <input type="radio" name="ans4" value="4d">d)lang<br><br><br>
    <div1> <input type="submit"  value="Submit"/>
    <input type="reset"   value="Reset"/></div1>
    <br><br>
    <%--author--Katha Roy--%>
    </form>
    </div>
    </body>
    </html>
