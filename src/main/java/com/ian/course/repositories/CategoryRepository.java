package com.ian.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ian.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
