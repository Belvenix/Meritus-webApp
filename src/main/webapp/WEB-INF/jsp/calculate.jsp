<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Simple Calculator - form</title>
    <style type="text/css">
        label{
            display: inline-block;
            width: 200px;
            margin: 5px;
            text-align: left;
        }
        form div div{
            display: table-cell;
        }

        .error {
            color: red;
            font-style: italic;
        }
    </style>
</head>
<body>
    <div align="center">
        <h2>Hi, welcome to simple calculator web application!</h2>
        <form:form action="#" method="post" modelAttribute="calculator">
            <div>
                <form:label path="first">Enter first number:</form:label>
                <form:input path="first"/>
                <form:errors path="first" cssClass="error"/>
            </div>
            <br/>
            <div>
                <form:label path="second">Enter second number:</form:label>
                <form:input path="second"/>
                <form:errors path="second" cssClass="error"/>
            </div>


            <form:button>Calculate</form:button>
        </form:form>
    </div>
</body>
</html>