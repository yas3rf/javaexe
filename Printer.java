package com.company.encapsulation;

public class Printer {
    private int tonerLevel = 100;
    private int printingPage;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }
        this.printingPage = 0;
        this.isDuplex = isDuplex;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPrintingPage() {
        return printingPage;
    }


    public int fillToner(){
        if (this.tonerLevel<50 && this.tonerLevel>=0){
            this.tonerLevel=100;
            System.out.println("the toner filled successfully its now " + tonerLevel+"%");
        }
        System.out.println("The toner level is: " + tonerLevel +"%");
        return tonerLevel;
    }
    public void printedPages(){
        this.printingPage += this.printingPage;
        System.out.println("The printed page so far: " + printingPage);
    }

    public void duplex(){
        if (this.isDuplex){
            System.out.println("the printer is capable of print the both side! ");
        }
        else
            System.out.println("the print is capable of printing one side! ");
    }
}
