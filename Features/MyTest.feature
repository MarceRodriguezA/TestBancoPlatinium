Feature: Prueba de usuario y password en login
	
  Scenario: Verificar ingreso de sesion exitoso
    Given Abrir Chrome
    When ingresa Username "cat12" y Password "123"
    Then inicia sesion

	Scenario: Verificar ingreso de sesion no exitoso por credenciales incorrectas
    Given Abrir Chrome
    When ingresa Username "cat2" y Password "password"
    Then no inicia sesion
    
  Scenario: Verificar ingreso de sesion no exitoso por vacios
    Given Abrir Chrome
    When ingresa Username "" y Password ""
    Then no inicia sesion
