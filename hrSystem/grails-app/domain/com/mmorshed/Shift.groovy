package com.mmorshed

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

Employee employee

static hasMany=[tasks:Task, teams:Team]

static belongsTo=[Task, Team]

String toString(){
return timeOfDay
}

Boolean shiftControl(){
if (numberOfHours < 12)
return true;

}

    static constraints = {
	timeOfDay blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false
	startingTime blank:false, nullable:false
	employee blank:false, nullable:false

    }
}
