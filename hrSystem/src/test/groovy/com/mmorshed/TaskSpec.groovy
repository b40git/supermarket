package com.mmorshed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class TaskSpec extends Specification implements DomainUnitTest<Task> {

    def setup() {
    }

    def cleanup() {
    }

  void checkPeople() {

	when:"Task is created with more than 0 people"
	def cleaning=new Task(
	taskName:'Cleaning Shelves',
	numberOfPeople:1)

	then:"the people check test will be successful. "
	cleaning.peopleCheck()==true

        
    }
}
