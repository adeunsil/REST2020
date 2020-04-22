<!DOCTYPE html>

<html lang="en">
<head>
	<title>RESTFUL JAVA CRUD PERPUSTKAAN</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<link rel="stylesheet" type="text/css" href="styles/mobile.css">
	<link href="https://fonts.googleapis.com/css?family=Yeseva+One" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Crimson+Text" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="js/text.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>

<body>

<div id="header">
	<div id="banner">
		<img src="images/" alt="">
		
		<!-- Found at http://www.keyword-suggestions.com/YXV0dW1uIGdyYXBoaWNz/> -->
	</div><!-- end of banner div -->
	
	<div id="nav_bar">
		<span class="nav_span clicked"><h1>RESTFUL JAVA CRUD PERPUSTKAAN</h1> </span>
		
	</div><!-- end of nav_bar div -->
</div><!-- end of header div -->

<div id="container">

<div id="content">
	<div id="Main">

	<div id="juggling">
		<img src="images/back.png" id="jugglingpic" alt="juggling">
		<!-- Found at http://www.zap-ed-news.com/wp-content/uploads/2014/10/52e7ef4ba09c1.jpg -->
	</div><!-- end of juggling div -->
	
	<table>
		<tr>
			<th><a href="listbuku.php"><img src="images/buku.jpg" alt="buku" id="1"></a></th>
			<th><a href="jenisbuku.php"><img src="images/jenisbuku.jpg" alt="jenisbuku" id="2"></a></th>
			<th><a href="penulis.php"><img src="images/penulis.jpg" alt="penulis" id="3"></a></th>
			<th><a href="peminjaman.php"><img src="images/peminjaman.jpg" alt="peminjaman" id="4"></a></th>
			
		</tr>
		<tr>
			<th>list buku</th>
			<th>jenis buku</th>
			<th>penulis</th>
			<th>peminjman</th>
		</tr>
	</table>
	</div><!-- end of Main div -->
</div><!-- end of content div -->

</div><!-- end of container div -->

<?php
	include 'includes/footer.php';
?>

</body>
</html>