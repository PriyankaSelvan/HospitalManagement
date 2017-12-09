<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>

      <h2>Student Information</h2>
      <form:form method = "POST" action = "/MVCSpring/accountantGenerateBillPost">
         <table>
           
            <tr>
               <td><form:label path = "patient_id">patient_id</form:label></td>
               <td><form:input path = "patient_id" /></td>
            </tr>
            <tr>
               <td><form:label path = "bill_id">bil_id</form:label></td>
               <td><form:input path = "bill_id" /></td>
            </tr>
            <tr>
               <td><form:label path = "prescription_id">prescription_id</form:label></td>
               <td><form:input path = "prescription_id" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
</html>