package todo.services;

import java.util.ArrayList;

import todo.entities.Task;


public interface ServiceInterface {

	/**
	 * Something else
	 * @return
	 */
	
	/**
	 * Adds task to ArrayList taskList :-)
	 * @param taskName
	 */
	public ArrayList<Task> getList();  //creates a new method getList, that reaches into the Dao and calls the getList method there	
	
	/**
	 * adds task to the ArrayList Task 
	 * @param rmTask
	 */
	public void addTask(String taskName, String description);
	
	/**
	 * Removes a task from the ArrayList Task
	 * @param rmTask
	 */
	public void removeTask(int rmTask);
	
	/**
	 * updates the task name based on user input for the task ID
	 * @param udTsk
	 * @param newTaskNm
	 */
	public void updateTask(int udTsk, String newTaskNm);
	
	/**
	 * Users select task ID and task is then updated to boolean complete(true)
	 * @param cmpTask
	 */
	public void taskComplete(int cmpTask);
	
	/**
	 * Users select task ID and task is then updated to boolean incomplete(false)
	 * @param incmpTask
	 */
	public void taskIncomplete(int incmpTask);
	
	/**
	 * Returns a list of all tasks marked "completed"
	 * @return
	 */
	public ArrayList<Task> getCompleted ();
	
	/**
	 * Returns a list of all tasks marked "incomplete"
	 * @return
	 */
	public ArrayList<Task> getIncompleted ();
	/**
	 * marks a task status as in progress
	 */
	
	public void taskInProgress(int status);
	
	/**
	 * marks a task as not started
	 * @param status
	 */
	public void taskNotStarted (int status);
}
