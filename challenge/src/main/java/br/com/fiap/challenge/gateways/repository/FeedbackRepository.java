package br.com.fiap.challenge.gateways.repository;

import br.com.fiap.challenge.domains.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {
    List<Feedback> findByClinicaUserUsername(String username);

}
