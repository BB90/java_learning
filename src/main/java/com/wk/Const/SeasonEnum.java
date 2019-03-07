package com.wk.Const;

/**
 * @program: java_learning
 * @Date: 2019/3/7 15:14
 * @Author: Mr.Wang
 * @Description:
 */

/**
 * enum关键字的地位和class，interface一样
 * 使用enum定义的类默认实现了java.lang.ENUM类而不是Object类，枚举类可以实现一个或多个接口
 * 枚举类的实现必须在第一行全部给出，不需要用new，不需要调用显示构造器。自动添加public static final修饰
 * 使用enum定义、非抽象的枚举类默认使用final修饰，不可以被继承
 * 枚举类的构造器只能是私有的
 */
public enum SeasonEnum {
    SPRING,SUMMER,FAIL,WINTER;
}
