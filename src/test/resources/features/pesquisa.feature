# Language en
  Feature: Pesquisar de Produto
    Eu como cliente do mercado livre
    quero pesquisar um produto
    para poder fazer compra

  @pesquisa-massa-plastica
  Scenario:
    Given que estou na página do mercado livre
    When pesquiso pelo produto "massa plástica"
    Then o produto é encontrado
