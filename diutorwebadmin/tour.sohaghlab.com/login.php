


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link type="text/css" href="css/style.css" rel="stylesheet">
    <link type="text/css" href="css/from.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
   

</head>
<body>
   
    <div class="container-fluid">
        <div class="row no-gutter">
          <div class="d-none d-md-flex col-md-4 col-lg-6 bg-image">
              <div class="text-image">
                <h2 class=" mb-4">DIU TOUR  </h2>
                 <div class="img_subtitle">
                <p>Daffodil International University student tour system</p>
                
            </div>
           
              </div>
           
          </div>
          <div class="col-md-8 col-lg-6">
            <div class="login d-flex align-items-center py-5">
              <div class="container">
             
                <div class="row">
                  <div class="col-md-9 col-lg-8 mx-auto">
                  
                    <h3 class="login-heading mb-4">Welcome back to Admin Login!</h3>
                   
                   
                    <form method="POST" action="">
                    
                          
                         <input type="text" name="username" value="" placeholder="User Name" class="form-control mb-2">
                      
                  
      
                     
                          <input type="text" name="password" value="" placeholder="Password" class="form-control mb-2">
                           
                       
                        
                  
      
                      <div class="custom-control custom-checkbox mb-3">
                        <input type="checkbox" class="custom-control-input " id="customCheck1">
                        <label class="custom-control-label" for="customCheck1">Remember password</label>
                      </div>
                      <button name="submit" class="btn btn-lg  btn-success btn-block btn-login text-uppercase font-weight-bold mb-2" type="submit">Login</button>
                      <div class="text-center">
                       <p>Only For Management Login </p>
                      
                    </form>
                    
                    <?php

include("connection.php");
error_reporting(0);

if(isset($_POST['submit'])){
 $username=$_POST['username'];
  $password=$_POST['password'];

  $query=mysqli_query($conn,"select *from adminuser where username='$username' AND password='$password' ");

  if($query){
      if(mysqli_num_rows($query)>0){

        echo "Login Successful";

        $_SESSION['username']=$username;

        header('location: index.php');
        echo "heelo";



      } else{
          echo "<script> alert('Invalid username and password!, please try again')</script>";
          header('location:login.php');
      }
  }
}



?>
                  </div>
                </div>
              


              </div>
            </div>
          </div>
        </div>
      </div>
      

  <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>




