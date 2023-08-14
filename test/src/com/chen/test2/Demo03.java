package com.chen.test2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;

/*
第3题：

现有如下两个数组，元素如下：
 数组a：{11, 33, 55, 77}
 数组b：{22, 44, 66, 88}
请编写程序，将两个数组合并为一个数组c；要求包含a、b数组的所有元素即可，无需排序。
即结果为：{11, 33, 55, 77, 22, 44, 66, 88}

增加难度：要排序，要去重。返回并集
 */
public class Demo03 {
    int i;
    public Demo03() {
    }

    public Demo03(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Demo03{" +
                "i=" + i +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo03 demo03 = (Demo03) o;
        return i == demo03.i;
    }

    @Override
    public int hashCode() {
        return Objects.hash(i);
    }
}
