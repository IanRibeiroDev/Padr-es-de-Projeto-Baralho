Para a criação dos baralhos optamos por utilizar o padrão builder, pois cada baralho possui quantidade de cartas 
distintas e também as próprias cartas possuem atributos e valores distintos, que podem todos ser setados na hora de sua 
criação com o builder. 

Optamos por utilizar uma simple factory para geração das cartas, já que precisamos apenas que elas sejam criadas para
que o builder possa setar cada um de seus valores conforme a necessidade do baralho.