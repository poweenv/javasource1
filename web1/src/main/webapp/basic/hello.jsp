<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	// 자바 코드 작성하기
	//HttpServletRequest request: 사용자의 요청 가져오기
	//post 방식의 데이터를 가져올때 한글은 깨짐(get는 안깨짐)
	//http://localhost:8080/web1/basic/hello.html
	
	//http://localhost:8080 : 도메인명
	 // localhost ==127.0.0.1== 내컴퓨터
	 // 8080 포트번호==> 변경가능
	 
	 // /web1 : 프로젝트명
	 // /basic : webapp 폴더 아래에 생성한 폴더
	 //한글을 깨지지 않도록 데이터 가져오기 전에 제일 먼저 해줌
request.setCharacterEncoding("utf-8");
%>
<h3>이름</h3>
<%=request.getParameter("name") %>
<%=request.getParameter("age") %>
</body>
</html>