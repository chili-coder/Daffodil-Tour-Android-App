
<?php
require_once 'connection.php';

$email = $_POST['email'];
$name = $_POST['name'];
$studentid = $_POST['studentid'];
$phone = $_POST['phone'];
$batch = $_POST['batch'];
$dept = $_POST['dept'];
$sociallink = $_POST['sociallink'];
$oldemail=$_POST['myemail'];

$sql = "SELECT * FROM register WHERE email='$oldemail'";

$check = mysqli_query($conn,$sql);

if(mysqli_num_rows($check)>0){

    $result = "UPDATE register SET email='$email', name='$name', studentid='$studentid', phone='$phone', batch ='$batch' dept='$dept' sociallink='$sociallink' WHERE email='$oldemail' ";
    if(mysqli_query($conn,$result)){
        echo "Update Success";
    } else {
        echo "Error";
    }
}

?>

