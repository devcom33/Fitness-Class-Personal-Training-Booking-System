package org.heymouad.bookingmanagementsystem.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.Instant;
import java.util.UUID;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Attendance {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private UUID id;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Bookings booking;

    @CreatedDate
    private Instant attendanceAt;
}
