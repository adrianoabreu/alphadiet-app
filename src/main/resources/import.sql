INSERT INTO tb_pais(sigla, descricao, codigo) VALUES ('BR', 'Brasil', 55);

INSERT INTO tb_estado(sigla, descricao) VALUES ('RJ', 'Rio de Janeiro');
INSERT INTO tb_estado(sigla, descricao) VALUES ('SP', 'Sao Paulo');
INSERT INTO tb_estado(sigla, descricao) VALUES ('MG', 'Minas Gerais');
INSERT INTO tb_estado(sigla, descricao) VALUES ('ES', 'Espirito Santo');
INSERT INTO tb_estado(sigla, descricao) VALUES ('RS', 'Rio Grande do Sul');
INSERT INTO tb_estado(sigla, descricao) VALUES ('RN', 'Rio Grande do Norte');
INSERT INTO tb_estado(sigla, descricao) VALUES ('CE', 'Ceara');
INSERT INTO tb_estado(sigla, descricao) VALUES ('TO', 'Tocantins');
INSERT INTO tb_estado(sigla, descricao) VALUES ('AC', 'Acre');
INSERT INTO tb_estado(sigla, descricao) VALUES ('AM', 'Amazonas');
INSERT INTO tb_estado(sigla, descricao) VALUES ('GO', 'Goias');
INSERT INTO tb_estado(sigla, descricao) VALUES ('DF', 'Distrito Federal');
INSERT INTO tb_estado(sigla, descricao) VALUES ('MT', 'Mato Grosso');
INSERT INTO tb_estado(sigla, descricao) VALUES ('MS', 'Mato Grosso do Sul');
INSERT INTO tb_estado(sigla, descricao) VALUES ('PR', 'Parana');
INSERT INTO tb_estado(sigla, descricao) VALUES ('SC', 'Santa Catarina');
INSERT INTO tb_estado(sigla, descricao) VALUES ('PE', 'Pernambuco');
INSERT INTO tb_estado(sigla, descricao) VALUES ('BA', 'Bahia');
INSERT INTO tb_estado(sigla, descricao) VALUES ('PA', 'Para');
INSERT INTO tb_estado(sigla, descricao) VALUES ('PI', 'Piaui');
INSERT INTO tb_estado(sigla, descricao) VALUES ('RO', 'Rondonia');
INSERT INTO tb_estado(sigla, descricao) VALUES ('AL', 'Alagoas');
INSERT INTO tb_estado(sigla, descricao) VALUES ('RR', 'Roraima');
INSERT INTO tb_estado(sigla, descricao) VALUES ('SE', 'Sergipe');
INSERT INTO tb_estado(sigla, descricao) VALUES ('AP', 'Amapa');
INSERT INTO tb_estado(sigla, descricao) VALUES ('PB', 'Paraiba');
INSERT INTO tb_estado(sigla, descricao) VALUES ('MA', 'Maranhao');

INSERT INTO tb_cidade(descricao) VALUES ('Rio de Janeiro');
INSERT INTO tb_cidade(descricao) VALUES ('Sao Paulo');
INSERT INTO tb_cidade(descricao) VALUES ('Belo Horizonte');
INSERT INTO tb_cidade(descricao) VALUES ('Vitoria');
INSERT INTO tb_cidade(descricao) VALUES ('Brasilia');
INSERT INTO tb_cidade(descricao) VALUES ('Porto Alegre');
INSERT INTO tb_cidade(descricao) VALUES ('Recife');
INSERT INTO tb_cidade(descricao) VALUES ('Manaus');
INSERT INTO tb_cidade(descricao) VALUES ('Caxias');
INSERT INTO tb_cidade(descricao) VALUES ('Armacao dos Buzios');
INSERT INTO tb_cidade(descricao) VALUES ('Cabo Frio');
INSERT INTO tb_cidade(descricao) VALUES ('Arraial do Cabo');
INSERT INTO tb_cidade(descricao) VALUES ('Angra dos Reis');
INSERT INTO tb_cidade(descricao) VALUES ('Araruama');
INSERT INTO tb_cidade(descricao) VALUES ('Casimiro de Abreu');
INSERT INTO tb_cidade(descricao) VALUES ('Macae');
INSERT INTO tb_cidade(descricao) VALUES ('Campos dos Goytacazes');

INSERT INTO tb_categoria(descricao) VALUES ('Cereais e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Verduras, hortalicas e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Frutas e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Gorduras e oleos');
INSERT INTO tb_categoria(descricao) VALUES ('Pescados e frutos do mar');
INSERT INTO tb_categoria(descricao) VALUES ('Carnes e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Leite e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Bebidas alcoolicas e nao alcoolicas');
INSERT INTO tb_categoria(descricao) VALUES ('Ovos e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Produtos acucarados');
INSERT INTO tb_categoria(descricao) VALUES ('Miscelanias');
INSERT INTO tb_categoria(descricao) VALUES ('Outros alimentos industrializados');
INSERT INTO tb_categoria(descricao) VALUES ('Alimentos preparados');
INSERT INTO tb_categoria(descricao) VALUES ('Leguminosas e derivados');
INSERT INTO tb_categoria(descricao) VALUES ('Nozes e sementes');

INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('BD', 'Balde');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('CJ', 'Conjunto');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('CX', 'Caixa');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('G', 'Grama');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('KG', 'Quilograma');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('L', 'Litro');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('ML', 'Mililitro');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('PA', 'A definir');
INSERT INTO tb_unidade_comercial(sigla, descricao) VALUES ('UN', 'Unidade');

INSERT INTO tb_estabelecimento(nome,cnpj) VALUES ('Supermercados Guanabara','33130543000182');

INSERT INTO tb_endereco(logradouro,bairro,cep,numero,complemento) VALUES ('Avenida Teixeira de Castro', 'Bonsucesso','21040010','90','N/A');

INSERT INTO tb_usuario(nome,email,data_nascimento,cpf,senha) VALUES ('Adriano Abreu','adriano.luis.machado2013@hotmail.com','1992-08-27','12345678901','123456');

INSERT INTO tb_produto(descricao,umidade,kcal,kj,proteina,lipideos,colesterol,idrato,alimentar,cinzas,calcio,magnesio,manganes,fosforo,ferro,sodio,potassio,cobre,zinco,retinol,re,rae,tiamina,riboflavina,piridoxina,niacina,vitaminac,valor_unitario) VALUES ('Arroz, integral, cozido',70.1,124,517,2.6,1.0,0,25.8,2.7,0.5,5,59,0.63,106,0.3,1,75,0.02,0.7,0,0,0,0.08,0,0.08,0,0,8.44);

