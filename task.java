class Worker extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Worker :" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}

public class task {
    public static void main(String args[]) {
        int alphabet = 'a';
        Worker task = new Worker();
        task.start();
        try {
            while (task.isAlive()) {
                System.out.println("main:" + (char)alphabet++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }


}
