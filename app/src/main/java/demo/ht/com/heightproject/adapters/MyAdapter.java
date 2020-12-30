package demo.ht.com.heightproject.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import demo.ht.com.heightproject.R;
import demo.ht.com.heightproject.beans.BusinessBean;

/**
 * @ClassName MyAdapter
 * 作者: szj
 * 时间: 2020/12/18 17:23
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */
public class MyAdapter  extends RecyclerView.Adapter {
    public List<BusinessBean> mList = new ArrayList<>();
    public Context mContext;

    public MyAdapter(List<BusinessBean> mList, Context mContext) {
        this.mList = mList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(mContext).inflate(R.layout.adapter_items, null);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ViewHolder viewHolder = (ViewHolder) holder;
        viewHolder.tv.setText(mList.get(position).getName()+"");

        initRelItem(viewHolder);
    }

    private void initRelItem(ViewHolder viewHolder) {


    }


    static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView tv;
        private final CheckBox cb;
        private final RecyclerView relItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv = itemView.findViewById(R.id.tv);
            cb = itemView.findViewById(R.id.cb);
            relItem = itemView.findViewById(R.id.relItem);

        }
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

}
