
create table store
(
	id serial not null
		constraint store_pkey
			primary key,
	name varchar(96),
	prefecture varchar(10),
	address varchar(100)
)
;

create table store_location
(
	id int not null
		constraint store_location_pkey
			primary key,
	location geometry
)
;


