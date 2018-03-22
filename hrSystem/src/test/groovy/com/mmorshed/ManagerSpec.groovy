package com.mmorshed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class ManagerSpec extends Specification implements DomainUnitTest<Manager> {

    def setup() {
    }

    def cleanup() {
    }

    void mergeData() {

	when:"A Manager has name, office and department"
	def frank=new Manager(
	fullName:'Frank Grimes',
	office:'G1-05',
	department:'Tupperware')

	then:"the toString method will merge them. "
	frank.toString()=='Frank Grimes, G1-05, Tupperware'

        
    }
}
