package todo.controller;

import java.util.Scanner;

import todo.services.ServiceInterface;
import todo.services.TaskServices;

public class TaskController {

	private ServiceInterface taskServices = new TaskServices(); // creates new TaskServices object using the Service Interface

	static Scanner displayInput = new Scanner(System.in);
	Boolean quitter = false;

	public void displayMenu() {

		System.out.println("Welcome to the To-Do list!"+ "\n");
		System.out.println("What would you like to do?" + "\n");
		System.out.println("1: Display list");
		System.out.println("2: Update Task");
		System.out.println("3: Add task");
		System.out.println("4: Remove task");
		System.out.println("5: Mark task complete");
		System.out.println("6: Mark task incomplete");
		System.out.println("7: Display complete tasks");
		System.out.println("8: Display incomplete tasks");
		System.out.println("9: Mark task as 'in progress' ");
		System.out.println("10: Quit Program");
		System.out.println("");
	}

	public String userInput() {
		String userInput = displayInput.nextLine();
		return userInput;
	}

	// System.out.println(menuInput());

	public void run() {
		while (quitter == false) {
			displayMenu();
			String menuInput = userInput();
			switch (menuInput) {

			case "1":
				System.out.println("Displaying List");

				System.out.println(taskServices.getList()); // reaches into the TaskServices class and calls the getList method
				break;
			case "2":
				System.out.println("Please enter the task ID to update");
				String updateTask = displayInput.nextLine();
				System.out.println("What is the new task name?");
				String newTaskNm = displayInput.nextLine();

				try{
					taskServices.updateTask(Integer.parseInt(updateTask), newTaskNm);
					
				} catch(NumberFormatException e) {
					
					System.out.println("Enter a number please");
				}
				break;
			case "3":
				
				System.out.println("Please enter a task name");
				String taskName = displayInput.nextLine();
					if(taskName.equals("")  || taskName == null) {
						System.out.println("Enter a real task name!" + "\n");
						
					} else {
						System.out.println("If you would like to include a description, enter it now, otherwise press enter");
						String description = displayInput.nextLine();
						taskServices.addTask(taskName, description);
						System.out.println(taskServices.getList());
						
						

					}
				break;
			case "4":
				System.out.println("Please enter the task ID you would like to remove");
				String rmTask = displayInput.nextLine();
				try{
					taskServices.removeTask(Integer.parseInt(rmTask));
					
				} catch(NumberFormatException e) {
					
					System.out.println("Enter a number please");
				}
				break;
			case "5":
				System.out.println("Enter the task ID of the task you would like to mark complete");
				String cmpTask = displayInput.nextLine();

				try{
					taskServices.taskComplete(Integer.parseInt(cmpTask));
					
				} catch(NumberFormatException e) {
					
					System.out.println("Enter a number please");
				}
				break;
			case "6":
				System.out.println("Enter the task ID of the task you would like to mark incomplete");
				String incmpTask = displayInput.nextLine();

				try{
					taskServices.taskIncomplete(Integer.parseInt(incmpTask));
					
				} catch(NumberFormatException e) {
					
					System.out.println("Enter a number please");
				}
				break;
			case "7":
				System.out.println("Displaying completed task List");

				System.out.println(taskServices.getCompleted()); // reaches into the TaskServices class and calls the getList method
				break;
			case "8":
				System.out.println("Displaying incompleted task List");

				System.out.println(taskServices.getIncompleted()); // reaches into the TaskServices class and calls the getList method
				break;
			case "9":
				System.out.println("Enter task ID you'd like to set the status of'");
				String statusId = displayInput.nextLine();

				try{
					int id = Integer.parseInt(statusId);
					System.out.println("would you like to et it to 1.In Progress Or 2.Not Started?");
					String statusChoice = displayInput.nextLine();	
						if(Integer.parseInt(statusChoice) == 1){
							taskServices.taskInProgress(id);
						} 
						else if (Integer.parseInt(statusChoice) == 2){
							taskServices.taskNotStarted(id);
						}

					
				} catch(NumberFormatException e) {
					
					System.out.println("Enter an ID number please");
				}
				break;
				
			case "10":
				System.out.println("Quitting Program... Good Bye!");
				quitter = true;
				break;
			default:
				System.out.println("Invalid selection, Please Choose from the listed options");

			}
		}

	}
}
