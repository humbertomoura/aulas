package br.edu.ifrs.veranopolis.tads.aula04;

import br.edu.ifrs.veranopolis.tads.aula04.entity.*;
import br.edu.ifrs.veranopolis.tads.aula04.repository.ColaboradorRepository;
import br.edu.ifrs.veranopolis.tads.aula04.repository.MaterialRepository;
import br.edu.ifrs.veranopolis.tads.aula04.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PrincipalRunner implements CommandLineRunner {

    @Autowired
    ColaboradorRepository cr;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("Iniciando a aplicação...");

        Colaborador c1 = new Colaborador();
        c1.setNome("João da Silva");
        c1.setEspecialidade("Pintor");
        c1.setEmail("joao@gmail.com");
        c1.setFone("(54) 999989796");

        Colaborador c2 = new Colaborador();
        c2.setNome("Pedro de Souza");
        c2.setEspecialidade("Jardinagem");
        c2.setEmail("pedro@hotmail.com");
        c2.setFone("(51) 994567435");

        Colaborador c3 = new Colaborador();
        c3.setNome("Paulo de Assis");
        c3.setEspecialidade("Pintor");
        c3.setEmail("paulo@outlook.com");
        c3.setFone("(51) 9975478770");

        List<Colaborador> pintores = new ArrayList<Colaborador>();
        pintores.add(c1);
        pintores.add(c3);

        List<Colaborador> jardineiros = new ArrayList<Colaborador>();
        jardineiros.add(c2);




        Tarefa t1 = new Tarefa();
        t1.setNome("Pintar Parede");
        t1.setHorasPlanejadas(4);
        t1.setDataInicio(new Date());



        Tarefa t2 = new Tarefa();
        t2.setNome("Cortar Grama");
        t2.setHorasPlanejadas(2);
        t2.setDataInicio(new Date());


        Tarefa t3 = new Tarefa();
        t3.setNome("Pintar Porta");
        t3.setHorasPlanejadas(1);
        t3.setDataInicio(new Date());


        List<Tarefa> pinturas = new ArrayList<Tarefa>();
        pinturas.add(t1);
        pinturas.add(t3);

        List<Tarefa> jardinagem = new ArrayList<Tarefa>();
        jardinagem.add(t2);

        // atribuir as tarefas aos colaboradores
        c1.setTarefas(pinturas);
        c2.setTarefas(jardinagem);
        c3.setTarefas(pinturas);

        // Também atribuir colaboradores às tarefas por ser relacionamento bidirecional
        t1.setColaboradores(pintores);
        t2.setColaboradores(jardineiros);
        t3.setColaboradores(pintores);



        Material m1 = new Material();
        m1.setNome("Pincel");
        m1.setData(new Date());

        Material m2 = new Material();
        m2.setNome("Cortador de Grama");
        m2.setData(new Date());

        Material m3 = new Material();
        m3.setNome("Tinta Branca");
        m3.setData(new Date());

        Material m4 = new Material();
        m4.setNome("Tesoura");
        m4.setData(new Date());


        List<Material> materiaisPintura = new ArrayList<Material>();
        materiaisPintura.add(m1);
        materiaisPintura.add(m3);

        List<Material> materiaisCortarGrama = new ArrayList<Material>();
        materiaisCortarGrama.add(m2);
        materiaisCortarGrama.add(m4);


        c1.setMateriais(materiaisPintura);
        c2.setMateriais(materiaisCortarGrama);
        c3.setMateriais(materiaisPintura);

        m1.setColaborador(c1);
        m2.setColaborador(c2);
        m3.setColaborador(c3);
        m4.setColaborador(c2);


        // salva colaborador, tarefas e materiais em cascata
        cr.save(c1);
        cr.save(c2);
        cr.save(c3);


        // Aplicação do Console interativa

        Scanner teclado = new Scanner(System.in);

        System.out.println("-----Controle de Tarefas-----");

        System.out.print("Digite o id do colaborador: ");
        int id = teclado.nextInt();

        Colaborador colab = cr.findById(id).get();

        if (colab==null){
            System.out.print("Colaborador " + id + " não existe!");
            System.exit(0);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Exibindo tarefas do colaborador: " + colab.getId() + " - " + colab.getNome());
        System.out.println("----------------------------------------------------");
        for(Tarefa taf: colab.getTarefas()){
             System.out.println("Tarefa: " + taf.getNome());
        }
        System.out.println("----------------------------------------------------");

        System.out.println("Exibindo materiais do colaborador: " + colab.getId() + " - " + colab.getNome());
        System.out.println("----------------------------------------------------");
        for(Material mat: colab.getMateriais()){
            System.out.println("Material: " + mat.getNome());
        }
        System.out.println("----------------------------------------------------");

        teclado.close();




    }
}
