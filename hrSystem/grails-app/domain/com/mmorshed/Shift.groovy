package com.mmorshed

class Shift {

String timeOfDay

String dayOfWeek

int numberOfHours

String startingTime

Employee employee

static hasMany=[tasks:Task]

static belongsTo=[Task]

Boolean shiftControl(){
if (numberOfHours < 12)
return true;

}

    static constraints = {
	timeOfDay blank:false, nullable:false
	dayOfWeek blank:false, nullable:false
	numberOfHours blank:false, nullable:false
	startingTime blank:false, nullable:false

    }
}
