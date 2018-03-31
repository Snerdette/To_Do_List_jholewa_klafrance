package todo.entities;

public class Task {
	int taskId;
	boolean checked;
	boolean status;
	String taskName;
	String description;

	
	
	public Task(int taskId, boolean checked, boolean status, String taskName, String description) {
		this.taskId = taskId;
		this.checked = checked;
		this.status = status;
		this.taskName = taskName;
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		String taskStatus = "Not Started";
		if(status) {
			taskStatus = "In Progress";
		}
		
		String done = "Unchecked";
		if(checked){
			done = "Checked";
		}
		// TODO Auto-generated method stub
		return " \n" + "Task Number: " + taskId + " " + taskName + " Is " + done+ "\n" + taskStatus + "\n" + description + "\n";
	}


	public int getTaskNum() {
		return taskId;
	}
	public void setTaskNum(int taskNum) {
		this.taskId = taskNum;
	}
	public boolean isChecked() {
		return checked;
	}
	public void setChecked(boolean checked) {
		this.checked = checked;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getDescription(String description) {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean getStatus(boolean status){
		return status;
	}
	public void setStatus(boolean status){
		this.status = status;
	}
	
}


