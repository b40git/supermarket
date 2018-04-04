package com.mmorshed

class Team {

String teamName

int numberOfEmployees

String sectionName

String description

static hasOne=[teamleader:Teamleader]

static hasMany=[shifts:Shift, tasks:Task, employees:Employee]

String changingCase(){
return teamName.toLowerCase();

}

    static constraints = {
	teamName blank:false, nullable:false
	numberOfEmployees blank:false, nullable:false
	sectionName blank:false, nullable:false
	description blank:false, nullable:false, maxSize:5000, widget:'textarea'

    }
}
