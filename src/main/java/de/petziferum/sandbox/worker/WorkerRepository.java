package de.petziferum.sandbox.worker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, String> {

}
