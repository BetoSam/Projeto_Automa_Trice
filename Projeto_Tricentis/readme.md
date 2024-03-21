# Framework para automatizar testes de UI


Este projeto executa testes de UI no site sampleapp.tricentis.com/ com Selenium 

## Tecnologia utilizadas
- Java
- Selenium
- Junit


## Configuração do ambiente
Para executar esse projeto é necessário as configurações das variáveis de ambiente 
JDK e Maven

## Estrutura do Projeto
 
 Este projeto foi desenvolvolvido com disigner partner page objets que consiste de atribuir cada ação e cada metodo
 pré definidos para a pagina em que o teste esta sendo executado.
 Na classe ExecutaTest quando chamar o teste para ser executado chamando 
 os metodos da page prescisa mudar apenas massa de teste (dados que serão usados de acordo 
 com a necessidade do projeto)
 

## Como executar o projeto

1. Clone este repositório em sua máquina local.
2. Abra o projeto em uma IDE ou no Terminal
3. Execute os comandos abaixo

Executar os testes API e Unitário
```bash
mvn test


Executar os testes de UI
```bash
mvn test -Dtest=Executa