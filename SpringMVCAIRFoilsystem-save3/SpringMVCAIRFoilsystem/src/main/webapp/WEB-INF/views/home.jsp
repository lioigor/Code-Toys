<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>AeroFoil main page</title>


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


<!--[if lt IE 9]>
	<script type="text/javascript" src="<c:url value="/js/html5.js"/>"></script>
	<style type="text/css">
		.bg {behavior:url(../../resources/js/PIE.htc)}
	</style>
<![endif]-->
<!--[if lt IE 7]>
	<div style=' clear: both; text-align:center; position: relative;'>
		<a href="http://www.microsoft.com/windows/internet-explorer/default.aspx?ocid=ie6_countdown_bannercode"><img src="http://www.theie6countdown.com/images/upgrade.jpg" border="0"  alt="" /></a>
	</div>
<![endif]-->

</head>
<%-- 	<jsp:include page="introduction.jsp" />	 --%>
	
	
<body id="page1">
<div class="body1">
	<div class="main">
<!-- header -->
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
						<li id="menu_active"><a href="${pageContext.request.contextPath}/home"><span><span>Home</span></span></a></li>
						
						<li><a href="${pageContext.request.contextPath}/features"><span><span>Features</span></span></a></li>
						<li class="nav3"><a href="${pageContext.request.contextPath}/support"><span><span>Support</span></span></a></li>
						<li class="nav4"><a href="${pageContext.request.contextPath}/downloads"><span><span>Downloads</span></span></a></li>
						<li class="nav5"><a href="${pageContext.request.contextPath}/contacts"><span><span>Contacts</span></span></a></li>
					</ul>
				</nav>
			</div>
			<div class="wrapper">
				<div class="text">
					<span class="tittle">Best<span>AIR Foil system</span></span>
					<p>Automated system for processing<span>the results of measurements</span><span>in wind tunnels.</span></p>
					<a href="#" class="button1">More Info</a>
				</div>
				<div id="gallery">
					<ul id="myRoundabout">
					
						<li><img src="<c:url value="/images/img1.png"/>" alt=""></li>
						<li><img src="<c:url value="/images/img2.png"/>" alt=""></li>
						<li><img src="<c:url value="/images/img3.png"/>" alt=""></li>
					</ul>
				</div>
			</div>
		</header><div class="ic">More <a href="http://www.templatemonster.com/">Website Templates</a> at TemplateMonster.com!</div>
<!-- content -->
		<article id="content">
			<section class="col1">
				<h2>News &amp; Events</h2>
				<div class="wrapper pad_bot2">
					<figure class="left marg_right1"><a href="#"><img src="<c:url value="/images/page1_img1.jpg"/>" alt=""></a></figure>
					<p class="pad_bot1 pad_top1"><span class="color1">Tue, June 7, 2011</span></p>
					<p>Nam libero tempore csoluta nobis eieligendi opto cumque nihil impedit quo.</p>
				</div>
				<div class="wrapper pad_bot2">
					<figure class="left marg_right1"><a href="#"><img src="<c:url value="/images/page1_img2.jpg"/>" alt=""></a></figure>
					<p class="pad_bot1 pad_top1"><span class="color1">Sun, June 5, 2011</span></p>
					<p>Minus quod maxime placeat facere possimus voluptas assumenda est omnis.</p>
				</div>
				<div class="wrapper">
					<figure class="left marg_right1"><a href="#"><img src="<c:url value="/images/page1_img3.jpg"/>" alt=""></a></figure>
					<p class="pad_bot1 pad_top1"><span class="color1">Thu, June 2, 2011</span></p>
					<p>Omnis dolor repellendus aut temporibus autem quibus- dam et aut officiis debitis.</p>
				</div>
       		</section>
			<section class="col2">
				<h2 class="pad_bot1">What We Offer</h2>
				<div class="wrapper">
					<figure class="left marg_right1"><img src="<c:url value="/images/page1_img4.jpg"/>" alt=""></figure>
					<p class="pad_top1 pad_bot1"><strong class="color1">This is one of <a href="http://blog.templatemonster.com/free-website-templates/" class="link1" target="_blank">free website templates</a> created by TemplateMonster.com</strong></p>
					<p class="pad_bot3">This Pro Soft template is optimized for 1024X768 screen resolution.It has several pages: <a href="${pageContext.request.contextPath}/home">Home Page</a>, <a href="${pageContext.request.contextPath}/features">Features</a>, <a href="${pageContext.request.contextPath}/support">Support</a>, <a href="${pageContext.request.contextPath}/downloads">Downloads</a>, <a href="${pageContext.request.contextPath}/contacts">Contacts</a> (note that contact us form – doesn’t work).</p>
					<a href="#" class="button right">Read More</a>
				</div>
				<h2 class="pad_bot1 pad_top1">Why Do You Need It?</h2>
				<div class="wrapper">
					<figure class="left marg_right1"><img src="<c:url value="/images/page1_img5.jpg"/>" alt=""></figure>
					<p class="pad_top1 pad_bot1"><strong class="color1">This <a href="http://blog.templatemonster.com/2011/06/20/free-website-template-jquery-carousel-header/" class="link1" target="_blank">Pro Soft Template</a> goes with two packages</strong></p>
					<p class="pad_bot3">With PSD source files and without them. PSD source files are available for free for the registered members of Templates.com. The basic package (without PSD source is available for anyone without registration).</p>
					<a href="#" class="button right">Read More</a>
				</div>
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
							<input class="input" type="text" value="Type Your Email Here"  onblur="if(this.value=='') this.value='Type Your Email Here'" onfocus="if(this.value =='Type Your Email Here' ) this.value=''">
						</div>
						<a href="#" class="button" onclick="document.getElementById('ContactForm').submit()">Subscribe</a>
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
				
					<li><a href="#"><img src="<c:url value="/images/icon1.jpg"/>" alt="">Facebook</a></li>
					<li><a href="#"><img src="<c:url value="/images/icon2.jpg"/>" alt="">Twitter</a></li>
					<li><a href="#"><img src="<c:url value="/images/icon3.jpg"/>" alt="">LinkedIn</a></li>
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
<!-- / content -->
	</div>
</div>
<div class="main">
<!-- footer -->
	<footer>
		<colspan="3" align="center" valign="middle" bgcolor="#000000"><span class="text2">Copyright &copy; Igor Likarenko<br>
		
		
		<!-- {%FOOTER_LINK} -->
	</footer>
<!-- / footer -->
</div>
<script type="text/javascript"> Cufon.now();</script>
<script type="text/javascript">
	$(document).ready(function() {
		$('#myRoundabout').roundabout({
			 shape: 'square',
        	 minScale: 0.89, // tiny!
        	 maxScale: 1, // tiny!
			 easing:'easeOutExpo',
			 clickToFocus:'true',
			 focusBearing:'0',
			 duration:800,
			 reflect:true
		});
	});
</script>
</body>
</html>
