<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<head>

<title>





</title>Student Registeration Form</title>






</head>


<body>

<form:form action="processForm" modelAttribute="student" >

First-name: <form:input path="firstName"/>

<br><br>

Last-Name: <form:input path="lastName"/>
<br><br>
Country:
<form:select path="country">
<form:options items="${student.countryOptions}"/>

<br><br>


</form:select>

<br><br>
<br><br>
Favorite Language:
Java<form:radiobutton path="favoriteLanguage" value="Java"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
Ruby<form:radiobutton path="favoriteLanguage" value="Ruby"/>
<br><br>
<br><br>
Operating Systems:
Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
Linux<form:checkbox path="operatingSystems" value="Linux"/>
Windows<form:checkbox path="operatingSystems" value="Windows"/>



<input type="submit" value="send"/>

</form:form>





</body>












</html>