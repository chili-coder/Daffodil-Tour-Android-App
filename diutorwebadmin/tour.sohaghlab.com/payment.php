<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment</title>

    <link rel="stylesheet" href="https://maxst.icons8.com/vue-static/landings/line-awesome/line-awesome/1.3.0/css/line-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link type="text/css" href="css/style.css" rel="stylesheet">
    <link type="text/css" href="css/card.css" rel="stylesheet">
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
                        <a href="location.php" ><span class="las la-map-marker"></span><span>Select Tour Location</span> </a>
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
                        <a href="payment.php" class="active"><span class="las la-dollar-sign"></span><span>Payment</span> </a>
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
                Payment
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
          
<section class="mb-4">

    <!--Section heading-->
    <h2 class="h1-responsive font-weight-bold text-center my-4">Payment</h2>
    <!--Section description-->
    <p class="text-center w-responsive mx-auto mb-5">Do you have any questions? Please do not hesitate to contact us directly. Our team will come back to you within
        a matter of hours to help you.</p>

        </section>

        <section>
            <div class="search">
               <input type="text" class="searchTerm" placeholder="Search User">
               <button type="submit" class="searchButton">
                <i class="las la-search"></i>
              </button>
            </div>

        </section>



<div class="tb">

        <div class="table-responsive">

            <table class="table table-striped table-success">
                <thead>
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col">Name</th>
                    <th scope="col">ID</th>
                    <th scope="col">Amount</th>
                    <th scope="col">Tx Id</th>
                    <th scope="col">Screenshort</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <th scope="row">1</th>
                    <td>Sohagh</td>
                    <td>181-35-2429</td>
                    <td>4500 tk</td>
                    <td>cFnk30bfThbc</td>
                    <td>pay.png</td>
                  </tr>

                  <tr>
                    <th scope="row">1</th>
                    <td>Anik</td>
                    <td>182-35-2539</td>
                    <td>4500 tk</td>
                    <td>Derc30bfThbc</td>
                  </tr>

                  <tr>
                    <th scope="row">1</th>
                    <td>Sohagh</td>
                    <td>181-35-2429</td>
                    <td>4500 tk</td>
                    <td>cFnk30bfThbc</td>
                    <td>pay.png</td>
                  </tr>

                  <tr>
                    <th scope="row">1</th>
                    <td>Sohagh</td>
                    <td>181-35-2429</td>
                    <td>4500 tk</td>
                    <td>cFnk30bfThbc</td>
                    <td>pay.png</td>
                  </tr>
                  
                </tbody>
              </table>

          </div>

        </div>
        <div class="nav-bottom">
            <nav aria-label="...">
                <ul class="pagination">
                  <li class="page-item disabled">
                    <a class="page-link" href="#" tabindex="-1">Previous</a>
                  </li>
                  <li class="page-item"><a class="page-link" href="#">1</a></li>
                  <li class="page-item active ">
                    <a class="page-link" href="#">2 <span class="sr-only">(current)</span></a>
                  </li>
                  <li class="page-item"><a class="page-link" href="#">3</a></li>
                  <li class="page-item"><a class="page-link" href="#">4</a></li>
                  <li class="page-item"><a class="page-link" href="#">5</a></li>
                  <li class="page-item">
                    <a class="page-link" href="#">Next</a>
                  </li>
                </ul>
              </nav>
            
            </div>
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