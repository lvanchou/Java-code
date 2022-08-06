/**
 * 这是计算长方形面积和周长的工具
 * @author 周一凡
 * @version v1.0
 */

 public class cal{
    private int length;
    private int width;

    /**
     * 这是录入数据（长和宽）的方法
     * @param length 长
     * @param width 宽
     */
    public cal(int length, int width){
        this.length = length;
        this.width=width;
    }

    /**
     * 这是计算周长的方法
     * @return 周长
     */
    public int cri(){
        return (length +width)*2;
    }

    /**
     * 这是计算面积的方法
     * @return 面积
     */
    public int squ() {
        return length *width;
    }
}

