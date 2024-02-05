package edu.hogwarts.data;

import java.util.List;

public interface SortAndFilter<T> {

    public List<T> sort(List<T> arr, String sortDir, String sortBy);
    public List<T> filter(String filterBy);
}
