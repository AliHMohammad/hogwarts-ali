package edu.hogwarts.data;

import java.util.List;

public interface SortAndFilter<T> {

    List<T> sort(String sortBy, String sortDir);
    List<T> filter(String filterBy);
    List<T> reverseList(List<T> list);
}
