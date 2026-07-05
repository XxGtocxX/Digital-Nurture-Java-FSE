package com.debanuj;

public class TaskTest {

    public static void main(String[] args) {

        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(new Task(101, "Design UI", "Pending"));
        taskList.addTask(new Task(102, "Develop Backend", "In Progress"));
        taskList.addTask(new Task(103, "Testing", "Pending"));

        System.out.println("All Tasks");

        taskList.traverseTasks();

        System.out.println("\nSearch Task");

        System.out.println(taskList.searchTask(102));

        taskList.deleteTask(102);

        System.out.println("\nAfter Delete");

        taskList.traverseTasks();
    }
}