# Biblioteca Digital
 
## Sistema de Biblioteca Digital

Este é um projeto desenvolvido para a matéria de `Programação Orientada a Objetos`, desenvolvendo as habilidades para Classes Abstratas, Polimorfismo e Interfaces.

## Funcionalidades
- Cadastro de vídeos e livros
- Futuramente, os vídeos encaminharão para o Youtube ou criarão um pop-up
- Descrição sobre o vídeo ou livro.

## Estrutura do Projeto

### 1. **Main**

Onde o sistema começa. Mostrando o menu e os vídeos e livros do sistema.

### Classe Pai

A classe `ItemBibliotecaDigital`é uma classe abstrata e pai das classes `EBook` e `VídeoDigital`.

### Interface

Os itens podem ser visualizáveis ou baixáveis, por isso, criei as classes `Visualizável` e `Baixável`, aonde possui os métodos abstratos para essas duas funções.

### Classes Filha

`Ebook` e `VídeoDigital` possui os atributos específicos para suas funções, além da sobrescrita dos métodos que serão utilizados por sua classe.

## Melhorias Futuras

- Tentativa de usar uma interface gráfica, mostrando a capa do livro ou do vídeo.
- Cadastro de livros e vídeos por meio do próprio sistema.