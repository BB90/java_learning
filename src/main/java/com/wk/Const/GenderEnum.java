package com.wk.Const;

/**
 * @program: java_learning
 * @Date: 2019/3/7 15:36
 * @Author: Mr.Wang
 * @Description:
 */

/**
 * 枚举类里面也可以有属性和方法，可以是静态的和非静态的
 * 实际上，在第一行代码的时候就调用了构造器，因为没有显示声明的无参数的构造器，就调用有参数的构造器
 * 有参数的构造器只能是私有的，更安全也更简洁
 * enum可以直接作为switch的判断字段
 */
public enum GenderEnum {
    MALE("男","这是一个男生"),FEMALE("女","这是一个女生");
    
    private final String name;
    private final String desc;
    
    private GenderEnum(String name,String desc){
        this.name = name;
        this.desc = desc;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getDesc(){
        return this.desc;
    }
}
