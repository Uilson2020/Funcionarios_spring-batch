package com.springbatchproject.springbatchusage.batch;

import com.springbatchproject.springbatchusage.model.Funcionarios;
import com.springbatchproject.springbatchusage.repository.FuncionariosRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FuncionariosWriter implements ItemWriter<Funcionarios> {

    @Autowired
    private FuncionariosRepository funcionariosRepository;

    @Override
    public void write(List<? extends Funcionarios> funcionarios) throws Exception {

        System.out.println("Data Saved for Funcionários: " + funcionarios);
        funcionariosRepository.saveAll(funcionarios);
    }
}
