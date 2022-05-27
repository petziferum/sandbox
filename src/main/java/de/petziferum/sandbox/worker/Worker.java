package de.petziferum.sandbox.worker;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="workers")
@Getter
@Setter
@Data
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String firstName;
    private String lastName;
    private String skill;
}
