package br.com.fiap.challenge.service.impl;

import br.com.fiap.challenge.domains.Consulta;
import br.com.fiap.challenge.gateways.repository.ConsultaRepository;
import br.com.fiap.challenge.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ConsultaServiceImpl implements ConsultaService {

    private final ConsultaRepository consultaRepository;

    @Override
    public Consulta criar(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @Override
    public Optional<Consulta> buscarPorId(Integer id) {
        return consultaRepository.findById(id);
    }

    @Override
    public List<Consulta> buscarTodas() {
        return consultaRepository.findAll();
    }

    @Override
    public Optional<Consulta> atualizar(Integer id, Consulta consulta) {
        return consultaRepository.findById(id).map(consultaExistente -> {
            consulta.setIdConsulta(id);
            return consultaRepository.save(consulta);
        });
    }

    @Override
    public List<Consulta> buscarPorDentista(Integer id) {
        return consultaRepository.findAllByDentistaIdDentista(id);
    }

    @Override
    public boolean deletar(Integer id) {
        return consultaRepository.findById(id).map(consulta -> {
            consultaRepository.deleteById(id);
            return true;
        }).orElse(false);
    }

    @Override
    public void alterarStatus(Integer id) {
        Consulta consulta = consultaRepository.findById(id).orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
        if (consulta.getStatusConsulta() == null || consulta.getStatusConsulta() == 'N') {
            consulta.setStatusConsulta('S');
        } else {
            consulta.setStatusConsulta('N');
        }
        consultaRepository.save(consulta);
    }
}
