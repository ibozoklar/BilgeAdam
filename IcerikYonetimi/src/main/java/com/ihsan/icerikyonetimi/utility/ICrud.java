package com.ihsan.icerikyonetimi.utility;

import java.util.List;
import java.util.Optional;

public interface ICrud<T, ID> extends IRepository<T, ID> {

	<S extends T> S save(S entity); // tek kayit ekleme ve guncelleme

	<S extends T> Iterable<S> save(Iterable<S> entities); // liste seklinde

	void deleteById(ID id);

	void delete(T entity);

	Optional<T> findById(ID id);

	boolean existById(ID id);

	List<T> findAll();

	List<T> finByCollumnAndValue(String collumn, Object value);// verilen kolonu verilen degere gorelisteler

	List<T> findByEntity(T entity);

	void update(T t);

}
