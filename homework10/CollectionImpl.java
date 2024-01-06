package homework10;

public class CollectionImpl implements Collection{
    public String[] arr;
    public int size;
    public CollectionImpl() {
        arr = new String[0];
    }
    @Override
    public boolean add(String o) {
        boolean marker = false;
        if (size == arr.length) {
            String[] arr1 = new String[arr.length+1];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
            arr[size++] = o;
            size = arr.length;
            marker = true;
        }
        return marker;
    }
    @Override
    public boolean add(int index, String o) {
        if (arr.length-1 < index) {
            String[] arr1 = new String[index+1];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
            arr[index] = o;
            size = arr.length;
            return true;
        } else {
            String[] arr1 = new String[arr.length+1];
            if (index >= 0)
                System.arraycopy(arr, 0, arr1, 0, index);
            if (arr1.length-1-index >= 0)
                System.arraycopy(arr, index, arr1, index + 1, arr1.length-1-index);
            arr1[index] = o;
            arr = arr1;
            size = arr.length;
            return true;
        }
    }
    @Override
    public boolean delete(String o) {
        String[] arr1 = new String[arr.length-1];
        if (o.equals(arr[arr.length-1])) {
            System.arraycopy(arr, 0, arr1, 0, arr1.length);
        }else if (o.equals(arr[0])) {
            System.arraycopy(arr, 1, arr1, 0, arr1.length);
        }else {
            for (int i = 0; i < arr.length; i++) {
                if (o.equals(arr[i])) {
                    System.arraycopy(arr, 0, arr1, 0, i);
                    arr1[0] = arr[0];
                    if (arr.length-1 - i > 1) {
                        System.arraycopy(arr, i + 1, arr1, i, arr1.length - 1);
                        break;
                    }else {
                        arr1[arr1.length-1] = arr[arr.length-1];
                        break;
                    }
                }
            }
        }
        arr = arr1;
        size = arr.length;
        return true;
    }
    @Override
    public String get(int index) {
        if (index > 0 && index <= arr.length-1) {
            return arr[index];
        }else {
            return "Out of range";
        }
    }
    @Override
    public boolean contain(String o) {
        for (String a: arr) {
            if (a == o) {
                return true;
            }
        }
        return false;
    }
    @Override
    public boolean equals1(CollectionImpl collection) {
        boolean check = false;
        int counter = 0;
        if (collection.size == this.size) {
            for (int i = 0; i < arr.length; i++) {
                if (collection.arr[i].equals(this.arr[i])) {
                    counter++;
                }
            }
            if (counter == size) {
                check = true;
            }
        }
        return check;
    }
    @Override
    public boolean clear() {
        arr = new String[0];
        size = 0;
        return true;
    }
    @Override
    public int size() {
        return this.size;
    }
}
