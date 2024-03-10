create table questions
(
    id              bigserial,
    question        varchar(255),
    answer_choice_1 varchar(255),
    answer_choice_2 varchar(255),
    answer_choice_3 varchar(255),
    answer_choice_4 varchar(255),
    primary key (id)
);

create table gamers
(
    id              bigserial,
    name            varchar(255),
    gender          varchar(255),
    target_gamer_id bigint references gamers (id),
    primary key (id)
);

create table letters
(
    id          bigserial,
    letter_text text,
    gamer_id    bigint references gamers (id),
    primary key (id)
);

create table answers
(
    id          bigserial,
    gamer_id    bigint references gamers (id),
    question_id bigint references questions (id),
    answer      varchar(255),
    primary key (id)
);

alter table gamers
    add column letter_id bigint references letters (id) on delete cascade;
