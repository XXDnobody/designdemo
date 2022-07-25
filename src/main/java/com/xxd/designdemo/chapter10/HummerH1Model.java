package com.xxd.designdemo.chapter10;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter10
 * @Author: xxd
 * @CreateTime: 2022-07-19 22:37
 * @Description: TODO
 * @Version: 1.0
 */
public class HummerH1Model extends HummerModel {
    private boolean alarmFlag = true;

    protected boolean isAlarm(){
        return this.alarmFlag;
    }
    public void setAlarmFlag(boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }

    @Override
    protected void start() {
        System.out.println("悍马H1发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H1停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H1鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的");
    }
}
