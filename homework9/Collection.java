package homework9;

public class Collection {
    public String[] arr;
    public Integer size;
    public Collection(Integer size) {
        this.size = size;
        arr = new String[this.size];
    }
    private void extendArr() {
        String[] arr1 = new String[arr.length+1];
        System.arraycopy(arr, 0, arr1, 0, arr.length);
        arr = arr1;
    }
    public boolean add(int index, String value) {
        if (arr.length-1 < index) {
            String[] arr1 = new String[index+1];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            arr = arr1;
            arr[index] = value;
            size = arr.length;
            return true;
        } else {
            String[] arr1 = new String[arr.length+1];
            if (index >= 0)
                System.arraycopy(arr, 0, arr1, 0, index);
            if (arr1.length-1-index >= 0)
                System.arraycopy(arr, index, arr1, index + 1, arr1.length-1-index);
            arr1[index] = value;
            arr = arr1;
            size = arr.length;
            return true;
        }
    }
    public boolean add(String value) {
        boolean marker = false;
        if (size == arr.length) {
            extendArr();
            arr[size++] = value;
            marker = true;
        }
        return marker;
    }
    public boolean delete(int index) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length-1].equals(arr[index])) {
                break;
            }
            String a = arr[index+i+1];
            arr[index+i+1] = arr[index+i];
            arr[index+i] = a;
        }
        String[] arr1 = new String[arr.length-1];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        arr = arr1;
        return true;
    }
    public boolean delete(String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[arr.length-1].equals(value)) {
                break;
            }else if (arr[i] == null) {
                continue;
            }else if (arr[i].equals(value)) {
                String a = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = a;
            }
        }
        String[] arr1 = new String[arr.length-1];
        System.arraycopy(arr, 0, arr1, 0, arr1.length);
        arr = arr1;
        return true;
    }
    public String get(int index) {
        if (index > 0 && index <= arr.length-1) {
            return arr[index];
        }else {
            return "Out of range";
        }
    }
}
