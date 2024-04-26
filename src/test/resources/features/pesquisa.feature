# Language en
  Feature: Pesquisar Produto
    Eu como cliente do mercado livre
    quero pesquisar um produto
    para poder fazer compra

  @pesquisa-massa-plastica
  Scenario:
    Given que estou na página do mercado livre
    When pesquiso pelo produto
    And defino a faixa de valor
    And inicio a compra
    Then é apresentada a mensagem de compra
