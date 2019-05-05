package singletons;

import java.util.concurrent.CountDownLatch;

/**
 * @author mrguanxs@163.com
 * @date 2019/4/30 15:30
 */
public class Test {
    //线程数
    public static final int NUMS = 200;

    //发枪器
    private static CountDownLatch countDownLatch = new CountDownLatch(NUMS);

    public static void main(String[] args) {

        SingletonManager.registerService("singleton", new Singleton());
        for (int i = 0; i < NUMS; i++) {
            new Thread(new TestSingleton()).start();
            //线程倒计时，从200到0就一起开始
            countDownLatch.countDown();
        }
        //countDownLatch.wait(2000);

        //new Singleton();
        //new Singleton.B();
        //new Singleton().new A();

    }

    public static class TestSingleton implements Runnable{

        @Override
        public void run() {
            try {
                //等待线程
                countDownLatch.await();
            } catch (InterruptedException e){
                e.printStackTrace();
            }

//            System.out.println(Singleton1.getInstance());
//            System.out.println(Singleton2.getInstance());
//            System.out.println(Singleton3.getInstance());
//            System.out.println(Singleton4.getInstance());//线程不安全
//            System.out.println(Singleton5.getInstance());
//            System.out.println(Singleton6.getInstance());//线程不安全
//            System.out.println(Singleton7.getInstance());
//            System.out.println(Singleton8.INSTANCE.hashCode());

            Singleton singleton1 = (Singleton)SingletonManager.getService("singleton");
            Singleton singleton2 = (Singleton)SingletonManager.getService("singleton");
            Singleton singleton3 = (Singleton)SingletonManager.getService("singleton");
            System.out.println(singleton1);
            System.out.println(singleton2);
            System.out.println(singleton3);
        }
    }
}
