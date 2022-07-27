package com.xxd.designdemo.chapter24.demo2;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-27 21:41
 * @Description: 工具类
 * @Version: 1.0
 */
public class BeanUtils {
    public static HashMap<String, Object> backupPro(Object bean) {
        HashMap<String,Object> result = new HashMap<String,Object>();
        try {
            //获得Bean描述
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            //获得属性描述
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String fieldName = propertyDescriptor.getName();
                Method getter = propertyDescriptor.getReadMethod();
                Object fieldValue = getter.invoke(bean, new Object[]{});
                if(!fieldName.equalsIgnoreCase("class")){
                    result.put(fieldName,fieldValue);
                }
            }

        }catch (Exception e){

        }
        return result;
    }

    public static void restoreProp(Object bean,HashMap<String,Object> propMap){
        try{
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());
            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
            for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
                String fieldName = propertyDescriptor.getName();
                if(propMap.containsKey(fieldName)){
                    Method setter = propertyDescriptor.getWriteMethod();
                    setter.invoke(bean,new Object[]{propMap.get(fieldName)});
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
