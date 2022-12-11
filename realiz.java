public class realiz {
    static dz_6 test = new dz_6();

    public static void main(String[] args) {
        test.mapAdd(1);
        test.mapAdd(43);
        test.mapAdd(-1);
        test.mapAdd(123);
        test.mapAdd(35);
        System.out.println(test.mapSize());
        test.setFromMap();
        test.printSet();
    }
}
