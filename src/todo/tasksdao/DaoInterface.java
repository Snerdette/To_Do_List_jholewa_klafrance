package todo.tasksdao;

import java.util.ArrayList;

import todo.entities.Task;

public interface DaoInterface {

	/**
	 * returns the lists of tasks from the ArrayList (taskList)
	 * @return
	 */
	public ArrayList<Task> getList();
	
	/**
	 * returns a list of all the "completed" tasks (true)
	 * @return
	 */
	public ArrayList<Task> getCompleted ();
	
	/**
	 * returns a list of all the "incomplete" task (false)
	 * @return
	 */
	public ArrayList<Task> getIncompleted ();
	
	/**
	 * add's a new task to the taskList
	 * @param addTask
	 */
	public void addTask(Task addTask, String description);
	
	/**
	 * removes a task from the taskList
	 * @param removeTask
	 */
	public void removeTask(int removeTask);
	
	/**
	 * updates a task chosen by the user to the user's input
	 * @param updateTask
	 * @param newTaskNm
	 */
	public void updateTask(int updateTask, String newTaskNm);
	
	/**
	 * returns a list of all the list items marked complete (boolean true)
	 * @param cmpTask
	 */
	public void taskComplete(int cmpTask);
	
	/**
	 * returns a list of all the list items marked incomplete (boolean false)
	 * @param incmpTask
	 */
	public void taskIncomplete(int incmpTask);
	
	/**
	 * sets the status of a task to "in progress"
	 * @param status
	 */
	public void taskInProgress(int status);
	
	/**
	 * sets the status of a task to "not started"
	 * @param status
	 */
	public void taskNotStarted(int status);
}
