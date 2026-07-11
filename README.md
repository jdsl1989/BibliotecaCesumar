# 📚 BibliotecaCesumar

Sistema Web desenvolvido como projeto acadêmico da disciplina de Desenvolvimento Web da graduação em Análise e Desenvolvimento de Sistemas da Unicesumar.

O projeto tem como objetivo demonstrar a utilização do padrão MVC em aplicações Java Web, utilizando Servlets, JSP e JSF para o gerenciamento de informações de uma biblioteca.

---

## 🚀 Tecnologias Utilizadas

* Java
* Jakarta Servlet
* JSP (Java Server Pages)
* JSF (Jakarta Faces)
* Maven
* Apache Tomcat
* Eclipse IDE

---

## 🏗️ Arquitetura do Projeto

O sistema foi desenvolvido utilizando o padrão de arquitetura **MVC (Model-View-Controller)**:

* **Model:** responsável pela representação dos dados e regras de negócio.
* **View:** responsável pelas páginas JSP e JSF exibidas ao usuário.
* **Controller:** responsável pelo processamento das requisições e comunicação entre a interface e os dados.

---

## 📂 Estrutura do Projeto

```text
BibliotecaCesumar
│
├── src
│   └── main
│       ├── java
│       │   ├── controller
│       │   ├── model
│       │   └── repository
│       │
│       └── webapp
│           ├── index.jsp
│           ├── cadastro.jsp
│           ├── cadastroJSF.xhtml
│           └── lista.jsp
│
├── pom.xml
└── README.md
```

---

## ⚙️ Funcionalidades

* Cadastro de livros;
* Listagem dos livros cadastrados;
* Interface utilizando JSP e JSF;
* Organização utilizando padrão MVC;
* Projeto estruturado com Maven.

---

## ▶️ Como Executar o Projeto

### Pré-requisitos

* JDK 17 ou superior;
* Apache Tomcat 10 ou superior;
* Maven;
* Eclipse IDE.

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/jdsl1989/BibliotecaCesumar.git
```

2. Importe o projeto no Eclipse como **Existing Maven Project**.

3. Configure o servidor Apache Tomcat no Eclipse.

4. Execute o projeto utilizando o servidor configurado.

5. Acesse no navegador:

```text
http://localhost:8080/BibliotecaCesumar
```

---

## 📖 Objetivo Acadêmico

Este projeto foi desenvolvido com a finalidade de aplicar conceitos de:

* Programação Java para Web;
* Arquitetura MVC;
* Desenvolvimento com Servlets e JSP;
* Gerenciamento de dependências com Maven;
* Implantação de aplicações em servidores Tomcat.

---

## 👨‍💻 Autor

**José Diego da Silva Luna**

Tecnólogo em Análise e Desenvolvimento de Sistemas — Unicesumar

GitHub: https://github.com/jdsl1989
