package apple.springmvc.servlet3.async;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2017-01-06 00:13
 */
public interface AsyncTaskCallback {

    void notify(Object result);
}
