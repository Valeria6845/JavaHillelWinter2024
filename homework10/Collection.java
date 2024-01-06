package homework10;

public interface Collection {
    boolean add(String o);
    boolean add(int index, String o);
    boolean delete(String o);
    String get(int index);
    boolean contain(String o);
    boolean equals1(CollectionImpl collection);
    boolean clear();
    int size();
}
