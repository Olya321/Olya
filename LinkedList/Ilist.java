public interface Ilist {

    public void clear() ;

    public int size();


    public int get(int index);


    public boolean add(int value);

    public boolean add(int index, int value) ;

    public int remove(int number) ;

    public int removeByIndex(int index);

    public boolean contains(int value) ;

    public boolean set(int index, int value);

    public void print();

    public int[] toArray();

    public boolean removeAll(int[] ar);}


