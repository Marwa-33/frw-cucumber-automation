Feature: Je remplie le formulaire d inscription
  En tant que utilistateur je veux remplir le fomulaire d inscription de site Mercury

  @registre
  Scenario: Je remplie le formulaire d inscription
    Given je suis sur la page de connexion Mercury
    When je clique sur le lien registre
    And je saisis firstName "Marwa" 
    And je saisis lastName "Lakrab"
    And je saisis phone "26336963"
    And je saisis userName "marwalak@gmail.com"
    And je saisis address1 "21 rue mourouj "
    And je saisis city "mourouj"
    And je saisis state "ben arous"
    And je saisis postalCode "2074"
    And je saisis country "TUNISIA"
    And je saisis email "TUNISIA"
    And je saisis password "test123"
    And je saisis confirmPassword "test123"
    And je clique sur le bouton envoyer
    Then je me redirigee vers la page de confirmation de mon inscritption et un message de succes s affiche  "Note: Your user name is"
