
# Algoritmo que recomenda amigos em java

**Problema: Sugerir amigos com base em uma pessoa(id)**

Requisitos:

-   Dar sugestões de amizade com base nos amigos de uma pessoa.
    
-   Só devem ser exibidos os amigos que não forem amigos da primeira pessoa.
    
-   Deve ser retornado o ID das pessoas recomendadas.
    
-   Após a coleta do ID, o nome da pessoa deve ser exibido.
    
-   A classe pessoa deve conter 3 atributos: ID, nome e um array com IDs de outras pessoas.
    
-   Exemplo a ser usado:
    

Alice é amiga de Bob e Dan

Bob é amigo de Eve e Charlie

  

-   Exemplo de retorno:
    

Alice.recomedarAmigos():

-   [ Charlie, Eve ]
    

  

-   O método ‘recomendarAmigos’ deve ter como parâmetro o número máximo de sugestões de amigos a serem retornados.
    
-   Não deve possuir uma complexidade superior a N(exemplo: N²).
