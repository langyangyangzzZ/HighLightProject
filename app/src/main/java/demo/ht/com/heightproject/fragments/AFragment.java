package demo.ht.com.heightproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.ht.com.heightproject.R;
import demo.ht.com.heightproject.seven_principles.inversion.Information;
import demo.ht.com.heightproject.seven_principles.inversion.InversionBean;
import demo.ht.com.heightproject.seven_principles.inversion.QQNews;
import demo.ht.com.heightproject.seven_principles.inversion.WeChatNews;
import demo.ht.com.heightproject.seven_principles.li_replace.ReplaceA;
import demo.ht.com.heightproject.seven_principles.li_replace.ReplaceB;
import demo.ht.com.heightproject.seven_principles.quarantine.QuarantineA;
import demo.ht.com.heightproject.seven_principles.quarantine.QuarantineB;
import demo.ht.com.heightproject.seven_principles.quarantine.QuarantineC;
import demo.ht.com.heightproject.seven_principles.quarantine.QuarantineD;
import demo.ht.com.heightproject.seven_principles.single.SingleBean;
import demo.ht.com.heightproject.seven_principles.single.SingleBean2;

public class AFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //单一职责原则
        SingleBean singleBean = new SingleBean();
        singleBean.run("小明");
        SingleBean2 singleBean2 = new SingleBean2();
        singleBean2.run("钢铁侠");

        //接口隔离原则
        QuarantineA quarantineA = new QuarantineA();
        quarantineA.run(new QuarantineB());
        QuarantineC quarantineC = new QuarantineC();
        quarantineC.run(new QuarantineD());

        //依赖倒置原则
        InversionBean inversionBean = new InversionBean();
        inversionBean.run(new QQNews());
        inversionBean.run(new WeChatNews());

        Information information = new Information();
        information.setIinversion(new QQNews());
        information.showInfo();

        //里氏替换原则
        ReplaceA replaceA = new ReplaceA();
        ReplaceB replaceB = new ReplaceB();

        Log.i("LiReplace","2 + 3 = "+replaceA.show(2,3)+"");
        Log.i("LiReplace","2 + 3 = "+replaceB.show(2,3)+"");
        Log.i("LiReplace","2 + 3 = "+replaceB.useAshow(2,3));


        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}