package pe.edu.uni.educaapp.service.spec;

import java.util.List;

public interface CrudServiceSpec<T> {

    T read(int codigo);

    List<T> readAll();

    List<T> readAll(T model);

    void insert(T model);

    void update(T model);

    void delete(int codigo);
}
