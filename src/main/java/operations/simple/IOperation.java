package operations.simple;





import java.io.Serializable;

/**
 * Created by Rakovskyi Dmytro on 23.03.2017.
 */
public interface IOperation<T> extends Serializable {
   T performOperation(T  first, T second);
}
