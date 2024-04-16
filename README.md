# SPRINT 1 - DELIVERY GUARDIAN

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

[Link_Video_Pitch](#_Link_Video_Pitch)

[Testes_API](#_Testes_API)

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


1. A criação dos Seguintes Repositorios :

   1. ClienteRepository
   2. DevolucaoRepository
   3. EmpresaRepository
   4. EnderecoRepository
   5. ProdutoRepository
   6. StatusPedidoSolicitanteRepository
   7. TelefoneRepository

2. A criação dos Seguintes Resources:

   1. **DevolucaoResource** - ROTAS e VERBOS:
      1. "localhost/devolucao" - GET.
      2. "localhost/devolucao" - POST.
      3."localhost/devolucao/{id}" - GET.
   
   2.**EmpresaResource** - ROTAS e VERBOS:
     1."localhost/empresa" - GET.
     2."localhost/empresa" - POST.
     3."localhost/empresa/{id}" - GET.
   
   3.**EnderecoResource** - ROTAS e VERBOS:
     1."localhost/endereco" - GET.
     2."localhost/endereco" - POST.
     3."localhost/endereco/{id}" - GET.

   4.**ProdutoResource** - ROTAS e VERBOS:
     1."localhost/produto" - GET.
     2."localhost/produto" - POST.
     3."localhost/produto/{id}" - GET.
   
   5.**StatusPedidoResource** - ROTAS e VERBOS:
    1."localhost/statuspedido" - GET.
    2."localhost/statuspedido" - POST.
    3."localhost/statuspedido/{id}" - GET.
   
   6.**TelefoneResource** - ROTAS e VERBOS:
     1."localhost/telefone" - GET.
     2."localhost/telefone" - POST.
     3."localhost/telefone/{id}" - GET.
   

<a id="#_Como_Acessar"></a>

# Como acessar
```shell
git clone https://github.com/caiquealm/Sprint_1_java && cd Sprint_1_java 
```

<a id="_Diagrama_de_Classes"></a>

# Diagrama de Classes
![foto-diagrama.PNG](diagrama_de_classe%2Ffoto-diagrama.PNG)

