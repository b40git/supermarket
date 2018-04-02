package com.mmorshed

class Teamleader {

String fullName

String department

String employeeID

String sectionName

int officePhone

String leaderEmail

String password

Employee employee

Team team

Boolean validatingPassword(){
if (password.length() > 6)
return true;

}

    static constraints = {
	fullName blank:false, nullable:false
	department blank:false, nullable:false
	employeeID blank:false, nullable:false
	sectionName blank:false, nullable:false
	officePhone blank:false, nullable:false
	leaderEmail blank:false, nullable:false, email:true
	password blank:false, nullable:false
    }
}
