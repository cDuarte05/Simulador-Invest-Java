# Simulador de Investimento

<p>Bem-vindo ao repositório do sistema <b>Simulador de Investimento</b>. Este projeto tem como objetivo obter informações de investimento do cliente através de interfaces onde posteriormente será mostrado gráficos simulando o investimento do usuário.</p>

# Classes principais
1. **Classe Calcs**
   - É uma classe estática onde todos os calculos mátematicos serão feitos.

2. **Classe DataBaseConnection**
   - É a classe que faz a ligação da nossa aplicação com o banco de dados

3. **Classe AdmDataBase**
   - Classe onde é gerenciado os INSERT e SELECT no banco

4. **Classes InterfaceEscolha e Interfaceldent**
   - Classes para manusear as interfaces
   - Classes que recebem e armazenam todos os dados

# Interfaces

1. **Interface Inicial**
   - Pedimos um nome e id para o usuário.
   - Há também o botão para ver todos os registros.
   - Essas informações são guardadas na tabela usuario do Banco de dados
   ![image](https://github.com/user-attachments/assets/ee754d34-0fc2-4b50-ac05-1ad414efecd2)

2. **Registro de simulações**
   - Pedimos para o usuário registrar o valor inicial, meses e o incremento mensal.
   - As informações das variações e dados digitados pelo usuario são guaradas no banco também
   ![image](https://github.com/user-attachments/assets/1e643285-ce4e-4470-ab73-c6f36d4d1b12)

3. **Amostragem dos gráficos**
   - Utilizando todas as variações que o sistema registrou, é criado e mostrado gráficos.
   ![image](https://github.com/user-attachments/assets/970a518f-1029-4e71-adef-68449bc62055)


# Tecnologias e Bibliotecas Utilizadas

- **Java**: Estruturação da aplicação.
- **Jfreechart v.1.5.5**: Criação das interfaces gráficas.
- **Banco de Dados**: Foi usado o JDBC para ligar com o PHPMyAdmin para o gerenciamento e armazenamento de informações.

# Instalação e Configuração

1. **Uso do JFreeChart**
   - Instale e utilize a biblioteca do JFreeChart.
   - [Download](https://mvnrepository.com/artifact/org.jfree/jfreechart/1.5.5).
  
2. **JDBC**
   - Em muitas versões não é necessário ou a maquina já possui, caso precise, segue abaixo.
   - [Download](https://dev.mysql.com/downloads/connector/j/).
  
3. **Banco de Dados**
   - Fique a vontade para usar o banco disponibilizado em nossa página git.
   - Nosso Banco:
   - ![image](https://github.com/user-attachments/assets/6ece6940-f1c5-4691-bb74-618694df1d9d)


3. **XAMPP**:
   - Será preciso utilizar o XAMPP para utilizar nosso banco.
   - [Download](https://www.apachefriends.org/pt_br/download.html) .
  
5. **Clone este repositório**:
   ```bash
   git clone https://github.com/cDuarte05/Sistema_LP2.git
   ```
6. **HTDOCS**
   - Coloque a pasta do arquivo na pasta htdocs que fica dentro da pasta XAMPP.

# Desenvolvedores
  - Henrique Chaves Duarte
  - Luis Miguel Solera
