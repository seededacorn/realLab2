public abstract class HashTable {
    String[] hashTable;
    
    public HashTable(int size) {
        hashTable = new String[size];
    }

    public void insert(String key, String value) {
        int deposit = 0;
        
        for(int i = 0; i < hashTable.length; i++) {
            if(hashTable[i] == null && deposit == 0) {
                hashTable[i] = key;
                deposit++;
            } 
        }
    }

    public String get(String key) {
        String got = "";
        for(String i: hashTable) {
            if(i != null && i.equals(key)) {
                got = key;
            }
        }
        return got; 
    }

    abstract void delete(String key); 
}