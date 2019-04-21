package com.geekzila.library.service;

import java.util.List;

import com.geekzila.library.model.Library;

public interface LibraryService {
	public void add(Library library);
	public List<Library> findAll();
}
