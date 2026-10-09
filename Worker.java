class Worker {
    private volatile boolean running = true;

    void stop() {
        running = false;
        System.out.println(running);
    }

    void work() {
        while (running) {
            // do work
            System.out.println(running + "in while stmt");
        }

    }
    public static void main(String[] args) {
        Worker a = new Worker();
        // a.stop();
        // a.work();

        a.work();
        a.stop();
    }
}