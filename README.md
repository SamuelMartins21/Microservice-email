# Microserviço de Envio de E-mail💻📧
Este projeto consiste em um microserviço de envio de e-mails. 

## Tecnologias 
- Java 
- Spring Boot
- Web Maven 
- GIT 
- SQL(MySQL) 
- Spring Mail 
- RabbitMQ

## Funcionalidades⚙️

- Comunicação síncrona e assíncrona🔄: Implementei uma comunicação síncrona para casos em que o envio de e-mails precisa ser feito imediatamente. Além disso, integrei o microserviço com o RabbitMQ, permitindo uma comunicação assíncrona e o gerenciamento eficiente de filas. Essa abordagem possibilita uma maior flexibilidade e escalabilidade no envio de e-mails.

- Integração com banco de dados MySQL🗃️: Garanti a persistência segura dos registros relacionados aos envios de e-mails ao integrar o microserviço com o banco de dados MySQL. Dessa forma, é possível armazenar informações relevantes sobre os envios, como destinatários, assuntos e status.

## Como executar o projeto▶️

Para executar o projeto localmente, siga as instruções abaixo:

1. Certifique-se de ter o Java e o Maven instalados em seu ambiente de desenvolvimento.

2. Clone o repositório do GitHub em seu ambiente local:

3. Execute a aplicação

**Certifique-se de configurar corretamente as credenciais de e-mail no arquivo ``application.properties`` do Spring Boot.**

- O microserviço de envio de e-mail estará em execução e pronto para receber solicitações de envio de e-mails.

## Contribuição👥
Contribuições para o aprimoramento deste microserviço são bem-vindas. Sinta-se à vontade para enviar pull requests e relatar problemas.

## Licença📄
Este projeto está licenciado sob a **MIT License**.
