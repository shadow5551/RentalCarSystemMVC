package validation;

/**
 * Created by dima on 4.5.17.
 */
public interface Validatable<T> {
    boolean validate(T object);
}
