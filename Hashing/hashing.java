public class hashing {

    static final int TABLE_SIZE = 10;
    static final int EMPTY = -1;

    // Hash function
    static int hashFunction(int key) {
        return key % TABLE_SIZE;
    }

    // Insert key using linear probing
    static void insert(int[] hashTable, int key) {

        int index = hashFunction(key);
        int originalIndex = index;

        while (hashTable[index] != EMPTY) {

            index = (index + 1) % TABLE_SIZE;

            // Hash table is full
            if (index == originalIndex) {
                System.out.println(
                    "Hash table is full. Cannot insert " + key
                );
                return;
            }
        }

        hashTable[index] = key;

        System.out.println(
            key + " inserted at index " + index
        );
    }

    // Search key using linear probing
    static int search(int[] hashTable, int key) {

        int index = hashFunction(key);
        int originalIndex = index;

        while (hashTable[index] != EMPTY) {

            if (hashTable[index] == key) {
                return index;
            }

            index = (index + 1) % TABLE_SIZE;

            // Completed one full cycle
            if (index == originalIndex) {
                break;
            }
        }

        return -1;
    }

    // Display hash table
    static void display(int[] hashTable) {

        System.out.println("\nHash Table:");

        for (int i = 0; i < TABLE_SIZE; i++) {

            if (hashTable[i] == EMPTY) {
                System.out.println("Index " + i + " : EMPTY");
            } else {
                System.out.println(
                    "Index " + i + " : " + hashTable[i]
                );
            }
        }
    }

    public static void main(String[] args) {

        int[] hashTable = new int[TABLE_SIZE];

        // Initialize hash table
        for (int i = 0; i < TABLE_SIZE; i++) {
            hashTable[i] = EMPTY;
        }

        // Insert elements
        insert(hashTable, 25);
        insert(hashTable, 35);
        insert(hashTable, 45);
        insert(hashTable, 12);
        insert(hashTable, 22);

        display(hashTable);

        // Search element
        int key = 35;
        int result = search(hashTable, key);

        if (result != -1) {
            System.out.println(
                "\n" + key + " found at index " + result
            );
        } else {
            System.out.println(
                "\n" + key + " not found"
            );
        }
    }
}