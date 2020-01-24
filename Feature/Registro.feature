Feature: Register Action


@RegisterTest @Valid
Scenario: Sucesso ao registrar usuario 
	Given Usuario esteja na pagina inicial
	When Usuario navegar para a pagina de Login
	And Usuario clicar no botao criar nova conta
	And Usuario peencher os campos com dados validos
	Then Usuario sera registrado com sucesso
	
@RegisterTest @Invalid
Scenario: Falha ao registrar usuario 
	Given Usuario esteja na pagina inicial
	When Usuario navegar para a pagina de Login
	And Usuario clicar no botao criar nova conta
	And Usuario peencher os campos com dados invalidos 
	Then Usuario nao sera registrado	