create database crud;
use crud;



create table Produto(
    idProduto bigint auto_increment,
    Nome varchar(50) not null,
    ValorCusto double not null,
    Quantidade int not null,
    primary key(idproduto)
);

INSERT INTO Produto VALUES (null, "Notebook", 2000, 10);
INSERT INTO Produto VALUES (null, "Mouse Gamer", 85, 10);
INSERT INTO Produto VALUES (null, "Teclado Gamer", 110, 10);
INSERT INTO Produto VALUES (null, "MousePad Fofinho", 25, 10);

select * from Produto;

drop database crud;