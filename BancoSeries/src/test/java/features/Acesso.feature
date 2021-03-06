@tag
Feature: Acessar o site Banco de Series
	Como usuário quero realizar conectar e desconectar no site

Background: 
    Given O usuario acessa o site
    Then O site é carregado com sucesso

  @smoke1	
  Scenario: Realizar o cadastro no site
    Given O usuario acessa o menu para a realizacao do cadastro
	When Preencher os dados solicitados pelo site
	And Clicar no botão "<Cadastre_se>"
	Then Cadastro é realizado com sucesso

  @smoke2
  Scenario: Realizar a conexão no site
    Given O usuario acessa o menu para a realizacao do login
	When Preencher os dados solicitados pelo site
	And Clicar no botão "<Logar_se>"
	Then Acesso ao site é realizado com sucesso

  @smoke3	
  Scenario: Realizar a desconexão no site
    Given O usuario está conectado ao site
	When Acessar o menu de saída do site
	Then O site exibe a tela principal
	And Validar que que não existe usuário conectado ao site
	
	