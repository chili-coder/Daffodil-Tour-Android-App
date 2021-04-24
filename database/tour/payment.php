<?php

//require "connection.php";


if ($_SERVER['REQUEST_METHOD'] =='POST'){

 
    $studentid = $_POST['studentid'];
    $amount = $_POST['amount'];
    $bkash = $_POST['bkash'];
    $texid = $_POST['texid'];
    $drivelink = $_POST['drivelink'];

  //  $password = password_hash($password, PASSWORD_DEFAULT);

    require_once 'connection.php';

    $sql = "INSERT INTO payment (studentid, amount, bkash, texid, drivelink) VALUES ( '$studentid', '$amount', '$bkash','$texid','$deivelink')";

    if ( mysqli_query($conn, $sql) ) {
        $result["success"] = "1";
        $result["message"] = "success";

        echo json_encode($result);
        mysqli_close($conn);

    } else {

        $result["success"] = "0";
        $result["message"] = "error";

        echo json_encode($result);
        mysqli_close($conn);
    }
}

?>