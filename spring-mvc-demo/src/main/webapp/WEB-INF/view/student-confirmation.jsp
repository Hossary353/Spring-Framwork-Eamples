<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>Student Confirmation Page</head>

<body>
<br><br>
The Student Is Confirmed: ${student.firstName} ${student.lastName}


<br><br>

Country: ${student.country}

<br><br>
<br><br>
Favorite Language:${student.favoriteLanguage}
<br><br>
<br><br>
Operating systems:
<ul>

<c:forEach var="temp" items="${student.operatingSystems}" >
  <li>${temp}</li>
</c:forEach>

</ul>


</body>



















</html>