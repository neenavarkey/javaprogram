<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
--> 
<html>
    <head>
        <title>JSP page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <br><br><br>
     <center>
         <form action="login.jsp" >  
           
              USER NAME:<input type="user name" required="true" pattern=".{5,}" title="five characters"><br><br
              PASSWORD:<input type="password" required="true " pattern=".{5,10}" title="ten characters"><br><br>
              MOBILE NO:<input type="mobile no" required="true" pattern="[0-9]{10}" title="ten digits"><br><br>
            <input type="submit" value="REGISTER">
         </form>>
     </center>
   </body>
</html>
