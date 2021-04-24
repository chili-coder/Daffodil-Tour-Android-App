<?php

//require "connection.php";


if ($_SERVER['REQUEST_METHOD'] =='POST'){

    $name = $_POST['name'];
    $studentid = $_POST['studentid'];
    $dept = $_POST['dept'];
    $tshart = $_POST['tshart'];
      $date = $_POST['date'];

  //  $password = password_hash($password, PASSWORD_DEFAULT);

    require_once 'connection.php';

    $sql = "INSERT INTO regitour (name, studentid, dept, tshart,date) VALUES ('$name', '$studentid', '$dept', '$tshart','$date')";

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