package extend;

import java.util.List;

public class Sort {
    public static void sort(List<Action> a, int left, int right) {
        if (left >= right)
            return;
        int center = (left + right) >> 1;
        //��ߵݹ����
        sort(a, left, center);
        //�ұߵݹ����
        sort(a, center + 1, right);
        //�ѽ���ϲ�
        merge(a, left, center, right);
    }
    public static void merge(List<Action> data, int left, int center, int right) {
    	Action[] tmpArr = new Action[right+1];
        int mid = center + 1;
        int index = left; // index��¼��ʱ���������
        int tmp = left;

        // ������������ȡ����С�ķ�������ʱ����
        while (left <= center && mid <= right) {
            tmpArr[index++] = (data.get(left).endtime <= data.get(mid).endtime) ? data.get(left++): data.get(mid++);
        }
        // ʣ�ಿ�����η�����ʱ����
        while (mid <= right) {
            tmpArr[index++] = data.get(mid++);
        }
        while (left <= center) {
            tmpArr[index++] = data.get(left++);
        }
        // ����ʱ�����е����ݸ��ƻ�ԭ����
        for (int i = tmp; i <= right; i++) {
            data.set(i, tmpArr[i]);
        }
    }
}

