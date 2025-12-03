package org.heymouad.bookingmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructors")
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    /*
    @OneToMany
    @JoinColumn(name = "class_schedules_id")
    private ClassSchedules classSchedules;*/

    @Column(nullable = false)
    private String bio;
}
