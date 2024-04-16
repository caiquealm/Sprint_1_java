# 🔧🤓👍🏾 Benezinho Assitência Técnica 

CP I - **Java Advanced** aplicado em 13/03/2024.


|          | **Java Advanced** |
|------------------------------------------|-------------------|
|| **TURMA:** 2TDSPJ |
| **ALUNO:** Caique Almeida Dias | RM: 99778        |
| **ALUNO:** Giovanni Paschoalatto Ibelli | RM: 98837     |
| **ALUNO:** Vinicius Rebollo Minei | RM: 98486         |
| **ALUNO:** Sofia Sprocatti Silva | RM: 99208        |
| **ALUNO:** ANA CAROLINA TAVARES | RM: 552283       |


# Proposta da Solução


[Proposta da Solução ](#_Proposta_da_Solução)

[Diagrama de Classes ](#_Diagrama_de_Classes)

[Como Acessar ](#_Como_Acessar)

<a id="#_Proposta_da_Solução"></a>

# Estudo de caso


O negócio é fornecer soluções de Assistência Virtual para Clientes para
empresas B2B. Isso envolve desenvolver e implementar sistemas de suporte
automatizado e personalizado durante o processo de entrega de produtos ou
serviços. O objetivo é oferecer uma experiência superior ao cliente, fornecendo
respostas rápidas e precisas às consultas dos clientes, melhorando a eficiência
operacional e fortalecendo os relacionamentos comerciais entre empresas
fornecedoras e seus clientes.
A junção de uma IA generativa para uma conversa mais natural com os
clientes, e a análise profunda de dados para solucionar problemas específicos
de cada empresa, torna a relação menos burocrática e “travada” com os
clientes, ao mesmo tempo que soluciona cada problema de maneira única.


1. O Mapeamento Objeto Relacional das primeiras classes envolvidas neste projeto de software;

2. A criação automatizada das tabelas no banco de dados Oracle;

3. A persistência de todos os dados, e;

4. A criação dos Seguintes Repositorios :

   1. ChamadoRepository
   2. EnderecoRepository
   3. TelefoneRepository
   4. EspecialidadeRepository
   5. OcorrenciaRepository
   6. SolicitanteRepository
   7. TecnicoRepository

5. A criação dos Seguintes Resources:

   1. **ChamadoResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/chamado" - **GET**;
      2. "localhost/chamado" - **POST**
      3. "logalhost/chamado/{id}" - **GET**
    
   2. **EspecialidadeResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/especialidade" - **GET**;
      2. "localhost/especialidade" - **POST**
      3. "logalhost/especialidade/{id}" - **GET**
      
   3. **OcorrenciaResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/ocorrencia" - **GET**;
      2. "localhost/ocorrencia" - **POST**;
      3. "logalhost/ocorrencia/{id}" - **GET**

   4. **SolicitanteResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/solicitante" - **GET**;
      2. "localhost/solicitante" - **POST**;
      3. "logalhost/solicitante/{id}" - **GET**;
      4. "logalhost/solicitante/{id}/endereco" - **GET**
      5. "logalhost/solicitante/{id}/telefone" - **POST**;
      6. "logalhost/solicitante/{id}/telefone" - **GET**
      7. "logalhost/solicitante/{id}/endereco" - **POST**
     
   5. **TecnicoResource** com as seguintes ROTAS e VERBOS:
      1. "localhost/tecnico" - **GET**;
      2. "localhost/tecnico" - **POST**;
      3. "logalhost/tecnico/{id}" - **GET**;
      4. "logalhost/tecnico/{id}/especialidade - **POST**


<a id="#_Como_Acessar"></a>
```shell
git clone https://github.com/Benefrancis/spring-pj-chamados-tecnicos && cd spring-pj-chamados-tecnicos && git checkout correcao
```

<a id="_Diagrama_de_Classes"></a>

# Diagrama de Classes
![diagrama-de-classe-chamado-tecnico.png](documentacao%2Fdiagrama-de-classe-chamado-tecnico.png)

