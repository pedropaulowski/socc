package com.ufg.socc;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        entityManager.createNativeQuery("INSERT INTO NUCLEOS_CONHECIMENTO (ID, NOME, DESCRICAO) VALUES (1, 'Teoria da Computação', 'Fundamentos teóricos e modelos de computação')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO NUCLEOS_CONHECIMENTO (ID, NOME, DESCRICAO) VALUES (2, 'Banco de Dados', 'Modelagem e gerenciamento de bancos de dados')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO NUCLEOS_CONHECIMENTO (ID, NOME, DESCRICAO) VALUES (3, 'Engenharia de Software', 'Processos e práticas de desenvolvimento de software')").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DOCENTES (ID, NOME, USUARIO, EMAIL, INGRESSO) VALUES (1, 'Ana Souza', 'asouza', 'ana.souza@universidade.br', '2018-02-15')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DOCENTES (ID, NOME, USUARIO, EMAIL, INGRESSO) VALUES (2, 'Bruno Lima', 'blima', 'bruno.lima@universidade.br', '2019-08-01')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DOCENTES (ID, NOME, USUARIO, EMAIL, INGRESSO) VALUES (3, 'Carla Mendes', 'cmendes', 'carla.mendes@universidade.br', '2020-03-10')").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DISCIPLINA (ID, NOME, CH_PRATICA, CH_TEORICA, CH_TOTAL, MATRIZ, NUCLEO_ID) VALUES (1, 'Algoritmos e Estruturas de Dados', 30, 60, 90, 2021, 1)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA (ID, NOME, CH_PRATICA, CH_TEORICA, CH_TOTAL, MATRIZ, NUCLEO_ID) VALUES (2, 'Modelagem de Dados', 20, 40, 60, 2021, 2)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA (ID, NOME, CH_PRATICA, CH_TEORICA, CH_TOTAL, MATRIZ, NUCLEO_ID) VALUES (3, 'Engenharia de Requisitos', 15, 30, 45, 2021, 3)").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DISCIPLINA_NUCLEOS_CONHECIMENTO (DISCIPLINA_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (1, 1)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA_NUCLEOS_CONHECIMENTO (DISCIPLINA_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (2, 2)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA_NUCLEOS_CONHECIMENTO (DISCIPLINA_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (3, 3)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA_NUCLEOS_CONHECIMENTO (DISCIPLINA_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (1, 2)").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (1, 1)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (2, 2)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (3, 3)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (1, 3)").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO NUCLEOS_CONHECIMENTO (ID, NOME, DESCRICAO) VALUES (4, 'Inteligência Artificial', 'Estudo de agentes inteligentes e aprendizado de máquina')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO NUCLEOS_CONHECIMENTO (ID, NOME, DESCRICAO) VALUES (5, 'Redes de Computadores', 'Conceitos de comunicação e protocolos de rede')").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DOCENTES (ID, NOME, USUARIO, EMAIL, INGRESSO) VALUES (4, 'Diego Pereira', 'dpereira', 'diego.pereira@universidade.br', '2021-01-20')").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DOCENTES (ID, NOME, USUARIO, EMAIL, INGRESSO) VALUES (5, 'Elisa Ramos', 'eramos', 'elisa.ramos@universidade.br', '2022-09-10')").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DISCIPLINA (ID, NOME, CH_PRATICA, CH_TEORICA, CH_TOTAL, MATRIZ, NUCLEO_ID) VALUES (4, 'Aprendizado de Máquina', 30, 30, 60, 2021, 4)").executeUpdate();
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA (ID, NOME, CH_PRATICA, CH_TEORICA, CH_TOTAL, MATRIZ, NUCLEO_ID) VALUES (5, 'Segurança de Redes', 20, 40, 60, 2021, 5)").executeUpdate();

        entityManager.createNativeQuery("INSERT INTO DISCIPLINA_NUCLEOS_CONHECIMENTO (DISCIPLINA_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (4, 1)").executeUpdate(); // Aprendizado de Máquina também relacionado à Teoria
        entityManager.createNativeQuery("INSERT INTO DISCIPLINA_NUCLEOS_CONHECIMENTO (DISCIPLINA_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (5, 2)").executeUpdate(); // Segurança de Redes também ligada a BD

        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (4, 4)").executeUpdate(); // Diego → IA
        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (4, 1)").executeUpdate(); // Diego → Teoria
        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (5, 5)").executeUpdate(); // Elisa → Redes
        entityManager.createNativeQuery("INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES (5, 2)").executeUpdate(); // Elisa → BD

    }
}

