<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link href="css/bootstrap.css" rel="stylesheet">
<link rel="stylesheet" href="style.css" type="text/css" media = "screen"/>
<style> <%@include file="css/style.css" %> </style>

<title>Торговый Дом &quotКрикова&quot</title>
</head>
	<body>
            <div class = "conteiner">
            <div class = "conteinerCenter">
                <form action="/Controller">

                    <h3>
                       Для работы с системой войдите в свой аккаунт
                    </h3>
                <jsp:forward page="/web/index.jsp"/>

            </div>
            </div>

                </form>

        <script type="text/javascript" src="js/jquery-ui.js"></script>
		<script src="js/bootstrap.js"></script>
	</body>
</html>