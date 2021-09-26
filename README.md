# Curso Java

## Princípios

- Java é O.O.
- Java é multi plataforma graças a JVM
- Java é conhecido por ser seguro, motivo de ser usado até hoje
- Java é verboso e de difícil compreensão no início, porém é muito completo e lógico a longo prazo.
- O uso do Java é principalmente no backend onde ocorre a comunicação com o banco de dados

## Tipos de variáveis

- Todo o tipo que não estende de Object é um tipo primitivo
  - boolean
  - char
  - int
  - long
  - double
  - ...
- Reconhecemos um tipo como primitivo pelo fato do mesmo iniciar com letra minúscula
- Todo tipo primitivo tem uma versão em forma de classe onde o tipo tem letra maiúscula
- String não é primitivo por que herda de object

## Getters and Setters

- São métodos com uma função específica de tirar ou por valor de um atributo de uma classe
- São escritos sempre da mesma forma e retorna sempre do mesmo jeito get retorna o tipo do valor e set não retorna porém seta o valor do atributo da classe
- O uso do getter and setter é para **encapsular** o atributo da classe

```
public Double saldo; //dessa forma eu consigo fazer

saldo = 1.000.000,00;

private Double saldo;

// não ponho setSaldo

// porém eu crio o depositar() e o sacar()

// e se eu quiser ver o saldo? então eu crio o getSaldo()
```
`