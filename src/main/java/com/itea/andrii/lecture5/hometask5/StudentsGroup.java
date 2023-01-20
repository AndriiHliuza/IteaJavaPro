package com.itea.andrii.lecture5.hometask5;

import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class StudentsGroup extends LinkedList<Student> {
    private int groupSize = 10;

    public StudentsGroup() {

    }

    public StudentsGroup(int groupSize) {
        this.groupSize = groupSize;
    }

    /**
     * Adds student to the end of the StudentsGroup
     * @param student element whose presence in this collection is to be ensured
     * @return true if student was added successful
     *         false - if student was already in the studentsGroup
     *         or if studentsGroup is already full
     */
    @Override
    public boolean add(Student student) {
        return size() < groupSize && !contains(student) && super.add(student);
    }

    /**
     * Removes student from the end of the studentsGroup
     * @return true - if student was removed successful
     *         false - if studentsGroup is already empty
     */
    public boolean delete() {
        return pollLast() != null;
    }


    /**
     * Removes student from the studentsGroup
     * @param student student that should be removed from the studentsGroup
     * @return true - if student was removed successful
     *         false - if such student was not in the group
     */
    public boolean delete(Student student) {
        return remove(student);
    }

    /**
     * Finds students with the same surname as 'surname'
     * @param surname surname of the students that should be found in the studentsGroup
     * @return ArrayList of students with the same surname as 'surname',
     * or throws Exception if there are no students with the same surname as 'surname'
     */
    public List<Student> find(String surname) throws Exception {
        List<Student> students = stream()
                .filter(student -> student.getSurname().equals(surname))
                .toList();
        if (students.isEmpty()) {
            throw new Exception("Students weren't found");
        } else {
            return students;
        }
    }


    /**
     * Sorts students by name.
     * if names of students are equal, then sorts students by surname.
     * if names and surname of students are equal, then sorts students by rating. Students with the higher rating
     * will go first then the student with a lower rating.
     * @return sorted Arraylist of students in the studentsGroup
     */
    private List<Student> sort() {
        return stream()
                .sorted(Comparator.comparing(Student::getName, Collator.getInstance(new Locale("uk", "UA")))
                        .thenComparing(Student::getSurname, Collator.getInstance(new Locale("uk", "UA")))
                        .thenComparing(Comparator.comparing(Student::getRating).reversed()))
                .toList();
    }


    /**
     * Returns a string representation of the sorted studentsGroup
     * @return a string representation of the sorted studentsGroup
     */
    @Override
    public String toString() {
        return sort().stream()
                .map(Student::toString)
                .collect(Collectors.joining("\n"));
    }

    public int getGroupSize() {
        return groupSize;
    }

    public void setGroupSize(int groupSize) {
        this.groupSize = groupSize;
    }
}
