
		
<?php

$conn=mysqli_connect("localhost","sohaghlab_lab","YcYo~iF2PVTF");
mysqli_select_db($conn,"sohaghlab_tour");

$email = $_POST["email"];
		$password = $_POST["password"];

		$sql = "SELECT * FROM register WHERE  email = '$email' AND password = '$password'";
		$result = mysqli_query($conn,$sql);
		
		if($result->num_rows > 0){
			echo "successfully" ;
		}else{
  
  			 echo "user not found";
		}
  			 
?>
