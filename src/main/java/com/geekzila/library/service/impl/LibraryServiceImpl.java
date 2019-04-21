package com.geekzila.library.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.geekzila.library.model.Library;
import com.geekzila.library.service.LibraryService;

public class LibraryServiceImpl implements LibraryService {

	public List<Library> libraries = new ArrayList<Library>();

	public LibraryServiceImpl() {
		libraries.add(new Library("Rakesh Library"));
		libraries.add(new Library("Aruv Library"));
	}

	public void add(Library library) {
		// TODO Auto-generated method stub
		libraries.add(library);

	}

	public List<Library> findAll() {
		// TODO Auto-generated method stub
		return libraries;
	}

}
