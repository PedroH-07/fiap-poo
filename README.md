A classe Oculos representa um oculos do mundo real com tres propriedades: armacao, grau e material. Todos os atributos sao privados para proteger os dados.

Como usar?
Criar um oculos: Oculos meuOculos = new Oculos();
Ler valores (getters): String armacao = meuOculos.getArmacao(); double grau = meuOculos.getGrau(); String material = meuOculos.getMaterial();
Alterar valores (setters com validacao): meuOculos.setArmacao("Redondo"); meuOculos.setMaterial("Vidro"); meuOculos.setGrau(2.5);

Regras de protecao:
setArmacao: nao aceita valores vazios
setMaterial: nao aceita valores vazios
setGrau: aceita apenas valores entre 0 e 10 (REGRA ESPECIAL)
Exemplos invalidos (serao rejeitados): meuOculos.setArmacao(""); // Rejeitado meuOculos.setGrau(-5.0); // Rejeitado meuOculos.setGrau(15.0); // Rejeitado

Protecao de encapsulamento:
Ninguem pode acessar diretamente os atributos: meuOculos.grau = 999.0; // ERRO: grau e privado
A unica forma e usar os setters que validam os dados.
