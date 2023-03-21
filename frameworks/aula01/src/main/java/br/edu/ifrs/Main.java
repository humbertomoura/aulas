package br.edu.ifrs;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        System.out.println("teste...");

        EntityManagerFactory sf = Persistence.createEntityManagerFactory("aula01");

        EntityManager em = sf.createEntityManager();
        em.getTransaction().begin();

        ClienteBD maria = new ClienteBD();
        maria.setCpf("12345678901");
        maria.setNome("Maria");
        maria.setUf("RS");

        em.persist(maria);

        em.getTransaction().commit();
        em.close();
    }
}