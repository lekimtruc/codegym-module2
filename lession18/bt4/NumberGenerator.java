package lession18.bt4;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        try{
            System.out.println("hashCode " +this.hashCode());
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
