package javaThreads;

public class RaceCarRunnable extends Car implements Runnable {
    private int passed;
    private int distance;
    private boolean isFinish = false;
    private long passedWay = 0;
    private int trackLength;

    public RaceCarRunnable(String name, int maxSpeed, int distance) {
        super(name, maxSpeed);
        this.distance = distance;
        System.out.println();
    }

    public int getRandomSpeed() {
        return (int) (getMaxSpeed() / 2 + Math.random() * getMaxSpeed());
    }

    @Override
    public String toString() {
        return getName() + "=> speed:" + getRandomSpeed() + "; progress: " + passed + "/" + distance;
    }

    @Override
    public void run() {
        while (!isFinish) {
            try {
                Thread.sleep(1000);
                passedWay += getRandomSpeed() * 1000 / 3600;
                if (passedWay >= distance) {
                    isFinish = true;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
