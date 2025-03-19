
<div align = "center">

  
<h1 align="center">Sistema de Gerenciamento de Usuários e Produtos</h1>

<p align = "center">
        <strong>Esse software é back-end para gerenciamento de usuários e produtos</strong>
</p>

    [![pt-BR](https://img.shields.io/badge/lang-pt--BR-green.svg)](./docs/README.pt-BR.md)
    [![en](https://img.shields.io/badge/lang-en-red.svg)](./README.md)

</div>

## Índice

- [Índice](#índice)
- [Sobre](#-sobre)
- [Recursos](#-recursos)
- [Tecnologias Utilizadas](#-tecnologias-Utilizadas)
- [Contribuindo](#-contribuindo)
  - [Conecte-se ao meu LinkedIn](#-conect-se-ao-meu-linkedIn)
  - [Fork e clone o seu repositório](#-fork-e-clone-o-seu-repositório)
  - [Estrutura do Projeto](#-estrutura-do-projeto)
- [Compile a partir do código-fonte](#-compile-a-partir-do-código-fonte)
  - [Pré-Requisitos](#pre-requisitos)
  - [Instale Spring Tool Suite](#instale-spring-tool-suite)
  - [Instale Java 21 LTS ](#instale-java-21)
  - [Instale Maven Dependencies](#instale-maven-dependencies)
- [Running](#running)
- [License](#license)

## <a name="about"> Sobre
Este projeto é uma aplicação **backend** abrangente desenvolvida usando **Spring Boot**. Ele serve como base para **gerenciar usuários e produtos** em uma **aplicação web**. O projeto aproveita os recursos poderosos do **Spring Boot** para garantir uma solução robusta e escalável.

## <a name="features"> Recursos

- Gerenciamento de Usuários (CRUD).
- Gerenciamento de produtos (CRUD).
- Integração com banco de dados.
- API RESTful.

## <a name="technologies-used"> Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Apache Tomcat
- Java 21 LTS

## <a name="contributing"> Contribuindo

### <a name="connect-with-me-on "></a> Conecte-se ao meu LinkedIn

Conecte-se ao meu [LinkedIn](https://www.linkedin.com/in/caiogomesbrayner).

### <a name="fork-and-clone-your-repository"></a> Fork e clone o seu repositório

1. Faça um fork do repositório [(clique aqui para fazer o fork agora)](https://github.com/Caio-GBrayner/springboot-jpa)
2. Clone o código do seu fork `https://github.com/Caio-GBrayner/springboot-jpa.git`
3. Crie uma nova branch
4. Faça o push dos seus commits
5. Envie um novo Pull Request

### <a name="project-structure"></a> Estrutura do Projeto

- src/config: Test de configurações
- src/entities: Contém as entidades do sistema, que representam as tabelas do banco de dados.
- src/repositories: Contém interfaces que estendem `JpaRepository` para acesso ao banco de dados.
- src/resources/: Contém arquivos de recursos, como propriedades de configuração e mensagens.
- src/resources/exceptions: Contém classes de exceções personalizadas.
- src/service/: Contém classes de serviço que implementam a lógica de negócio.
- src/service/exceptions: Contém exceções específicas da camada de serviço.

## <a name="build-from-source"></a> Compile a partir do código-fonte

### <a name="prerequisites"> Pré-Requisitos

- Java 21 LTS instalado.
- Maven instalado.
- Banco de dados H2 configurado.

### <a name="install-spring-tool-suite"></a> Instale Spring Tool Suite

1. Baixe o Spring Tool Suite [aqui](https://spring.io/tools).
2. Siga as instruções de instalação para o seu sistema operacional.

### <a name="install-java-21"></a> Instale Java 21 LTS

1. Baixe o JDK 21 [aqui](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).
2. Configure a variável de ambiente `JAVA_HOME`.

### <a name="install-maven-dependencies"></a> Instale Maven Dependencies

1. Execute o seguinte comando na raiz do projeto:
```bash
mvn clean install
```

## <a name="running"></a> Executando

1. Execute o projeto com o comando:
   ```bash
   mvn spring-boot:run
   ```

## <a name="license"></a> Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.