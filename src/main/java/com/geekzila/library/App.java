package com.geekzila.library;

import java.util.List;

import com.geekzila.library.model.Library;
import com.geekzila.library.service.LibraryService;
import com.geekzila.library.service.impl.LibraryServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		LibraryService libraryService = new LibraryServiceImpl();
		List<Library> libraries = libraryService.findAll();

		for (int i = 0; i < libraries.size(); i++) {
			Library library = libraries.get(i);
			System.out.println("Name: " + library.getName());
		}
	}
}
