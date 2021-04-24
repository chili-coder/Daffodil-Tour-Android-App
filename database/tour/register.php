<?php

//require "connection.php";


if ($_SERVER['REQUEST_METHOD'] =='POST'){

    $name = $_POST['name'];
    $studentid = $_POST['studentid'];
    $email = $_POST['email'];
    $pass = $_POST['pass'];

  //  $password = password_hash($password, PASSWORD_DEFAULT);

    require_once 'connection.php';

    $sql = "INSERT INTO register (name, studentid, email, password) VALUES ('$name', '$studentid', '$email', '$pass')";

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
    
