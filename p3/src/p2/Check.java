package p2;

public class Check {
String username;
String password;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public boolean checkLogin()
{
	if(username.equals("NIIT")&& password.equals("1234"))
	return true;
	else
		return false;
	
}
}
