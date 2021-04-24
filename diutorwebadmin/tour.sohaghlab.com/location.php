<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Location</title>

    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link type="text/css" href="css/style.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
    <link type="text/css" href="images/icons/css/font-awesome.css" rel="stylesheet">
</head>
<body>
<input type="checkbox" id="nav-toggle">

<!--------------manu start-------------->
    <div class="sidebar">

        <div class="sidebar-projectname">
            <h2><span   class="lab la-adn"> </span> <span>DIU TOUR</span> </h2>

        </div>

            <div class="sidebar-manu">

                <ul>
                   <li>
                       <a href="index.php" class=""><span class="las la-braille"></span> <span>Deshboard</span>  </a>
                    </li>
                    <li>
                        <a href="location.php" class="active"><span class="las la-map-marker"></span><span>Select Tour Location</span> </a>
                     </li>
                    <li>
                        <a href="blogpost.php" class=""><span class="las la-pen"></span><span>Blog Post</span> </a>
                     </li>
                     <li>
                        <a href="userprofile.php" ><span class="las la-user"></span> <span>Total User</span> </a>
                     </li>
                     <li>
                        <a href="tourregister.php"><span class="las la-plane-departure"></span><span>Tour Register</span> </a>
                     </li>
                     <li>
                        <a href="payment.php" class="#"><span class="las la-dollar-sign"></span><span>Payment</span> </a>
                     </li>
                     <li>
                        <a href="approved.php"><span class="las la-check-square"></span> <span>Approved for Tour</span></a>
                     </li>
                     <li>
                        <a href="management.php"><span class="las la-users-cog"></span> <span> Management</span></a>
                     </li>
                     
                     <li>
                        <a href="feedback.php" ><span class="las la-comment-dots"></span><span>User Feedback</span> </a>
                     </li>
                     <li>
                        <a href="login.php"><span class="las la-sign-out-alt"></span><span>Logout</span> </a>
                     </li>

                </ul>
            </div>
         
    </div>
    <!--------------manu end-------------->


     <!-----------------main hader start--------------->
    <div class="main-content">
        
        <header>
             <div class="header-title">
               <h2>
                <label for="nav-toggle">
                    <span class="las la-bars"> </span>
                </label>
                Location
               </h2>
             </div>

             <div class="user-admin">
               <h1> <i class="las la-user-circle"></i></h1>
              <div>
                <h4>Md Sohagh</h4>
                <small>admin</small>
            </div>
             </div>
           

        </header>
<!----------------------main header end ----------------->

<!-------------------main body start---------------->
<div>
        <main>
<!----------------card start--------------->
          
<!--Section: Contact v.2-->
<section class="mb-4">

    <!--Section heading-->
    <h2 class="h1-responsive font-weight-bold text-center my-4">Select Location</h2>
    <!--Section description-->
    <p class="text-center w-responsive mx-auto mb-5">Do you have any questions? Please do not hesitate to contact us directly. Our team will come back to you within
        a matter of hours to help you.</p>

    

        <!--Grid column-->
        <div class="col-md-9 mb-md-0 mb-5">
            <form id="contact-form" name="contact-form">

                <!--Grid row-->
               
                
            
                            <span class="input-group-btn">
                                <span class="btn btn-default btn-file">
                                    <input type="file" id="imgInp">
                                </span>
                            </span>
                   
                   

                    <!--Grid column-->
                   


                  
                    <!--Grid column-->

              
                <!--Grid row-->

                <!--Grid row-->
                
                    <div class="col-md-12">
                        <div class="md-form mb-0">
                                 <label for="subject" class="">Location Title</label>
                            <input type="text" id="subject" name="subject" class="form-control">
                       
                        </div>
                    </div>
               
                    <div class="col-md-12">
                        <div class="md-form mb-0">
                                 <label for="subject" class="">Sub Location</label>
                            <input type="text" id="subject" name="subject" class="form-control">
                       
                        </div>
                    </div>

                    <div class="col-md-12">
                        <div class="md-form mb-0">
                                 <label for="subject" class="">Tour-Day</label>
                            <input type="text" id="subject" name="subject" class="form-control">
                       
                        </div>
                    </div>
               


                <div class="col-md-12">
                    <div class="md-form mb-0">
                        <label for="subject" class="">Tour-Night</label>
                        <input type="text" id="subject" name="subject" class="form-control">
                       
                    </div>
                </div>

                <div class="col-md-12">
                    <div class="md-form mb-0">
                             <label for="subject" class="">Price</label>
                        <input type="text" id="subject" name="subject" class="form-control">
                   
                    </div>
                </div>

                <div class="col-md-12">
                    <div class="md-form mb-0">
                        <label for="subject" class="">Start Date</label>
                        <input type="date" id="subject" name="subject" class="form-control">
                        
                        
                    </div>
                </div>

                <div class="col-md-12">
                    <div class="md-form mb-0">
                        <label for="subject" class="">End Date</label>
                        <input type="date" id="subject" name="subject" class="form-control">
                        
                        
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="md-form mb-0">
                             <label for="subject" class="">Food at Morning</label>
                        <input type="text" id="subject" name="subject" class="form-control">
                   
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="md-form mb-0">
                             <label for="subject" class="">Food at Noon</label>
                        <input type="text" id="subject" name="subject" class="form-control">
                   
                    </div>
                </div>

                <div class="col-md-12">
                    <div class="md-form mb-0">
                             <label for="subject" class="">Food at Night</label>
                        <input type="text" id="subject" name="subject" class="form-control">
                        <label ></label>
                    </div>
                </div>

            </form>

            <div class="text-center text-md-center">
                <a class="btn btn-success " >Submit</a>
            </div>
            <div class="status">
                <a href="index.html" class="text-success"><label> View Locatoin</label></a>
            </div>
        </div>
        <!--Grid column-->

       

    

</section>



  <!-------------card end--------------->
        </main>
    </div>
<!---------------main body end--------------->
        
    
    </div>
<!-------------------Footer start---------------->
    <div class="footer-basic">
        <footer>
            <div class="social">
                <a href="#"><i class="lab la-facebook-f"></i></a>
                <a href="#"><i class="lab la-instagram"></i></a>
                <a href="#"><i class="lab la-twitter"></i></a>
                <a href="https://play.google.com/store/apps/developer?id=Sohagh+Lab"><i class="lab la-google-play"></i></a>
            </div>
            
            <p class="copyright">DIU TOUR SYSTEM ANDROID APPLICATION © 2021</p>
        </footer>
    </div>

    <!--------------Footer end--------------------->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
 
</body>
</html>