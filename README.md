# PDV Bebidas  

## Visão Geral do Projeto  
Este projeto é uma aplicação Spring Boot para gerenciar vendas, produtos, pagamentos, NF-e (Nota Fiscal Eletrônica), boletos e transações via Pix.  

## Arquitetura  
A aplicação segue uma arquitetura em camadas com controllers, services, models e DTOs.  

## Estrutura de Classes  
- **Controllers**: Responsáveis por lidar com requisições e respostas HTTP.  
  - `BoletoController`: Gerencia operações de boletos.  
  - `PagamentoController`: Gerencia operações de pagamento.  
  - `VendaController`: Gerencia operações de vendas.  
  - `ProdutoController`: Gerencia operações de produtos.  
  - `NFController`: Gerencia operações de Nota Fiscal.  

- **Models**: Representam a estrutura dos dados.  
  - `Produto`: Representa um produto.  
  - `Pagamento`: Representa um pagamento.  
  - `Venda`: Representa uma venda.  
  - `NF`: Representa uma Nota Fiscal.  
  - `Boleto`: Representa um boleto.  

- **DTOs**: Utilizados para transferência de dados entre camadas.  
  - `ProdutoDTO`: Objeto de transferência de dados para produtos.  
  - `PagamentoDTO`: Objeto de transferência de dados para pagamentos.  
  - `VendaDTO`: Objeto de transferência de dados para vendas.  
  - `NFDTO`: Objeto de transferência de dados para Nota Fiscal.  
  - `BoletoDTO`: Objeto de transferência de dados para boletos.  

## Tecnologias Utilizadas  
- Spring Boot  
- JPA  
- Swagger para documentação da API  

## Endpoints  
- **Boleto**:  
  - POST `/boletos/emitir`  

- **Pagamento**:  
  - POST `/pagamentos`  

- **Venda**:  
  - GET `/vendas`  
  - POST `/vendas`  

- **Produto**:  
  - GET `/produtos`  
  - POST `/produtos`  

- **NF**:  
  - POST `/nf/emitir`  

## Implementações Futuras  
- Sugestões para novos recursos ou melhorias podem ser adicionadas aqui.  

## Instruções de Teste  
Para testar os endpoints, você pode usar ferramentas como Postman e Insomnia. Siga os passos abaixo:  
1. Abra o Postman ou Insomnia.  
2. Defina o tipo de requisição (GET, POST) conforme o endpoint.  
3. Insira a URL do endpoint.  
4. Para requisições POST, inclua o JSON necessário no corpo da requisição.  
5. Envie a requisição e observe a resposta.  