package com.chen.template;

public abstract class Demo01 {

    public final long getTime(){
        //获取开始的时间
        long start = System.currentTimeMillis();
        //代码运行.,需要调用者来写
        code();
        //获取结束的时间
        long end = System.currentTimeMillis();
        //两者相减,输出返回值
        return end - start;
    }

    public abstract void code();
    //让子类实现
}
