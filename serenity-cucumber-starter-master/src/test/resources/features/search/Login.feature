Feature: Ingresar al portal de prueba
  Scenario: Ingresar al portal "https://opensource-demo.orangehrmlive.com/"

    Given Una vez el usuario se encuentre en el portal de prueba
    When Ingrese sus credenciales usuario "Admin" y su contraseña "admin123"
    Then Sera direccionado al home de la pagina
    And podra navegar en la web
