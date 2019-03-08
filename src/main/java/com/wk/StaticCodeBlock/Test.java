package com.wk.StaticCodeBlock;

/**
 * @program: java_learning
 * @Date: 2019/3/8 15:56
 * @Author: Mr.Wang
 * @Description:
 */
public class Test {
    /**
     * 运行的结果是：
     * Root的静态代码块
     * Mid的静态代码块
     * Leaf的静态初始化代码块
     * Root的非静态代码块
     * Root的无参构造器
     * Mid的非静态代码块
     * Mid的无参构造器
     * Mid的有参数构造器，参数值是hahahahha
     * Leaf的非晶态的初始化代码块
     * Leaf的构造器
     * Root的非静态代码块
     * Root的无参构造器
     * Mid的非静态代码块
     * Mid的无参构造器
     * Mid的有参数构造器，参数值是hahahahha
     * Leaf的非晶态的初始化代码块
     * Leaf的构造器
     *
     *
     * 解释：12-14行，当执行leaf的实例化的时候，系统还没有leaf类，静态代码块从最顶端开始执行
     * 接下来15-28是两个循环（new了两个leaf），首先一个原则，初始化块始终在构造函数前面执行（其实初始化块可以理解为多个构造器共有初始化动作）
     * 继承、静态初始化块和非静态初始化块都是从最顶端执行到最低端
     * 同一个类的多个初始化块之间的执行顺序跟写的顺序是一样的
     * @param args
     */
    public static void main(String[] args) {
        new Leaf();
        new Leaf();
    }
}


class Root {
    
    static {
        System.out.println("Root的静态代码块");
    }
    {
        System.out.println("Root的非静态代码块");
    }
    public Root(){
        System.out.println("Root的无参构造器");
    }
}

class Mid extends Root{
    
    static {
        System.out.println("Mid的静态代码块");
    }
    {
        System.out.println("Mid的非静态代码块");
    }
    public Mid(){
        System.out.println("Mid的无参构造器");
    }
    public Mid(String msg) {
        //调用同一类中的构造器
        this();
        System.out.println("Mid的有参数构造器，参数值是" + msg);
    }
}

class Leaf extends Mid{
    static {
        System.out.println("Leaf的静态初始化代码块");
    }
    {
        System.out.println("Leaf的非晶态的初始化代码块");
    }
    public Leaf(){
        super("hahahahha");
        System.out.println("Leaf的构造器");
    }
}