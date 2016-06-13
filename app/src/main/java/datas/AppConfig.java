package datas;

import com.nianxin.github.animation.R;

import java.util.ArrayList;
import java.util.List;

import model.FoodModel;

/**
 * Created by liuhuiliang on 16/6/13.
 */
public class AppConfig {

    public static List<String> factoryDatas() {
        List<String> datas = new ArrayList<>();
        datas.add("百度贴吧实例");
        datas.add("补位动画实例");
        datas.add("属性动画4对象实例");
        datas.add("属性动画4控件实例");
        datas.add("购物车动画实例");
        return datas;
    }


    public static List<FoodModel> factoryFoods() {
        List<FoodModel> datas = new ArrayList<>();
        datas.add(new FoodModel("短头发11", R.drawable.imag1, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag2, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag3, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag4, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag5, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag6, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag7, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag8, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag9, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag10, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag11, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag12, "两侧和后部头发较"));
        datas.add(new FoodModel("短头发11", R.drawable.imag13, "两侧和后部头发较"));
        return datas;
    }

}
