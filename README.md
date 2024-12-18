# Sistema de Agendamento de Auditório

<p>Bem-vindo ao repositório do sistema <b>Sistema de Agendamento de Auditório</b>. Este projeto foi desenvolvido em PHP com MySQL e tem como objetivo facilitar o agendamento de espaços como auditórios, garantindo uma gestão eficiente de horários e evitando conflitos.</p>

---

# Funcionalidades Principais

1. **Cadastro de Usuários**  
   - Possibilidade de criar contas com diferentes níveis de acesso.

2. **Login Seguro**  
   - Validação de credenciais e gerenciamento de sessões.

3. **Reserva de Espaços**  
   - Exibição de horários disponíveis para agendamento e controle de conflitos.

4. **Gestão de Agendamentos**  
   - Administradores podem visualizar e gerenciar todas as reservas.

---

# Tecnologias usadas
   - **Front-end:** HTML e CSS para estruturação e estilização.
   - **Back-end:** PHP para lógica da aplicação e manipulação de dados.
   - **Banco de Dados:** MySQL utilizando o phpMyAdmin para gerenciar os dados das tabelas agendamentos e disponibilidade.
   - **Servidor Local:** XAMPP para simulação do ambiente web.

---

# Desenho do Banco: 
![image](https://github.com/user-attachments/assets/543909a7-8c57-498c-aeba-45667fa790bb)
   - Observação: A tabela espacos serviria para uma suposta atualização que envolveria a adição de outro espaço além do Auditório.

---

# Estrutura de Arquivos

```plaintext
projetoONG/
├── methods/
│   ├── agendarAuditorio.php
│   ├── realizarLogout.php
│   ├── conection.php
│   └── outras funções auxiliares
├── pages/
│   ├── index.html
│   ├── gerenciamentoHorario.php
│   └── login.php
│   ├── reservas.php
│   └── user.php
├── style.css
└── projetoweb.sql
```
# Desenvolvedores
  - Henrique Chaves Duarte
  - Luis Miguel Solera
