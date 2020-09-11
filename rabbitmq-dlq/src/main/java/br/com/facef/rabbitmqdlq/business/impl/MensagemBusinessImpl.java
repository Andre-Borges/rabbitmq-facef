package br.com.facef.rabbitmqdlq.business.impl;

import br.com.facef.rabbitmqdlq.business.MensagemBusiness;
import br.com.facef.rabbitmqdlq.model.Mensagem;
import br.com.facef.rabbitmqdlq.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MensagemBusinessImpl implements MensagemBusiness {

    private MensagemRepository mensagemRepository;

    @Override
    public Mensagem save(Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
}
