package com.msb;

public class TraintTicketSale extends Thread {
    private static int ticketCount=100;

    public TraintTicketSale() {
    }

    public TraintTicketSale(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
           synchronized (TraintTicketSale.class){
               if (ticketCount>0){
                   try {
                       Thread.sleep(50);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(this.getName()+"售出了第"+(ticketCount--)+"张票");
               }else{
                   break;
               }
           }
        }
        System.out.println(this.getName()+"票已经卖完了,明天再来");
    }
}
