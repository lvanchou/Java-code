/**
 * ���Ǽ��㳤����������ܳ��Ĺ���
 * @author ��һ��
 * @version v1.0
 */

 public class cal{
    private int length;
    private int width;

    /**
     * ����¼�����ݣ����Ϳ��ķ���
     * @param length ��
     * @param width ��
     */
    public cal(int length, int width){
        this.length = length;
        this.width=width;
    }

    /**
     * ���Ǽ����ܳ��ķ���
     * @return �ܳ�
     */
    public int cri(){
        return (length +width)*2;
    }

    /**
     * ���Ǽ�������ķ���
     * @return ���
     */
    public int squ() {
        return length *width;
    }
}

