#include<stdio.h>
#include<ctype.h>
#include<string.h>

void PrintStatement(char);	

void main()
{
	char inputString[100];
	int flag = 1;
	printf("\nEnter the String To Checks Its DataType - ");	
	scanf("%s", inputString);
	
	int length = strlen(inputString);
	char Check;
	int i, j;
	
	for(i = 0; i < length; i++)
	{
		printf("\n for %c", inputString[i]);
		if(Check == 'F')
			break;
		else if(isdigit(inputString[i]))	
			{	
				if(flag == 1)
				{
					for(j = 0; j < i-1; j++)
					{
						printf("\n%c",inputString[j]);
						if(isalpha(inputString[j]) || inputString[i] == '.')
							{
								printf("\nTrue");
								flag = 0;
								break;
							}
						Check = 'I';
					}
				}
							
			}	
		else if(isalpha(inputString[i]))
			Check = 'S';
		else if(isspace(inputString[i]))
			Check = 'S';
		else if(inputString[i] == '.')
			{
				for(j = 0; j < i-1; j++)
				{	
					if(isalpha(inputString[j]))
					{							
						flag = 0;
						break;	
					}
				}
				if(flag == 1)
				{
					for(j = i+1; j < length; j++)
					{	
						if(isalpha(inputString[j]))
						{			
							break;	
						}
						Check = 'F';
					}
				}
			}
		else if(Check == 'F')
			break;
		else
			Check = 'S';
	}			
	
	PrintStatement(Check);	
	
}

	
void PrintStatement(char check)
{
	switch(check)
	{
		case 'I': printf("Integer\n");
			break;	
		case 'S': printf("String\n");
			break;
		case 'F': printf("Float\n");
			break;
		default: printf("Enter A Valid String\n");
	}
}








