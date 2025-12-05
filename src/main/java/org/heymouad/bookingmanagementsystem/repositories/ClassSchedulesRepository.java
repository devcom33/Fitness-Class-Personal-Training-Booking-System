package org.heymouad.bookingmanagementsystem.repositories;

import org.heymouad.bookingmanagementsystem.entities.ClassSchedules;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClassSchedulesRepository extends JpaRepository<ClassSchedules, UUID> {
}
