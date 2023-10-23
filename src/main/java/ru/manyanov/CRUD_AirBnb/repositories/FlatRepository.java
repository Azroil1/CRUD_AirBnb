package ru.manyanov.CRUD_AirBnb.repositories;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.manyanov.CRUD_AirBnb.models.Flat;

public interface FlatRepository extends JpaRepository<Flat, Integer> {
}
