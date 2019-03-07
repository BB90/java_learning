package com.wk.Const;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program: java_learning
 * @Date: 2019/3/7 15:58
 * @Author: Mr.Wang
 * @Description:
 */
public class SeasonEnumTest {
    
    @Test
    public void enumTest(){
        //values()函数方法返回所有枚举类所有实例
        for(SeasonEnum seasonEnum : SeasonEnum.values()){
            System.out.println(seasonEnum);
        }
        
        //compareTo()函数用与枚举对象比较顺序，只能与同一枚举类型对比，该枚举对象在之后，返回正数
        System.out.println(SeasonEnum.SPRING.compareTo(SeasonEnum.SUMMER));
        
        //ordinal()函数返回枚举类中的索引值
        System.out.println(SeasonEnum.SUMMER.ordinal());
    
    }
}