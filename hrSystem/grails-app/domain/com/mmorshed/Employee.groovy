package com.mmorshed

class Employee {

String fullName

Date dateOfBirth

String residence

float hourlyRate

String employeeID

Date dateEmployed

String taxCode

String contract

//unit testing - function to calculate an 8 hour salary
float calculateSalary(){

	8*hourlyRate
}


    static constraints = {
	fullName blank:false, nullable:false
	dateOfBirth blank:false, nullable:false
	residence blank:false, nullable:false
	hourlyRate blank:false, nullable:false, scale:2
	employeeID blank:false, nullable:false
	dateEmployed blank:false, nullable:false
	taxCode blank:false, nullable:false
	contract blank:false, nullable:false

    }
}
