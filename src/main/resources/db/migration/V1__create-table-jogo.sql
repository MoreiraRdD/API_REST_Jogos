create table jogo(

    id bigint not null auto_increment primary key,
    nome varchar(100) not null,
    descricao varchar(100) not null,
    data_lancamento varchar(10) not null,
    website varchar(100) not null,
    genero varchar(100) not null,
    url_capa varchar(100) not null,
    nome_desenvolvedor varchar(100) not null,
    data_fundacao_desenvolvedor varchar(10) not null,
    website_desenvolvedor varchar(100) not null,
    sede_desenvolvedor varchar(100) not null,
    nome_console varchar(100) not null,
    data_lancamento_console varchar(10) not null,
    empresa_console varchar(100) not null

);