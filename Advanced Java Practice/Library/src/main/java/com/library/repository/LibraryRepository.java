package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.entities.Library;

public interface LibraryRepository extends JpaRepository<Library, Long> {
	Library findByName(String name);
}
