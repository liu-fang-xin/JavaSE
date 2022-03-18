package com.msb.test;

import com.msb.TraintTicketSale;

public class test01 {
    public static void main(String[] args) {
        TraintTicketSale ticketSale1 = new TraintTicketSale("窗口1");
        TraintTicketSale ticketSale2 = new TraintTicketSale("窗口2");
        TraintTicketSale ticketSale3 = new TraintTicketSale("窗口3");

        ticketSale1.start();
        ticketSale2.start();
        ticketSale3.start();

    }

}
