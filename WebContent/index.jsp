<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="p"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fieldset style="width: 400px">
		<legend>Inscription</legend>
		<form action="addContactServlet">
			<table>
				<tr>
					<td>Nom : <p:civilite /></td>
					<td><input type="text" name="nom" /></td>
				</tr>
				<tr>
					<td>Prénom :</td>
					<td><input type="text" name="prenom" /></td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="OK" /></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<br />
	<fieldset style="width: 400px">
		<legend>Entrez un code postal</legend>
		<form action="VillesServlet">
			CP : <input type="text" name="cp" /><input type="submit" value="OK" />
		</form>
	</fieldset>

</body>
</html>