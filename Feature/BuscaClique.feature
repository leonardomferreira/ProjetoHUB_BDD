Feature: Search Action

@SearchTest @Valid 
Scenario: Pesquisa em categoria válida 
	Given Usuario esteja na pagina inicial 
	When Clicar na categoria desejada 
	And Clicar no notebook escolhido 
	Then A pagina do notebook escolhido será exibida 
	
@SearchTest @Invalid 
Scenario: Pesquisando produto errado pela imagem na tela principal 
	Given Usuario esteja na pagina inicial 
	When Usuario clicar para ver detalhes do laptop 
	Then Será exibida a página de outro laptop 
