<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Simple Calculator - result</title>
    <style type="text/css">
        span{
            display: inline-block;
            width: 200px;
            text-align: left;
        }
    </style>
</head>
<body>
<div align="center">
    <h2>Result</h2>
    <span>Result of addition:</span><span>${calculator.add()}</span><br/>
    <a href="/">Submit another calculation</a>
</div>

</body>
</html>