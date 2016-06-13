package adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.nianxin.github.animation.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import model.FoodModel;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class FoodAdapter extends BaseAdapter implements View.OnClickListener {

    private List<FoodModel> models;
    private Context context;
    private FoodActionCallback callback;


    public FoodAdapter(Context context, List<FoodModel> models, FoodActionCallback callback) {
        this.context = context;
        this.models = models;
        this.callback = callback;
    }


    @Override
    public int getCount() {
        return models.size();
    }

    @Override
    public Object getItem(int position) {
        return models.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item_food, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.tv_goods_fits_name.setText(models.get(position).getName());
        viewHolder.tv_goods_fits_price.setText(models.get(position).getDescription());
        Picasso.with(context)
                .load(models.get(position).getPath())
                .fit().centerCrop()
                .into(viewHolder.iv_goods_fits_picture);
        viewHolder.iv_goods_fits_add.setOnClickListener(this);
        return convertView;
    }

    @Override
    public void onClick(View v) {
        if(callback==null) return;
        callback.addAction(v);
    }

    public static class ViewHolder {
        TextView tv_goods_fits_name;
        TextView tv_goods_fits_price;
        ImageView iv_goods_fits_picture;
        ImageView iv_goods_fits_add;


        public ViewHolder(View convertView) {
            tv_goods_fits_name = (TextView) convertView.findViewById(R.id.tv_goods_fits_name);
            tv_goods_fits_price = (TextView) convertView.findViewById(R.id.tv_goods_fits_price);
            iv_goods_fits_picture = (ImageView) convertView.findViewById(R.id.iv_goods_fits_picture);
            iv_goods_fits_add = (ImageView) convertView.findViewById(R.id.iv_goods_fits_add);
        }
    }


    public interface FoodActionCallback {
        void addAction(View view);
    }


}
