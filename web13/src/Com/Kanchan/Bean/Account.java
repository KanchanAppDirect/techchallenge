package Com.Kanchan.Bean;

public class Account {
String	accountIdentifier;
String status;
String parentAccountIdentifier;

public String getAccountIdentifier() {
	return accountIdentifier;
}

public void setAccountIdentifier(String accountIdentifier) {
	this.accountIdentifier = accountIdentifier;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

public String getParentAccountIdentifier() {
	return parentAccountIdentifier;
}

public void setParentAccountIdentifier(String parentAccountIdentifier) {
	this.parentAccountIdentifier = parentAccountIdentifier;
}
}
