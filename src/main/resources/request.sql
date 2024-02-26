insert into account.t_user(password, username)
values ('$2a$10$IjIizGFoWbl79qpy/oDMcu9XvmiFKCL18yJLwYQ8zcg9zr7K3wWCy', 'admin'),
       ('$2a$10$n4qVmzTnNKlLApWsde1eR.EAJ.ZQZ1Svk5a2u2D/W.poaQkF7tKSu', 'Ilya');

insert into account.t_role(id, name)
values (1, 'ROLE_USER'),
       (2, 'ROLE_ADMIN');

insert into account.t_user_roles(user_id, roles_id)
values (1, 2),
       (2, 1);

insert into account.t_todo(completed, description, user_id)
values (false, 'do homework', 2);