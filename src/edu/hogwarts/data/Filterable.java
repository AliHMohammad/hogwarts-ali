package edu.hogwarts.data;

import java.util.List;

public interface Filterable<T> {


    List<T> filter(String filterBy);

}
