DSList - Digital Games List
DSList é uma aplicação desenvolvida em Java com Spring Boot para gerenciar listas de jogos digitais. Com ela, é possível criar e organizar listas de jogos, adicionar novos jogos às listas e movê-los entre as listas.

Funcionalidades Principais
Listas de Jogos: Crie e gerencie diferentes listas de jogos, como "Aventura e RPG", "Jogos de Plataforma", etc.
Adicionar Jogos: Adicione novos jogos à sua biblioteca, informando título, ano, gênero, plataformas, score, imagem e descrição.
Visualizar Detalhes: Visualize detalhes completos de cada jogo, incluindo sua descrição e imagem.
Organização de Jogos: Mova jogos entre as listas e reorganize a ordem dos jogos em cada lista.

Como Executar
Clone o repositório para sua máquina local.
Certifique-se de ter o JDK 11 e o Apache Maven instalados em seu ambiente de desenvolvimento.
Configure um banco de dados PostgreSQL e atualize as configurações de conexão no arquivo application-dev.properties.
Execute o comando mvn spring-boot:run na raiz do projeto para iniciar a aplicação.
Acesse a aplicação em http://localhost:8080.

Tecnologias Utilizadas
Java: Linguagem de programação utilizada para desenvolver a aplicação.
Spring Boot: Framework utilizado para construir a aplicação web.
Spring Data JPA: Facilita a interação com o banco de dados utilizando o padrão de persistência JPA.
PostgreSQL: Banco de dados utilizado para armazenar os dados da aplicação.
Maven: Gerenciador de dependências utilizado para o build do projeto.

Endpoints da API
/games: Endpoint para operações relacionadas aos jogos.
/lists: Endpoint para operações relacionadas às listas de jogos.

Configuração CORS
A aplicação está configurada para permitir solicitações de diferentes origens (CORS). As origens permitidas podem ser configuradas no arquivo application.properties.

Autores
Pedro Arigoni

Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

Licença
Este projeto é licenciado sob a Licença MIT. Consulte o arquivo LICENSE para obter mais detalhes.
