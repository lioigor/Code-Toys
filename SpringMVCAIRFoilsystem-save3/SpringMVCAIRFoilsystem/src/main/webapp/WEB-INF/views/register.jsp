<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Log In</title>

<style type="text/css">
   .block1 { 
    width: 500px; 
    background: #f2f2f2;
    padding: 5px;
    padding-right: 20px; 
    border: solid 1px #c2c2c2; 
     top: 40px; 
    left: -70px; 
   }
  </style> 


<link href="<c:url value="/css/style3.css" />" rel="stylesheet" type="text/css" />

<link href="<c:url value="/css/reset.css" />" rel="stylesheet" type="text/css" />
<link href="<c:url value="/css/style2.css" />" rel="stylesheet" type="text/css" />
<link href="<c:url value="/css/layout.css" />" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<c:url value="/js/jquery-1.6.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/cufon-yui.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/cufon-replace.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/Didact_Gothic_400.font.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/Shanti_400.font.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/roundabout.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/roundabout_shapes.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/jquery.easing.1.2.js"/>" ></script>
<script type="text/javascript" src="<c:url value="/js/script.js"/>" ></script>

	<link rel="icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
	<link rel="shortcut icon" href="http://vladmaxi.net/favicon.ico" type="image/x-icon">
	
	
</head>

<body>

	
	
<body id="page5">
<div class="body1">
	<div class="main">

	<header>
			<div class="wrapper">
				<nav>
					<ul id="top_nav">
						<li><a href="${pageContext.request.contextPath}/support">Support</a></li>
						<li><a href="${pageContext.request.contextPath}/login">Log In</a></li>
						<li class="end"><a href="${pageContext.request.contextPath}/register">Sign Up</a></li>
					</ul>
				</nav>
				<span class="date">Monday, June 6, 2011  &nbsp; &nbsp; 17:19</span>
			</div>
			<div class="wrapper">
				<h1><a href="${pageContext.request.contextPath}/home" id="logo">Air Foil</a></h1>
				<nav>
					<ul id="menu">
						<li id="menu_active"><a href="${pageContext.request.contextPath}/register"><span><span>Sign Up</span></span></a></li>
						
						<li> <a href="${pageContext.request.contextPath}/home"><span><span>Home</span></span></a></li>
						<li><a href="${pageContext.request.contextPath}/features"><span><span>Features</span></span></a></li>
						<li class="nav3"><a href="${pageContext.request.contextPath}/support"><span><span>Support</span></span></a></li>
						<li class="nav4"><a href="${pageContext.request.contextPath}/downloads"><span><span>Downloads</span></span></a></li>
						<li class="nav5"><a href="${pageContext.request.contextPath}/contacts"><span><span>Contacts</span></span></a></li>
					</ul>
				</nav>
			</div>
		
		</header>
		
		<article id="content">
			<section class="col1">
				
			</section>
			<section class="col2">
				<h2 class="pad_bot1">Sign Up</h2>
			<form id="register">
		<div class="block1">	
    <br>
    <fieldset id="inputs">
        <input id="username" type="text" placeholder="login" autofocus required>  
        <br> 
        <input id="password" type="password" placeholder="password" required>
    </fieldset>
    <fieldset id="actions">
        <input type="submit" id="submit" value="Sign Up">
        <a href="">Forgot password?</a><a href="${pageContext.request.contextPath}/register">Sign Up</a>
    </fieldset>
    	</div>
</form>
       		</section>
		</article>
	</div>
</div>

<div class="body2">
	<div class="main">
		<article id="content2">
			<section class="col1">
				<h3>Newsletter</h3>
				<form id="newsletter">
					<div>
						<div class="bg">
							<input class="input" type="text" value="Type Your Email Here"  onblur="if(this.value=='') this.value='Type Your Email Here'" onFocus="if(this.value =='Type Your Email Here' ) this.value=''">
						</div>
						<a href="#" class="button" onClick="document.getElementById('ContactForm').submit()">Subscribe</a>
					</div>
				</form>
       		</section>
			<section class="col_1">
				<h3>Why Us?</h3>
				<ul class="list1">
					<li><a href="#">Sed ut perspiciatis</a></li>
					<li><a href="#">Unde oiste natus erturor</a></li>
					<li><a href="#">Sit voluptatem accusa</a></li>
				</ul>
       		</section>
			<section class="col_2">
				<h3>Follow Us</h3>
				<ul id="icons">
					<li><a href="#"><img src="images/icon1.jpg" alt="">Facebook</a></li>
					<li><a href="#"><img src="images/icon2.jpg" alt="">Twitter</a></li>
					<li><a href="#"><img src="images/icon3.jpg" alt="">LinkedIn</a></li>
				</ul>
       		</section>
			<section class="col_1">
				<h3>Address</h3>
				<p class="address">
					<span>
						Country:<br>
						City:<br>
						Email:
					</span>
					Ukraine<br>
					Kyiv<br>
					<a href="mailto:">lioigor22@gmail.com</a>
				</p>
       		</section>
		</article>
	</div>
</div>
<div class="main">
<!-- footer -->
	<footer>
		<colspan="3" align="center" valign="middle" bgcolor="#000000"><span class="text2">Copyright &copy; Igor Likarenko<br>
		</article>
<!-- / content -->
	</div>
</div>
<script type="text/javascript"> Cufon.now();</script>
</body>
</html>