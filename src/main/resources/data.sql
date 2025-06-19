INSERT INTO NUCLEOS_CONHECIMENTO (ID, DESCRICAO, NOME) VALUES
(1, 'Ciências Exatas e da Terra', 'Exatas'),
(2, 'Ciências Biológicas', 'Biológicas'),
(3, 'Engenharias', 'Engenharia'),
(4, 'Ciências da Saúde', 'Saúde'),
(5, 'Ciências Humanas', 'Humanas');
INSERT INTO DOCENTES (ID, INGRESSO, EMAIL, NOME, USUARIO) VALUES
   (1, '2015-03-01', 'ana.silva@exemplo.com', 'Ana Silva', 'ana.silva'),
   (2, '2016-07-15', 'bruno.souza@exemplo.com', 'Bruno Souza', 'bruno.souza'),
   (3, '2018-02-10', 'carla.martins@exemplo.com', 'Carla Martins', 'carla.martins'),
   (4, '2019-10-05', 'daniel.pereira@exemplo.com', 'Daniel Pereira', 'daniel.pereira'),
   (5, '2020-01-20', 'elisa.fernandes@exemplo.com', 'Elisa Fernandes', 'elisa.fernandes');
INSERT INTO DISCIPLINA (ID, CH_PRATICA, CH_Teorica, CH_TOTAL, MATRIZ, NUCLEO_ID) VALUES
 (1, 15, 30, 45, 2020, 1),
 (2, 10, 20, 30, 2020, 2),
 (3, 20, 40, 60, 2019, 3),
 (4, 0, 60, 60, 2021, 4),
 (5, 30, 30, 60, 2022, 5);
INSERT INTO DOCENTES_NUCLEOS_CONHECIMENTO (DOCENTE_ID, NUCLEOS_CONHECIMENTO_ID) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);
INSERT INTO NUCLEOS_CONHECIMENTO_DOCENTES (DOCENTES_ID, NUCLEO_CONHECIMENTO_ENTIDADE_ID) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5);
