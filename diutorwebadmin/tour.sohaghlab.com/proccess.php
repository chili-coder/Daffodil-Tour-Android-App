<?php
include("connection.php");

if(isset($_POST['psubmit']))

$title =$_POST['ptitle'];
$posts =$_POST['ppost'];
$location =$_POST['plocation'];
$date =$_POST['pdate'];
$image =$_POST['pimage'];




$sql ="INSERT INTO post (title,description,location,date,image)
VALUES ('$title','$posts','$location','$date','$image') ";



if(mysqli_query($conn,$sql)){
    echo "Dtata insert is successfully";
} else{
    echo "error!" . $sql ."<br>" .mysqli_error($con);
}
mysqli_close($conn);
  
?>