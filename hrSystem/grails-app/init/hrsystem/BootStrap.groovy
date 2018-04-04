package hrsystem

class BootStrap {

    def init = { servletContext ->

def employee1 = new com.mmorshed.Employee(fullName: 'Duncan Scott',
	dateOfBirth: new Date('12/11/1976'),
	residence: 'Barnsley',
	hourlyRate: 7.50,
	employeeID: 'E4600',
	dateEmployed: new Date('21/08/2017'),
	taxCode: 'TX461',		
	contract: 'Full-time').save()

def employee2 = new com.mmorshed.Employee(fullName: 'Tom Rivers',
	dateOfBirth: new Date('05/05/1991'),
	residence: 'Chesterfield',
	hourlyRate: 6.99,
	employeeID: 'E9200',
	dateEmployed: new Date('01/02/2018'),
	taxCode: 'TX881',		
	contract: 'Part-time').save()

def shift1 = new com.mmorshed.Shift(timeOfDay: 'Morning',
	daysOfWeek: 'Tuesday',
	numberOfHours: 4,
	startingTime: '6:00am',
	employee: employee1).save()
	
	
def shift2 = new com.mmorshed.Shift(timeOfDay: 'Afternoon',
	daysOfWeek: 'Friday',
	numberOfHours: 5,
	startingTime: '12:00am',
	employee: employee2).save()
	

def team1 = new com.mmorshed.Team(teamName: 'Loading Team',
	numberOfEmployees: 15,
	sectionName: 'Bakery',
	description: '''Loading and unloading deliveries''').save()	

def team2 = new com.mmorshed.Team(teamName: 'Stocking',
	numberOfEmployees: 40,
	sectionName: 'Fruit/Veg',
	description: '''Stock Replenishment''').save()

def teamleader1 = new com.mmorshed.Teamleader(fullName: 'Sarah McDonald',
	department: 'Grocery',
	employeeID: 'GR001',
	sectionName: 'Butcher',
	officePhone: 20,
	leaderEmail: 's.mcdonald@butcher.com',
	password: 'butcher123',
	employee: employee1,
	team: team1).save()

def teamleader2 = new com.mmorshed.Teamleader(fullName: 'Travis Parker',
	department: 'Cosmetics',
	employeeID: 'CRT19',
	sectionName: 'Deliveries',
	officePhone: 12,
	leaderEmail: 't.cos@leadership.com',
	password: 'tpassword',
	employee: employee2,
	team: team2).save()


def manager1 = new com.mmorshed.Manager(fullName: 'Andrew Smith',
	userName: 'asmith73',
	password: 'pword123',
	managerEmail: 'a.s73@email.com',
	office: 'B1-460',
	department: 'Electronics',
	teamleader: teamleader1,
	employee: employee1).save()
	

def manager2 = new com.mmorshed.Manager(fullName: 'Alan Ally',
	userName: 'aally',
	password: 'secret123',
	managerEmail: 'a.ally@gmail.com',
	office: 'AI-050',
	department: 'Clothing',
	teamleader: teamleader2,
	employee: employee2).save()
	

def task1 = new com.mmorshed.Task(taskName:'Cleaning',
	numberOfPeople: 4,
	sectionName: 'mens clothings',
	department: 'Clothing',
	timeRequired: '2 hours',
	description: '''Clothing mens clothing area''',
	taskCompleted: false).save()

def task2 = new com.mmorshed.Task(taskName: 'Replenishing',
	numberOfPeople: 6,
	sectionName: 'poultry',
	department: 'Grocery',
	timeRequired: '1 hour',
	description: '''Replenishing shelves''',
	taskCompleted: true).save()

	
	/*
	employee1.addToShifts(shift1)
	employee1.addToShifts(shift2)
	employee1.addToManagers(manager1)
	employee1.addToManagers(manager2)
	employee1.addToTeamleaders(teamleader1)
	employee1.addToTeamleaders(teamleader2)
	teamleader1.addToManagers(manager1)
	teamleader1.addToManagers(manager2)
	shift1.addToTasks(task1)
	shift1.addToTasks(task2)
	task2.addToShifts(shift1)
	task1.addToEmployees(employee1)
	task1.addToEmployees(employee2)
	employee2.addToTasks(task2)
	shift1.addToTeams(team1)
	shift1.addToTeams(team2)
	team2.addToShifts(shift2)
	task1.addToTeams(team1)
	task1.addToTeams(team2)
	team2.addToTeams(task2)
	employee1.addToTeams(team1)
	employee1.addToTeams(team2)
	team2.addToTeams(employee2)	
	*/
    }
    def destroy = {
    }
}
