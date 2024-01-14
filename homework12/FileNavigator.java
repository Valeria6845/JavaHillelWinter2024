package homework12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class FileNavigator {
    private HashMap<String, ArrayList<FileData>> fileMap = new HashMap<>();
    public boolean add(String path, int size, String name) {
        if (fileMap.get(path) == null) {
            fileMap.put(path, new ArrayList<FileData>());
            fileMap.get(path).add(new FileData(name, size, path));
        }else {
            fileMap.get(path).add(new FileData(name, size, path));
        }
        return true;
    }
    public ArrayList<FileData> find(String path) {
        return fileMap.get(path);
    }
    public ArrayList<FileData> filterBySize(int maxSize) {
        ArrayList<FileData> result = new ArrayList<>();
        for (String o: fileMap.keySet()) {
            for (FileData s: fileMap.get(o)) {
                if (s.getSize() <= maxSize) {
                    result.add(s);
                }
            }
        }
        return result;
    }
    public boolean remove (String path) {
        fileMap.remove(path);
        return true;
    }
    public ArrayList<FileData> sortBySize() {
        ArrayList<FileData> result = new ArrayList<>();
        for (String o: fileMap.keySet()) {
            for (FileData s: fileMap.get(o)) {
                result.add(s);
            }
        }
        result.sort(Comparator.comparing(FileData::getSize));
        return result;
    }
    public void print() {
        System.out.println(fileMap);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileNavigator that = (FileNavigator) o;
        return Objects.equals(fileMap, that.fileMap);
    }
    @Override
    public int hashCode() {
        return Objects.hash(fileMap);
    }
}
