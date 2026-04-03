# Projeto UFC (Simulação de Lutas)
 
Este projeto tem como objetivo simular um sistema básico de lutas entre competidores, utilizando conceitos fundamentais de programação orientada a objetos em Java.
 
## Descrição
 
O sistema representa lutadores com atributos como nome, peso, categoria, vitórias, derrotas e empates. A partir dessas informações, é possível realizar o gerenciamento de lutas, incluindo marcação e execução, respeitando regras específicas.
 
Cada lutador possui métodos para apresentar seus dados, exibir seu histórico de lutas e atualizar seu desempenho com base nos resultados.
 
## Funcionalidades
 
- Cadastro de lutadores com atributos definidos
- Definição automática de categoria baseada no peso
- Métodos getters e setters para encapsulamento
- Método construtor para inicialização dos dados
- Apresentação dos dados do lutador
- Exibição do status (vitórias, derrotas e empates)
- Atualização de resultados (ganhar, perder, empatar)
 
## Sistema de Lutas
 
- Permite marcar luta entre dois lutadores
- Verifica se os lutadores pertencem à mesma categoria
- Impede luta entre o mesmo lutador
- Define se a luta está aprovada ou não
- Executa a luta apenas se aprovada
- Resultado da luta é gerado de forma aleatória:
  - Vitória de um dos lutadores
  - Empate
 
## Regras de Categoria
 
A categoria do lutador é definida automaticamente com base no peso:
 
- Abaixo de 52 kg: Inválido
- Até 70 kg: Leve
- Até 83 kg: Médio
- Até 110 kg: Pesado
- Acima disso: Inválido
 
## Objetivo Educacional
 
Este projeto foi desenvolvido com foco didático, visando praticar:
 
- Encapsulamento
- Uso de construtores
- Métodos getters e setters
- Regras de negócio
- Manipulação de objetos
- Geração de valores aleatórios
 
## Tecnologias Utilizadas
 
- Java
- Programação Orientada a Objetos
 
## Observações
 
O projeto pode ser expandido com interface gráfica, persistência de dados ou integração com banco de dados, conforme evolução do aprendizado.
