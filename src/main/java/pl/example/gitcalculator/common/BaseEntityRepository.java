package pl.example.gitcalculator.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import pl.example.gitcalculator.common.exception.ResourceNotFoundException;

import java.lang.reflect.ParameterizedType;

@NoRepositoryBean
public interface BaseEntityRepository<T> extends JpaRepository<T, Long>, JpaSpecificationExecutor<T> {
    default T findExactlyOneById(Long id) {
        return findById(id).orElseThrow(() -> new ResourceNotFoundException(handledEntityClass(), id));
    }

    default Class<T> handledEntityClass() {
        Class<?> repositoryInterface = (Class) getClass().getGenericInterfaces()[0];
        ParameterizedType baseEntityRepositoryInterface = (ParameterizedType) repositoryInterface.getGenericInterfaces()[0];
        @SuppressWarnings("unchecked")
        Class<T> handledEntityClass = (Class<T>) baseEntityRepositoryInterface.getActualTypeArguments()[0];
        return handledEntityClass;
    }
}
