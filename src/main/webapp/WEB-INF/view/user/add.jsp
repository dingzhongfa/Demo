<%--
  Created by IntelliJ IDEA.
  User: hzdzf
  Date: 2016/11/18
  Time: 16:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<form action="/user/insert" method="post"  name="select">
    <table width="100%" border="0" cellpadding="0" cellspacing="0" class="tx" align="center">
        <colgroup>
            <col width="20%" align="right">
            <col width="*%" align="left">
        </colgroup>
        <tr>
            <td bgcolor="a0c0c0" style="padding-left:10px;" colspan="2" align="left">
                <b>添加用户</b>
            </td>
        </tr>
        <tr>
            <td>
                用户id：
            </td>
            <td>
                <input type="text" id="id" name="id" >
            </td>
        </tr>
        <tr>
            <td>
                用户名：
            </td>
            <td>
                <input type="text" id="userName" name="userName">
            </td>
        </tr>
        <tr>
            <td>
                年龄：
            </td>
            <td>
                <input type="text" id="age" name="age" >
            </td>
        </tr>
        <tr>
            <td>
                密码：
            </td>
            <td>
                <input type="password" id="password" name="password" >
            </td>
        </tr>
        <tr>
            <td colspan="2" align="center" style="padding-top:10px;">
                <input class="tx" style="width:120px;margin-right:30px;" type="button" onclick="document.forms[0].submit();" value="确定">
                <button onclick="JavaScript:history.Go(-1)">返回上一步</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
