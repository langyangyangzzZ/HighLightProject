package demo.ht.com.heightproject.beans;

/**
 * @author 86177
 * @ClassName BusinessBean
 * 作者: szj
 * 时间: 2020/12/18 17:12
 * CSDN:https://blog.csdn.net/weixin_44819566
 * 公众号:码上变有钱
 */

//商家类
public class BusinessBean {
    String name;
    boolean ischeck;

    @Override
    public String toString() {
        return "BusinessBean{" +
                "name='" + name + '\'' +
                ", ischeck=" + ischeck +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIscheck() {
        return ischeck;
    }

    public void setIscheck(boolean ischeck) {
        this.ischeck = ischeck;
    }

    //商品
    static class CommodityBean{
        String name;//商品名称
        double price;//价格

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

}
