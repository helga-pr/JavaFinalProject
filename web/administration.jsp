<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="../css/bootstrap.css" rel="stylesheet">
<style> <%@include file="../css/bootstrap.css" %> </style>

<style>
   [class*="col-"] {
    background-color: #eee;
    border-right: 2px solid #fff;
    text-align: center;
    padding-top: 15px;
    padding-bottom: 15px;
    font-size: 2rem;
   }
  </style>
<title>Торговый Дом &quotКрикова&quot</title>

</head>
<body>
    <div class="container-fluid">
        <div class="row">
            <div class="col-xs-12">
                <h3>Welcome</h3>
                <hr/>
            </div>

               <div class="row">
                   <div class="col-xs-4">${user}, hello!


                   </div>

                   <div class="col-xs-7">
                       <hr/>
                       <form name="administrationForm" method="POST" action="controller">
                           <input type="hidden" name="command" value="logout" />
                           <input type="submit" value="Log out"/>


                       </form>
                   </div>
               </div>



            <div class="col-xs-12">
                <h4> Контакты </h4>
            </div>
                    <script type="text/javascript" src="../js/jquery-ui.js"></script>
                    <script type="text/javascript" src="../js/bootstrap.js"></script>
        </div>
    </div>
</body>
</html>