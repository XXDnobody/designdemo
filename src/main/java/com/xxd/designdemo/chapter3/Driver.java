package com.xxd.designdemo.chapter3;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter3
 * @Author: xxd
 * @CreateTime: 2022-07-16  17:21
 * @Description: TODO
 * @Version: 1.0
 */
public class Driver implements IDriver{

    @Override
    public void drive(ICar car) {
        car.run();
    }
}
