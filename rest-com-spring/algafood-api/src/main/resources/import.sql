insert into cozinha (id, nome) values (1, 'Tailandesa');
insert into cozinha (id, nome) values (2, 'Indiana');
insert into cozinha (id, nome) values (3, 'Japonesa');

insert into restaurante (nome, taxa_frete, cozinha_id) values ("João Tororo", 3.99, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ("Comida Mineira", 10.99, 2);
insert into restaurante (nome, taxa_frete, cozinha_id) values ("Restaurante Tô com Fome", 2.99, 1);
insert into restaurante (nome, taxa_frete, cozinha_id) values ("Restaurante Tradição", 11.99, 2);

insert into forma_pagamento (id, descricao) values (1, 'cartão');
insert into forma_pagamento (id, descricao) values (2, 'dinheiro');
insert into forma_pagamento (id, descricao) values (3, 'pix');

insert into permissao (id, nome, descricao) values (1, 'consulta pedido', 'Usuário tem acesso ao menu de pedidos');
insert into permissao (id, nome, descricao) values (2, 'Painel administrativo', 'Usuário possiu permissões elevadas');

insert into estado (id, nome) values (1, 'Minas Gerais');
insert into estado (id, nome) values (2, 'Mato Grosso do Sul');
insert into estado (id, nome) values (3, 'São Paulo');

insert into cidade (id, nome, estado_id) values (1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values (2, 'Aparecida do Taboádo', 2);
insert into cidade (id, nome, estado_id) values (3, 'Aparecida do Norte', 3);