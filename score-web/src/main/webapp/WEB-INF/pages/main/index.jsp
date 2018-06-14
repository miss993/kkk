<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Main</title>
<!-- 引入样式 -->
<link rel="stylesheet"
	href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">

</head>
<body>

	<center><b><h1>JAVA EE课程-------score项目</h1></b></center><hr/>
	<a href="/score-web/fenzu/fenzu/index.html">分组模块</a><p/>
	<a href="/score-web/assignments/assignments/index.html">平时作业模块</a><p/>
	<a href="/score-web/attendance/attendance/index.html">平时考勤模块</a><p/>
	<a href="/score-web/finalhomework/homework/index.html" >期末大作业模块</a><p/>
	<a href="/score-web/finalscore/finaltest/index.html">期末总成绩模块</a><p/>
					
	

</body>
<!-- import Vue before Element -->
<script src="https://unpkg.com/vue/dist/vue.js"></script>
<!-- import JavaScript -->
<script src="https://unpkg.com/element-ui/lib/index.js"></script>
<script>
	new Vue({
		el : '#app',
		data : function() {
			return {
				visible : false
			}
		}
	})
</script>
</html>