package demo.ht.com.heightproject.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import demo.ht.com.heightproject.R;
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


        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}