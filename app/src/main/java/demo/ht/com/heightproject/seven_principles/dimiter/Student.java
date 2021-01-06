package demo.ht.com.heightproject.seven_principles.dimiter;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 86177
 * @ClassName Student
 * 作者: szj
 * 时间: 2021/1/6 9:23
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class Student{
    String name = "";

    /**
     *    用来存储所有学生名字
     */
    ArrayList<String> mList = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    /**
     *
     * @return 遵守迪米特原则 创建10个学生
     */
    public List<String> newStudentName(){
        for (int i = 0; i < 10; i++) {
            mList.add(name+i);
            Log.i("dimiter:","现在是第 "+i+"个学生,名字为: "+mList.get(i));
        }
        return mList;
    }
}
