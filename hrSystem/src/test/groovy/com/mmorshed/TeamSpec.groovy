package com.mmorshed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TeamSpec extends Specification implements DomainUnitTest<Team> {

    def setup() {
    }

    def cleanup() {
    }
	void checkCase() {

   	when:"Team's name has upper case"
	def convert=new Team(
	teamName:'Isaac Newton',
	password:'secret2018')

	then:"the validate password will be successful. "
	convert.changingCase()=='isaac newton'

	}
}
