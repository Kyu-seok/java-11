package com.kyu.java.parallel_stream;

public class Sum {

    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void performSum(int input) {
        System.out.print("Original : " + total);
        total += input;
        System.out.print("\t add : " + input);
        System.out.print("\t final : " + total + "\n");
    }

}
