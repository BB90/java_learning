package com.wk.Const;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @program: java_learning
 * @Date: 2019/3/7 15:54
 * @Author: Mr.Wang
 * @Description:
 */

/**
 * 每个枚举类实例可拥有多个字段
 */
public class GenderEnumTest {
    
    @Test
    public void getName() {
        System.out.println(GenderEnum.MALE.getName());
    }
    
    @Test
    public void getDesc() {
        System.out.println(GenderEnum.FEMALE.getDesc());
    }
}