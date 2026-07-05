package com.debanuj;

public class TaskLinkedList {

    private Node head;

    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public Task searchTask(int taskId) {

        Node temp = head;

        while (temp != null) {

            if (temp.task.getTaskId() == taskId)
                return temp.task;

            temp = temp.next;
        }

        return null;
    }

    public void traverseTasks() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.task);

            temp = temp.next;
        }
    }

    public void deleteTask(int taskId) {

        if (head == null)
            return;

        if (head.task.getTaskId() == taskId) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null) {

            if (temp.next.task.getTaskId() == taskId) {
                temp.next = temp.next.next;
                return;
            }

            temp = temp.next;
        }
    }
}