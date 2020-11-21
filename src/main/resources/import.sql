insert into todo (id, title, url, ordering, completed)
values (nextval('hibernate_sequence'), 'First Todo', 'http://firsttodo', 1, false);

insert into todo (id, title, url, ordering, completed)
values (nextval('hibernate_sequence'), 'Second Todo', 'http://second', 2, false);

insert into todo (id, title, url, ordering, completed)
values (nextval('hibernate_sequence'), 'Third Todo', 'http://third', 3, false);