package Array;
public class myArray {
    private int[] items;
    private int currentIndex;

    public myArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insert(int value) {
        this.items[currentIndex] = value;
        currentIndex++;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < this.currentIndex; i++) {
            str.append(items[i] + ", ");
        }
        str.append('\b').append('\b').append("]");
        return str.toString();
    }
    
    public int indexOf(int value) {
        for (int i = 0; i <= this.currentIndex; i++) {
            if (this.items[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {
        if (index >= currentIndex)
            throw new IllegalArgumentException();
        for (int i = index; i <= this.currentIndex - 2; i++) {
            this.items[i] = this.items[i + 1];
        }
        currentIndex--;
        this.items[currentIndex] = 0;
    }

    public int max() {
        int result = this.items[0];
        for (int i = 0; i <= this.currentIndex; i++) {
            if (items[i] > result) {
                result = items[i];
            }
        }
        return result;
    }
}
