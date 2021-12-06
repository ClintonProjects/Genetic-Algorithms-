package AbstractFactory;

public interface AbstractFactory<T> {
	T create(String gaType);
}
