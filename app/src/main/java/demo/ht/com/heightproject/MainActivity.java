package demo.ht.com.heightproject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import demo.ht.com.heightproject.adapters.PageAdapter;
import demo.ht.com.heightproject.fragments.AFragment;
import demo.ht.com.heightproject.fragments.BFragment;
import demo.ht.com.heightproject.fragments.CFragment;
import demo.ht.com.heightproject.fragments.DFragment;
import demo.ht.com.heightproject.fragments.EFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ViewPager mViewPager;
    private RelativeLayout rl1;
    private RelativeLayout rl2;
    private RelativeLayout rl3;
    private RelativeLayout rl4;
    private RelativeLayout rl5;
    PageAdapter pageAdapter;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initfondViewById();

        /*
         * 初始化PageView
         */
        initPageView();

    }

    private void initPageView() {
        list = new ArrayList<>();

        list.add(new AFragment());
        list.add(new BFragment());
        list.add(new CFragment());
        list.add(new DFragment());
        list.add(new EFragment());

        mViewPager.setAdapter(pageAdapter = new PageAdapter(getSupportFragmentManager(), list));

        pageAdapter.getCount();
    }

    private void initfondViewById() {
        mViewPager = findViewById(R.id.viewpage);
        rl1 = findViewById(R.id.rl1);
        rl2 = findViewById(R.id.rl2);
        rl3 = findViewById(R.id.rl3);
        rl4 = findViewById(R.id.rl4);
        rl5 = findViewById(R.id.rl5);
//

        rl1.setOnClickListener(this);
        rl2.setOnClickListener(this);
        rl3.setOnClickListener(this);
        rl4.setOnClickListener(this);
        rl5.setOnClickListener(this);
    }


    /*
        标识当前下标
     */
    int index = 0;

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.rl1:
                index = 0;
                break;
            case R.id.rl2:
                index = 1;
                break;
            case R.id.rl3:
                index = 2;
                break;
            case R.id.rl4:
                index = 3;
                break;
            case R.id.rl5:
                index = 4;
                break;
            default:
                break;
        }
        //设置ViewPager
        mViewPager.setCurrentItem(index);

    }

    private void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}