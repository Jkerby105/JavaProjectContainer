package project1;

import java.util.Random;

public class LinkedList {

    // Node class \\
    private static class Node {

        private final Student newStudent;
        private int id;

        private Node next = null;

        public Node(Student S, int id) {
            this.newStudent = S;
            this.id = id;
        }

        public String getStudentUserName() {
            return newStudent.getUserName();
        }

        public String getStudentPassWord() {
            return newStudent.getPassWord();
        }

        public String getStudentName() {
            return newStudent.getName();
        }

        public String getStudentAddress() {
            return newStudent.getAddress();
        }

        public String getStudentEmail() {
            return newStudent.getEmail();
        }

        public int getStudentId() {
            return this.id;
        }

    }

    // Initalized the head, tail, and size \\
    Node head;
    Node tail;
    int size = 0;

    // Insert Student into the data structure \\
    public void insertHelper(String username, String password, String name, String address, String email){
        Student nStudent = new Student(username, password, name, address, email);
        insertNewStudent(nStudent);
    }

    public void insertNewStudent(Student newStudent) {
        Node node = new Node(newStudent, generateRandomId());
        if (size == 0) {
            head = node;
            tail = node;
            size++;
        } else {

            Node tempNode = head;
            while (tempNode.next != null) {
                tempNode = tempNode.next;
            }
            tempNode.next = node;
            tail = node;
            size++;
        }

    }

    // Method for deleting
    public void deletingStudent(int idNum) {

        Node tempNode = head;
        if (head.id == idNum) {

        } else {

            while (tempNode != null) {
                if (tempNode.next != null && tempNode.next.id == idNum) {
                    if (tempNode.next == tail) {
                        tail = tempNode;
                    }
                    tempNode.next = tempNode.next.next;
                    System.out.println("The deletion was completed");
                }

            }

        }
    }
    // Method for searching \\
    public Node searchForStudent(String username, String passowrd) {
        boolean studentFound = false;
        Node tempNode = head;

        while (tempNode != null) {
            if (tempNode.newStudent.getUserName() == username && tempNode.newStudent.getPassWord() == passowrd) {
                studentFound = true;
                break;
            }
            tempNode = tempNode.next;
        }

        if (studentFound) {
            return tempNode;
        } else {
            return null;
        }
    }

    public void forwardDisplay() {
        Node tempNode = head;

        while (tempNode != null) {
            System.out.println(tempNode.newStudent.toString());
            tempNode = tempNode.next;
        }

    }

    // Generate Student ID number\\
    public int generateRandomId() {
        Random random = new Random();
        StringBuilder sBuilder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int holdRandomValue = random.nextInt(9);
            sBuilder.append(String.valueOf(holdRandomValue));
        }
        return Integer.valueOf(sBuilder.toString());
    }

    public void displayStudentInfo(String username,String password){
        Node node =  searchForStudent(username,password);
        if(node != null){
            System.out.println();
            System.out.println(node.getStudentName() + "is a student at University of North Florida");
            System.out.println("Student ID number "+ node.id);
            System.out.println("Current email is " + node.getStudentEmail());
            System.out.println("Current address is " + node.getStudentAddress());
            System.out.println();
        }else{
            System.out.println("Student is not in the system");
        }
    }

}
