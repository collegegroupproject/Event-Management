class student
{
	int studentID;
	String studentName;
	int numberOfEventParticipation;
	int totalEvents;

	student(int id, String name, int number)
	{
		studentID = id;
		studentName = name;
		numberOfEventParticipation = number;
		
	}
	//int eventParticipationCode[numberOfEventParticipation];
}

class events
{
	int eventID;
	String eventName;
	int numberOfParticipants;
	int timePerParticipants;
	char fixedOrVariable;
	int totalEventTime;

	events(int id, String name, int number, int time, char choice)
	{
		eventID = id;
		eventName = name;
		numberOfParticipants = number;
		timePerParticipants = time;
		fixedOrVariable = choice;

		if(fixedOrVariable == 'V')
		{
			totalEventTime = timePerParticipants * numberOfParticipants;
		}
		else 
		{
			totalEventTime = timePerParticipants;
		}	
}
}

class test
{
	static void EventWithMaximumMultiParticipation(events[] max)
	{
		int maxParticipants = 0;
		String eventName = " ";
		for(int i = 0; i < 3; i++)
		{
			if(max[i].numberOfParticipants > maxParticipants)
			{
				maxParticipants = max[i].numberOfParticipants;		
				eventName = max[i].eventName;
			}			
		}
		System.out.println("Event With Maximum Participation - " + eventName);
	}
	
	public static void main(String args[])
	{
		boolean isParellelisiumPossible;
		int i;
			
		student[] participants = new student[5];
		participants[0] = new student(101, "Aditya", 2);
		participants[1] = new student(102, "Adarsh", 1);
		participants[2] = new student(103, "Ankit", 3);
		participants[3] = new student(104, "Akansh", 2);
		participants[4] = new student(105, "Akshay", 90);

		events[] eventsHeld = new events[3];	
		eventsHeld[0] = new events(001, "Coding", 3, 60, 'F');
		eventsHeld[1] = new events(002, "Presentation", 3, 5, 'V');
		eventsHeld[2] = new events(003, "Speech", 5, 10, 'V');
	
		
		// MAIN ALGORITHM
		
			// All Events Are Fixed		

		if(eventsHeld[0].fixedOrVariable == 'F' && eventsHeld[1].fixedOrVariable == 'F' && eventsHeld[2].fixedOrVariable == 'F')	
		{
			isParellelisiumPossible = false;
			System.out.println("\nParellelisium not Possible");
		}
		else
			isParellelisiumPossible = true;
	

			// If All Students Are Participating In Every Event
		int totalParticipations = 0;
		for(i = 0; i < 5; i++)
		{	
			if(participants[i].numberOfEventParticipation > 3)
			{
				System.out.println("Number Of Event Participation is More Than The Events of Participant  - " + participants[i].studentID + "Student Name - " + participants[i].studentName);
				isParellelisiumPossible = false;
				System.exit(0);
			}
			else
			{
				totalParticipants += participants[i].numberOfEventParticipation;
			}
		}
		if(totalParticipations >= 3 * 5)
		{
			isParellelisiumPossible = false;
			System.out.println("\nParellelisium Not Possibe");
		}
		else
			isParellelisiumPossible = true;
		

		System.out.println("\nParallelisium is " + isParellelisiumPossible);

		
		EventWithMaximumMultiParticipation(eventsHeld);
		







		for(i = 0; i < 5; i++)
		{
			System.out.println("\nStudentId - " + participants[i].studentID + "\nStudentName - " + participants[i].studentName + "\nNumberOfEventParticipations - " + participants[i].numberOfEventParticipation + "\n \n");
		}







	}
}
