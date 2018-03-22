package com.mmorshed

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class EmployeeSpec extends Specification implements DomainUnitTest<Employee> {

    def setup() {
    }

    def cleanup() {
    }

    void totalSalary() {
        when:"An employee has name and rate"
	
	def gary=new Employee(fullName:'Gary Parker',

				hourlyRate:7.50)

	then:"The calculateSalary method will total salary"

	gary.calculateSalary()==60
    }
}
