Feature: Je verifier la page de BouletCorp
  En tant que utilisateur je souhaite de clique sur boutton Aleatoire  au site Bouletcorp
   et verifier les widgets facebook, twitter et tumblr

  @Boulet
  Scenario: Je verifier la page de la connexion
    Given Je me connecte sur le site BouletCorp
    When Je clique sur boutton Aleatoire 
    Then Je me redirige vers autre page 
    Then Je verifier le widget facebook est bien afficher
    Then Je verifier le widget twitter est bien afficher
    Then Je verifier le widget tumblr est bien afficher "Partager sur Tumblr"