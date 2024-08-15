## Задание: Написать сервис авторизации

### Используемые технологии: 
* Java spring framework
* JWT
* PostgresSQL 
* Docker
* Liquibase

### Два REST маршрута:
#### 1 Выдает пару Access, Refresh, токенов для пользователя с идентификатором (GUID) указанным в параметре запроса;

#### 2 Выполняет Refresh операцию на пару Access, Refresh токенов.

### Требования: 
* Access токен тип JWT
* алгоритм SHA512, хранить в базе строго запрещено. 
* Refresh токен тип произвольный, 
* формат передачи base64,
* хранится в базе исключительно в виде bcrypt хеша, 
* должен быть защищен от изменения на стороне клиента и попыток повторного использования. 
* Access и Refresh токены обоюдно связаны, Refresh операцию для Access токена можно выполнить только тем Refresh токеном, который был выдан вместе с ним. 
* Payload токенов должен содержать сведения об ip адресе клиента, которому он был выдан. 
* В случае, если ip адрес изменился, при рефреш операции нужно послать email warning на почту юзера(для упрощения можно использовать моковые данные)