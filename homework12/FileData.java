package homework12;

public class FileData {
    private String name;
    private int size;
    private String path;

    public int getSize() {
        return size;
    }
    public FileData(String name, int size, String path) {
        this.name = name;
        this.size = size;
        this.path = path;
    }

    @Override
    public String toString() {
        return "FileData{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
