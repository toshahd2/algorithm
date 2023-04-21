public class lesson3_hw {

    public static void main(String[] args) {
        ListNode node = new ListNode(3, new ListNode(1, new ListNode(2, new ListNode(4))));
        System.out.println(size(node));
        System.out.println(asString(node));

        System.out.println(getByIndex(node, 1));
    }

    static class ListNode {
        int value;
        ListNode next;

        public ListNode(int value) {
            this.value = value;
        }

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    /**
     * Посчитать размер списка.
     */
    static int size(ListNode head) {
        ListNode iter = head;
        int count = 1;
        while (iter.next != null) {
            count++;
            iter = iter.next;
        }
        return count;
    }

    /**
     * Написать строковое представление списка в формате
     * [first_value -> second_value -> ... -> last_value]
     */
    static String asString(ListNode head) {
        ListNode iter = head;
        String sep =" -> ";
        StringBuilder str = new StringBuilder();
        str.append("[");
        while (iter != null) {
            str.append(iter.value);
            if (iter.next != null) {
                str.append(sep);
            }
            iter = iter.next;
        }
        str.append("]");
        String res = str.toString();
        return res;
    }

    /**
     * Найти значение по индексу
     */
    static int getByIndex(ListNode head, int index) {
        int sizeList = size(head);
        ListNode iter = head;
        if (index >= sizeList) throw new IndexOutOfBoundsException();
        else {
            for (int i = 0; i < sizeList; i++) {
                if (i == index) {
                    break;
                } else {
                    iter = iter.next;
                }
            }
        }
        return iter.value;
    }

}
