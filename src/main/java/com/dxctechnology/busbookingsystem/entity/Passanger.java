package com.dxctechnology.busbookingsystem.entity;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "passanger")
public class Passanger {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "passanger_seq")
    @SequenceGenerator(name = "passanger_seq")
    @Column(name = "id", nullable = false)
    private Integer id;

    public static void main(String[] args) {

    }
}