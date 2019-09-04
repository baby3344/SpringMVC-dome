<%@page language="java" contentType="text/html;charset=UTF-8"  pageEncoding="UTF-8" %>
<! DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
 "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
      <title>Insert title here</title>
  </head>
<body>
<h1>hello,SpringMVC!</h1>

<h1>username{kry:string}-->${string}</h1>
<h1>username(key:username)-->${username}</h1>

<h1>username{key:currentUser}-->${currentUser.userName}</h1>
<h1>username{key:user}-->${user.userName}</h1>

<h2>学框架就学Spring MVC！</h2>
<form method="post" action="welcome4">
    <p>请输入userCode:<input type="text" name="name"/></p>
    <p>密码：:<input type="password" name="password"/></p></p>
    <input type="submit" value="提交">
</form>

</body>
</html>