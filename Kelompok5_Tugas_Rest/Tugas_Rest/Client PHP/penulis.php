<!DOCTYPE html>

<html lang="en">
<head>
	<title>LISTBUKU</title>
	<link rel="stylesheet" type="text/css" href="styles/styles.css">
	<link rel="stylesheet" type="text/css" href="styles/mobile.css">
	<link href="https://fonts.googleapis.com/css?family=Yeseva+One" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Crimson+Text" rel="stylesheet">
	<script src="js/pic.js"></script>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>

<div id="header">
	<div id="banner">
		<img src="images/" alt="">
		<h1>penulis</h1>
		<!-- Found at http://www.keyword-suggestions.com/YXV0dW1uIGdyYXBoaWNz/> -->
	</div><!-- end of banner div -->
	
	<div id="nav_bar">
		<span class="nav_span"><a href="index.php">Home</a></span>
		
	</div><!-- end of nav_bar div -->
</div><!-- end of header div -->

<div id="container">

<div id="content">
	<div id="Main">
	<?php
//tidak perlu jar file
$url ="http://localhost:8080/inglolibrary/faces/penulis/List.xhtml";
// lewatkan URL dari RESTful Java-nya
$client = curl_init($url);
curl_setopt($client,CURLOPT_RETURNTRANSFER,1);
//curl_setopt($client,CURLOPT_POST,$data);
$response = curl_exec($client);
//$result = json_decode($response);
if(!empty($response)) {
echo $response;
} else {
echo "No data found";
}
?>	

	<div id="gallery_container">
		-->
	</div><!--end of gallery_container div-->
	
	<div id="button_container">
       </div> <!--end of button_container div-->
		
	</div><!-- end of Main div -->
</div><!-- end of content div -->

</div><!-- end of container div -->

<?php
	include 'includes/footer.php';
?>

</body>
</html>
