Feature: TextSearch

@TextSearchTest @Valid
Scenario: sucesso ao pesquisar produto pela lupa
	Given Usuario esteja na pagina inicial
	When Usuario clicar na lupa
	And Usuario pesquisar pelo produto desejado
	And Usuario clicar no produto
	Then O produto desejado sera exibido
	
@TextSearchTest @Invalid
Scenario: Falha ao pesquisar produto pela lupa
	Given Usuario esteja na pagina inicial
	When Usuario clicar na lupa
	And Usuario pesquisar pelo produto invalido
	Then Nunhum resultado sera exibido