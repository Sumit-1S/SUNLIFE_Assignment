package com.demo3.inter;

import java.util.Optional;

import com.demo3.model.School;

@FunctionalInterface
public interface SchoolDAO {
	public void displayDetails(Optional<School> school);
}
