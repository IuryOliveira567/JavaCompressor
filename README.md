# Compactador de Arquivos em Java

Projeto desenvolvido em Java com o objetivo de demonstrar conceitos de Programação Orientada a Objetos através da implementação de um sistema de compactação de arquivos.

## Objetivo

O sistema realiza compactação de arquivos nos formatos:

- ZIP
- 7Z
- RAR

utilizando interfaces, herança e polimorfismo.

---

## Conceitos Aplicados

- Interfaces
- Classes abstratas
- Herança
- Polimorfismo
- Encapsulamento
- Execução de processos externos com `ProcessBuilder`

---

## Estrutura do Projeto

```text
src/
 ├── compactacao/
 │     ├── ICompactacao.java
 │     ├── Compactador.java
 │     ├── Zip.java
 │     ├── Zip7.java
 │     ├── Rar.java
 │     └── Main.java
