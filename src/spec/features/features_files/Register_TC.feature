Feature: Je rempli le formulaire
  En tant que utilisateur je souhaite remplir le formulaire afin de m enregistrer

  @module_registre
  Scenario Outline: Remplir le formulaire register
    Given Je me connecte sur l application Mercury
    When je clique sur le lien registre
    When je saisis un data dans le champs firstname "<firstname>"
    When je saisis un data dans le champs lastname "<lastname>"

    Examples: 
      | firstname | lastname |
      | Marwa     | Lakrab   |
      | Refka     | Benamour |
