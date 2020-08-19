package com.springbatchproject.springbatchusage.batch;

import com.springbatchproject.springbatchusage.model.Funcionarios;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FuncionariosProcessor implements ItemProcessor<Funcionarios, Funcionarios> {

    private static final Map<Integer, String> PROFISSOES_DESCRICAO = new HashMap<>();

    public FuncionariosProcessor() {
        PROFISSOES_DESCRICAO.put(1, "Atendente 1");
        PROFISSOES_DESCRICAO.put(2, "Atendente 2");
        PROFISSOES_DESCRICAO.put(3, "Farmacêutica");
        PROFISSOES_DESCRICAO.put(4, "Supervisora");
    }

    @Override
    public Funcionarios process(Funcionarios funcionarios) throws Exception {
        Integer codigoProfissao = funcionarios.getCodigoProfissao();
        String descricaoProfissao = PROFISSOES_DESCRICAO.get(codigoProfissao);
        funcionarios.setDescricaoProfissao(descricaoProfissao);

        System.out.println(String.format("Converted from [%s] to [%s]", codigoProfissao, descricaoProfissao));

        return funcionarios;
    }
}
