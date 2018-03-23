package com.mmorshed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ShiftSpec extends Specification implements DomainUnitTest<Shift> {

    def setup() {
    }

    def cleanup() {
    }

    void checkShiftLength() {

	when:"Shift is under 12 hours"
	def shiftnumber3=new Shift(
	timeOfDay:'Morning',
	dayOfWeek:'Tuesday',
	numberOfHours:11,
	startingTime:'12:00am')

	then:"the shift control test will be successful. "
	shiftnumber3.shiftControl()==true

        
    }
}
