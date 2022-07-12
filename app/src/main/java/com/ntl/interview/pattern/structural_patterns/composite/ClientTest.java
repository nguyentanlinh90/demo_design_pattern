package com.ntl.interview.pattern.structural_patterns.composite;

public class ClientTest {

    public static void main(String[] args) {

        Boss boss = new Boss(60, "Boss", 10000);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst(27, "BusinessAnalyst", 2100);

        Leader leader = new Leader(30, "Leader", 5000);
        Developer developer1 = new Developer(20, "Developer 1", 1000);
        Developer developer2 = new Developer(23, "Developer 2", 2000);

        leader.add(developer1);
        leader.add(developer2);

        boss.add(leader);
        boss.add(businessAnalyst);

        boss.print();

    }
}
