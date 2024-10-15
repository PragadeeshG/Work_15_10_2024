create table if not exists ambiguous_resolution_fix_config(
bean_config_file_name Integer not null,
files_match varchar(255) null,
bean_resolution_priority varchar(255) null,
bean_resolution_group varchar(255) null,
dependency_level2 varchar(255) null,
dependency_level3 varchar(255) null,
dependency_level4 varchar(255) null,
dependency_level5 varchar(255) null,
proxy_balancer varchar(255) null,
proxy_pass_match varchar(255) null,
proxy_pass varchar(255) null,
proxy_pass_reverse varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint ambiguous_resolution_fix_config_pk primary key(bean_config_file_name));