#include <stdio.h>

#define TABLE_SIZE 10
#define EMPTY -1

// Hash function
int hashFunction(int key)
{
    return key % TABLE_SIZE;
}

// Insert key using linear probing
void insert(int hashTable[], int key)
{
    int index = hashFunction(key);
    int originalIndex = index;

    while (hashTable[index] != EMPTY)
    {
        index = (index + 1) % TABLE_SIZE;

        // Hash table is full
        if (index == originalIndex)
        {
            printf("Hash table is full. Cannot insert %d\n", key);
            return;
        }
    }

    hashTable[index] = key;
    printf("%d inserted at index %d\n", key, index);
}

// Search key using linear probing
int search(int hashTable[], int key)
{
    int index = hashFunction(key);
    int originalIndex = index;

    while (hashTable[index] != EMPTY)
    {
        if (hashTable[index] == key)
        {
            return index;
        }

        index = (index + 1) % TABLE_SIZE;

        // Completed one full cycle
        if (index == originalIndex)
        {
            break;
        }
    }

    return -1;
}

// Display hash table
void display(int hashTable[])
{
    printf("\nHash Table:\n");

    for (int i = 0; i < TABLE_SIZE; i++)
    {
        if (hashTable[i] == EMPTY)
        {
            printf("Index %d : EMPTY\n", i);
        }
        else
        {
            printf("Index %d : %d\n", i, hashTable[i]);
        }
    }
}

int main()
{
    int hashTable[TABLE_SIZE];

    // Initialize hash table
    for (int i = 0; i < TABLE_SIZE; i++)
    {
        hashTable[i] = EMPTY;
    }

    // Insert elements
    insert(hashTable, 25);
    insert(hashTable, 35);
    insert(hashTable, 45);
    insert(hashTable, 12);
    insert(hashTable, 22);

    display(hashTable);

    // Search elements
    int key = 35;
    int result = search(hashTable, key);

    if (result != -1)
    {
        printf("\n%d found at index %d\n", key, result);
    }
    else
    {
        printf("\n%d not found\n", key);
    }

    return 0;
}