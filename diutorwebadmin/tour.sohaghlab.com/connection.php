<?php
$servername="localhost";
$username="sohaghlab_lab";
$password="YcYo~iF2PVTF";
$dbname="sohaghlab_tour";




$conn = mysqli_connect($servername,$username,$password,$dbname);


if($conn){

}
else {
    die("Connection faild".mysqli_connect_error());
}



?>