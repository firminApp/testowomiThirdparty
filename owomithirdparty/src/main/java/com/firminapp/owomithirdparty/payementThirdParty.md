# Payement par corporate from sdk

# input from sdk

- sdkId
- codeProduit
- idCorporate
- quantite
- montant
- formString
- refExterne

# output from owomiApp

{
"statut": "ERROR|SUCCESS",
"message":"explication",
}


# Recupération de la liste des corporates d'un user
 
 ## input from sdk
 
 - sdkId
 
 ## retour from owomiApp
 
  - { "statut": "error|success",
        "message":"explication",
 
      "corporates": [
     
      ]
    }
      
      