package todo.services;

import java.util.ArrayList;

import todo.entities.Task;
import todo.tasksdao.DaoInterface;
import todo.tasksdao.TaskDao;


public class TaskServices implements ServiceInterface {
	//private Task newTask = new Task();
	
	//static Scanner inputTask = new Scanner(System.in);

	
	private DaoInterface list = new TaskDao();  //creates new Dao object
	
	/**
	 * Typing something
	 */
	
	@Override
	public ArrayList<Task> getList(){  //creates a new method getList, that reaches into the Dao and calls the getList method there
		return list.getList();	
	}
	@Override
	public void addTask(String taskName, String description) {
		Task newTask = new Task(0, true, false, taskName, description);
		list.addTask(newTask, description);	
	}
	@Override
	public void removeTask(int rmTask) {
		list.removeTask(rmTask);
	}
	@Override
	public void updateTask(int udTsk, String newTaskNm) {
		list.updateTask(udTsk, newTaskNm);
		
	}
	@Override
	public void taskComplete(int cmpTask) {
		list.taskComplete(cmpTask);
	}
	@Override
	public void taskIncomplete(int incmpTask) {
		list.taskIncomplete(incmpTask);
	}
	@Override
	public ArrayList<Task> getCompleted () {
		return list.getCompleted();
	}
	@Override
	public ArrayList<Task> getIncompleted () {
		return list.getIncompleted();
	}
	@Override
	public void taskInProgress (int status){
		list.taskInProgress(status);
	}
	
	public void taskNotStarted (int status) {
		list.taskNotStarted(status);
	}
	
		
}


