package br.edu.ifrs.veranopolis.tads.aula02;

import br.edu.ifrs.veranopolis.tads.aula02.entity.Cliente;
import br.edu.ifrs.veranopolis.tads.aula02.entity.Endereco;
import br.edu.ifrs.veranopolis.tads.aula02.repository.ClienteRepository;
import br.edu.ifrs.veranopolis.tads.aula02.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class PrincipalRunner implements CommandLineRunner {

    @Autowired
    ClienteRepository cr;
    @Autowired
    EnderecoRepository er;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando a aplicação...");

        Cliente c = new Cliente();
        c.setNome("João da Silva");
        c.setCpf("76543678926");
        c.setEmail("joao@gmail.com");
        c.setFone("(54) 999989796");

        Endereco e = new Endereco();
        e.setLogradouro("Rua Principal");
        e.setNumero(45);
        e.setComplemento("Ap. 12");
        e.setBairro("Centro");
        e.setCidade("Veranópolis");
        e.setUf("RS");

        c.setEndereco(e);

        cr.save(c);
    }
}
