package todo.tasksdao;

import java.util.ArrayList;

import todo.entities.Task;

public class TaskDao implements DaoInterface {
	private ArrayList<Task> taskList = new ArrayList<Task>();
	private int idCounter = 1;
	
	//public TaskDao(){ 
		//setting some initial data
		//Task washCar = new Task(1, true, "Wash the car");
	//	Task cleanRoom = new Task(2, true, "Clean the bedroom");
		//Task cleanRoom2 = new Task(2, true, "Clean the bedroom");

	//	taskList.add(washCar);
		//taskList.add(cleanRoom);
		//taskList.add(cleanRoom2);

	//}
	
	public ArrayList<Task> getList() {
		return taskList;
	}
	
	public ArrayList<Task> getCompleted (){
		ArrayList<Task> completedTasks = new ArrayList<Task>();
		for(Task complete : taskList) {
			if(complete.isChecked()) {
				completedTasks.add(complete);
			}
		} 
		return completedTasks;
	}
	
	public ArrayList<Task> getIncompleted (){
		ArrayList<Task> incompletedTasks = new ArrayList<Task>();
		for(Task incomplete : taskList) {
			if(!incomplete.isChecked()) {
				incompletedTasks.add(incomplete);
			}
		} 
		return incompletedTasks;
	}
	
	public void addTask(Task addTask, String description) {
		addTask.setTaskNum(idCounter);
		addTask.setChecked(false);
		addTask.setDescription(description);
		taskList.add(addTask);
		idCounter++;
	}
	
	public void removeTask(int removeTask) {
		Task taskToRemove = null;
		for(Task rmTask : taskList){
			if(removeTask == rmTask.getTaskNum()){
				taskToRemove = rmTask;
			}
		}  
		taskList.remove(taskToRemove);
	}
	
	public void updateTask(int updateTask, String newTaskNm) {  //method for updating a task.
		for(Task udTsk : taskList) {
			if(updateTask == udTsk.getTaskNum()) {
				udTsk.setTaskName(newTaskNm);
			}
		}	
	}
	
	public void taskComplete(int cmpTask) {
		for(Task taskComp : taskList) {
			if(cmpTask == taskComp.getTaskNum()) {
				taskComp.setChecked(true);
			}
	
		}	
	}
	
	public void taskIncomplete(int incmpTask) {
		for(Task taskIncomp : taskList) {
			if(incmpTask == taskIncomp.getTaskNum()) {
				taskIncomp.setChecked(false);
			}
		}
	}
	
	public void taskInProgress(int status){
		for(Task taskInProg : taskList){
			if(status == taskInProg.getTaskNum()){
				taskInProg.setStatus(true);
			}
		}
	}
	
	public void taskNotStarted(int status){
		for(Task notStarted : taskList){
			if(status == notStarted.getTaskNum()){
				notStarted.setStatus(false);
			}
		}
	}
	
}	
	