package com.mmorshed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamleaderSpec extends Specification implements DomainUnitTest<Teamleader> {

    def setup() {
    }

    def cleanup() {
    }

    void checkEmail() {

	when:"Team Leader's password is over six characters"
	def frank=new Teamleader(
	fullName:'Isaac Newton',
	password:'secret2018')

	then:"the validate password will be successful. "
	frank.validatingPassword()==true

        
    }
}
