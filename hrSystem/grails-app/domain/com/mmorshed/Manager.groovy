package com.mmorshed

class Manager {

String fullName

String userName

String password

String managerEmail

String office

String deparment

    static constraints = {
	fullName blank:false, nullable:false
	userName blank:false, nullable:false, unique:true
	password blank:false, nullable:false
	managerEmail blank:false, nullable:false, email:true
	office blank:false, nullable:false
	department blank:false, nullable:false
	
    }
}
