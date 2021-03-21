package com.company;

public class queue {
    static int SIZE = 5;
    static int items[] = new int[SIZE];
    static int front, rear;

    queue() {
        front = -1;
        rear = -1;
    }


    static boolean isFull() {
        if (front == 0 && rear == SIZE - 1) {
            return true;
        }
        return false;
    }
    static boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }
    static void enQueue(int element) {

        if (isFull()) {
            System.out.println("Queue is full");
        }
        else {
            if (front == -1) {
                front = 0;
            }

            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }

    }
    static int deQueue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        }
        else {
            element = items[front];

            if (front >= rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
            System.out.println( items[front] + " Deleted");
            return items[element];
        }
    }

    public static void main(String[] args) {
             enQueue(100);
             enQueue(200);
             deQueue();
             System.out.println("front pointing to -> "+front);
             System.out.println("Rear pointing to -> "+rear);
             for(int i=front;i<=rear;i++){
                 System.out.println(items[i]+" ");
             }
    }
}
