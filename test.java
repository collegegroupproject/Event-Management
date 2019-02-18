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

	//Starting Time
	float startTime = 09.00f;		

	static void eventWithMaximumMultiParticipation(events[] max)
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
	
	static float minutesToHourConversion(int minutes)
	{	
		float time;
		float hrs = minutes / 60;		
		float mins = minutes % 60;
		
		time = hrs + (float)(mins * .01);
		
		return time;
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
		participants[4] = new student(105, "Akshay", 2);

		events[] eventsHeld = new events[3];	
		eventsHeld[0] = new events(001, "Coding", 3, 60, 'F');
		eventsHeld[1] = new events(002, "Presentation", 3, 5, 'V');
		eventsHeld[2] = new events(003, "Speech", 5, 10, 'V');
	
		//Global Counter - Total Time Alloted
		//float counter = 8*60; // In Minutes		
		
		//Event Clock
		float eventClock = 0;
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
				System.out.println("Number Of Event Participation is More Than The Listed Events of Participant  - " + participants[i].studentID + " Student Name - " + participants[i].studentName);
				isParellelisiumPossible = false;
				System.exit(0);
			}
			else
			{
				totalParticipations += participants[i].numberOfEventParticipation;
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

		
		eventWithMaximumMultiParticipation(eventsHeld);
		

		//System.out.println("\nTime Check - " + minutesToHourConversion(20));
		
		




		/*for(i = 0; i < 5; i++)
		{
			System.out.println("\nStudentId - " + participants[i].studentID + "\nStudentName - " + participants[i].studentName + "\nNumberOfEventParticipations - " + participants[i].numberOfEventParticipation + "\n \n");
		}*/







	}
}
