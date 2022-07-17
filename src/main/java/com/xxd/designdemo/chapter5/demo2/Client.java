package com.xxd.designdemo.chapter5.demo2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter5.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-17  21:51
 * @Description: 尽量去封装
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }


}
