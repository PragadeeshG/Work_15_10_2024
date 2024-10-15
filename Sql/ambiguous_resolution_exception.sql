create table if not exists ambiguous_resolution_exception(
bean_config_file_name Integer not null,
bean_config_password Integer null,
singleton_beans varchar(255) null,
proxy_beans Integer null,
main_cert varchar(255) null,
cert_type varchar(255) null,
trustore_type varchar(255) null,
static_sync varchar(255) null,
is_serializable varchar(255) null,
is_immutable varchar(255) null,
remarks varchar(255) null,
constraint ambiguous_resolution_exception_pk primary key(bean_config_file_name));