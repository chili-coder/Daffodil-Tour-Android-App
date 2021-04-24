<?php




    
require_once 'connection.php';
 
    $email = $_POST['email'];
    $password = $_POST['password'];

   

    $sql = "SELECT * FROM register WHERE email='$email' AND password='$password'";

  
    $result = array();
    $result ['data']=array();
      $response = mysqli_query($conn, $sql);


 
    
    if ( mysqli_num_rows($response) === 1 ) {
        
        $row =mysqli_fetch_assoc($response);
         $ds['name']= $row['name'];
          $ds['email']= $row['email'];
           $ds['studentid']= $row['studentid'];
           
           array_push($result['data'],$ds);
           
    
        $result ['status']= 'success';
        echo json_encode($result);
        mysqli_close($conn);
       
        
    } else{
        
         $result ['status']= 'error';
        echo json_encode($result);
        mysqli_close($conn);
        
    }
         echo "success";
       

?>