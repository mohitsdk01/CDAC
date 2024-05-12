package cdac.java.q2.utils;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import cdac.java.q2.exceptions.TaskException;
import cdac.java.q2.task.Status;
import cdac.java.q2.task.Task;
import static cdac.java.q2.task.Status.INPROGRESS;
import static cdac.java.q2.task.Status.PENDING;
import static cdac.java.q2.task.Status.COMPLETED;


public class TaskUtils {
	
	public static Map<Integer, Task> populateMap(){
		Map<Integer, Task> taskMap = new HashMap<>();
		taskMap.put(100, new Task("Chore Chuckles", "Desc1", 
				parse("2024-04-27"), INPROGRESS, true));
		taskMap.put(101, new Task("The Giggle Grid", "Desc2", 
				parse("2024-04-29"), PENDING, true));
		taskMap.put(102, new Task("Tickled Tasks", "Desc3", 
				parse("2024-04-21"), COMPLETED, false));
		taskMap.put(104, new Task("Wisecracking Workload", "Desc4", 
				parse("2024-04-25"), PENDING, true));
		taskMap.put(105, new Task("Jocular Jobs", "Desc5", 
				parse("2024-04-22"), COMPLETED, false));
		taskMap.put(106, new Task("Mirthful Must-Dos", "Desc6", 
				parse("2024-04-28"), INPROGRESS, true));
		return taskMap;
	}
	
	public static void deleteTask(int id, Map<Integer, Task> taskMap) 
	throws TaskException{
		if(taskMap.containsKey(id)) {
//			taskMap.remove(id);
//			for(Task t : taskMap.values())
//				t.setActive(false);
			taskMap.get(id).setActive(false);
			
		}
		else {
			throw new TaskException("Invalid ID!!!");
		}
	}
	
	public static void updateStatus(int id, Map<Integer, Task> taskMap, String status) 
			throws TaskException{
		if(taskMap.containsKey(id)) {	
			for(Task t : taskMap.values()) {
				if(t.getStatus().equals(PENDING)) {
					t.setStatus(INPROGRESS);
				}
				else if(t.getStatus().equals(INPROGRESS)) {
					t.setStatus(COMPLETED);
				}
			}
//			Task t = taskMap.get(id);
//			Status st = Status.INPROGRESS;
//			Status st1 = Status.COMPLETED;
//			if(Status.valueOf(status.toUpperCase()).equals(st))
//				t.setStatus(st);
//			else {
//				t.setStatus(st1);
//				t.setActive(false);
//			}
		}
		System.out.println("Status Updated...");
	}
	
	public static void displayAllPendingTasks(Map<Integer, Task> taskMap) {
		for(Task task : taskMap.values()) {
			if(task.getStatus().equals(PENDING)) {
				System.out.println(task);
			}
		}
	}
	
	public static void displayAllTodaysPendingTasks(Map<Integer, Task> taskMap) {
		for(Task task : taskMap.values()) {
			if(task.getTaskDate().equals(LocalDate.now())) {
				if(task.getStatus().equals(PENDING)) {
					System.out.println(task);
				}
			}
		}
	}
}
