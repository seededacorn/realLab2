public class main {
    public static void main(String[] args) {
        HashTable a = new RelocateHashTable(4); 
        a.insert("hello", "0");
        a.insert("goodbye", "0");
        a.insert("bon voyage", "0");
        a.insert("triage", "0");
        System.out.println(a.get("triage"));
    }
}
