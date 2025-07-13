package LinkedList;

class Task {
    int id, priority;
    String name, due;
    Task next;

    Task(int id, String name, int priority, String due) {
        this.id = id; this.name = name; this.priority = priority; this.due = due;
    }
}

class Scheduler {
    Task head = null, current = null;

    void addFirst(int id, String name, int p, String due) {
        Task t = new Task(id, name, p, due);
        if (head == null) {
            head = t; t.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            t.next = head; temp.next = t; head = t;
        }
    }

    void addLast(int id, String name, int p, String due) {
        Task t = new Task(id, name, p, due);
        if (head == null) {
            head = t; t.next = head;
        } else {
            Task temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = t; t.next = head;
        }
    }

    void addAt(int pos, int id, String name, int p, String due) {
        if (pos <= 1) { addFirst(id, name, p, due); return; }
        Task t = new Task(id, name, p, due), temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) temp = temp.next;
        t.next = temp.next; temp.next = t;
    }

    void remove(int id) {
        if (head == null) return;
        if (head.id == id && head.next == head) { head = null; return; }
        if (head.id == id) {
            Task last = head;
            while (last.next != head) last = last.next;
            head = head.next; last.next = head; return;
        }
        Task prev = head, cur = head.next;
        while (cur != head) {
            if (cur.id == id) { prev.next = cur.next; return; }
            prev = cur; cur = cur.next;
        }
    }

    void viewNext() {
        if (head == null) return;
        if (current == null) current = head;
        System.out.println(current.id + " " + current.name + " " + current.priority + " " + current.due);
        current = current.next;
    }

    void showAll() {
        if (head == null) return;
        Task t = head;
        do {
            System.out.println(t.id + " " + t.name + " " + t.priority + " " + t.due);
            t = t.next;
        } while (t != head);
    }

    void searchByPriority(int p) {
        if (head == null) return;
        Task t = head; boolean f = false;
        do {
            if (t.priority == p) {
                System.out.println(t.id + " " + t.name + " " + t.priority + " " + t.due);
                f = true;
            }
            t = t.next;
        } while (t != head);
        if (!f) System.out.println("No task with priority " + p);
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scheduler s = new Scheduler();
        s.addFirst(1, "A", 2, "2025-07-07");
        s.addLast(2, "B", 1, "2025-07-08");
        s.addAt(2, 3, "C", 3, "2025-07-09");

        s.showAll();
        s.viewNext(); s.viewNext();
        s.searchByPriority(1);
        s.remove(2);
        s.showAll();
    }
}

