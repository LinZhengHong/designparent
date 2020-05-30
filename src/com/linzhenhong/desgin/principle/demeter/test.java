package com.linzhenhong.desgin.principle.demeter;

import java.time.temporal.TemporalAmount;

/**
 * @author LinZhenHong
 */
public class test {
    public static void main(String[] args) {
        Boss boss=new Boss();
        TempLeader leader=new TempLeader();
        boss.commandCheckCourse(leader);
    }
}
