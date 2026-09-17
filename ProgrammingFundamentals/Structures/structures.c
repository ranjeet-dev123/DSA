#include <stdio.h>

struct Student {
    int id;
    char name[50];
    float marks;
};

int main() {
    struct Student student;

    student.id = 101;

    snprintf(student.name, sizeof(student.name), "Ranjeet");

    student.marks = 84.5;

    printf("ID: %d\n", student.id);
    printf("Name: %s\n", student.name);
    printf("Marks: %.2f\n", student.marks);

    return 0;
}