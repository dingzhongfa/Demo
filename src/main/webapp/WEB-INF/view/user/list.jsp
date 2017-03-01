<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
      <script type="text/javascript">
		  function selectAll(){
			  $.post("/user/listAll",function(data){

				  for(var i=0 ; i< data.length; i++){
					  var user = data[i];
					  var tr = "<tr id='"+user.id+"'><td>"+user.id+"</td><td>"+user.userName+"</td><td>"+user.age+"</td><td><button onclick ='editUser("+user.id+",\""+user.userName+"\","+user.age+")'>编辑</button></td><td><button onclick ='deleteUser("+user.id+")'>删除</button></td></tr>";
					  $("#userList").append(tr);
				  }
			  });
		  }
          function editUser(id,userName,age) {
			  $("#id").val(id);
			  $("#userName").val(userName);
			  $("#age").val(age);
              var oDiv = document.getElementById('div1');
              oDiv.style.cssText = 'position:absolute; top:200px; left:500px; width:50%; height:50%; z-index:10; background:#ccc; display:block;';
          }
          function deleteUser(id) {
//              alert(id);
              var isConfirm=window.confirm("确认删除吗？");
              if(isConfirm){
                  $.post("/user/delete",{id:id},function () {
					  $("#"+id).remove();
				  });
              }
          }
          function hideDiv(){
			  $("#div1").hide();
		  }
	  </script>

  </head>

  
  <body>
  <button onclick="selectAll()">查询所有用户</button>
  <a href="/user/addView">添加用户</a>

  <div id="div1" style="display:none;">
     <form action="/user/edit" method="post"  name="select">
		 <table width="100%" border="0" cellpadding="0" cellspacing="0" class="tx" align="center">
			 <colgroup>
				 <col width="20%" align="right">
				 <col width="*%" align="left">
			 </colgroup>
			 <tr>
				 <td bgcolor="a0c0c0" style="padding-left:10px;" colspan="2" align="left">
					 <b>修改信息</b>
				 </td>
			 </tr>
			 <tr>
				 <td>
					 用户id：
				 </td>
				 <td>
					 <input type="text" id="id" name="id" readonly>
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
				 <td colspan="2" align="center" style="padding-top:10px;">
					 <input class="tx" style="width:120px;margin-right:30px;" type="button" onclick="document.forms[0].submit();" value="确定">
					 <button class="tx" style="width:120px;margin-right:30px;"  >取消</button>
				 </td>
			 </tr>
			 </table>
	 </form>
  </div>

     <h3>welcome,${sessionScope.user.userName}</h3>
   	<table id="userList" style="border:1px black solid;">
   		<tr>
   			<td>ID</td><td>用户名</td><td>年龄</td><td colspan="2">操作</td>
   		</tr>
   		<%--<c:forEach items="${data.users}" var="user">
   			<tr>
   				<td>${user.name}</td><td>${user.password}</td><td>${user.age}</td>
   				<td><a href="#">编辑</a><a href="#">删除</a></td>
   			</tr>
   		</c:forEach>--%>
   	</table>
  </body>
</html>
