# ELECTION REST API

A formal and organized choice by vote of a person for a political office or other position.

<br>

## Configuration

- Server port        : 8080

- MySQL port     : 3306

- Database name : enigma_example

- Context path     : /api

  <br>

## API Swagger Documentation

This [URL](http://localhost:8080/api/documentation) can be used to access Swagger UI when the spring-boot application is run locally.

<br>

## Features

- `Search`

  Search topic by topic name using query parameter.

  ![Search](images/feature/search.png)

  <br>

- `Pagination`

  Page numbering topic and sorting id by descending.

  ![Pagination](images/feature/pagination.png)

  <br>

- `Custom Validation`

  Handle error message response when hit endpoint or send wrong request.

![Validation 1](images/feature/validation1.png)

![Validation 2](images/feature/validation2.png)

![Validation 3](images/feature/validation3.png)

<br>



## API Endpoint

Show all topics

![Find All](images/topic/findAll.png)

<br>

Find topic by id

![Find Topic](images/topic/findById.png)

<br>

Add topic

![Add Topic](images/topic/add.png)

<br>

Delete topic

![Delete](images/topic/delete.png)

<br>

Search topic by name

![Search](images/topic/search.png)

<br>

Show all candidates by topic

![Find All](images/candidate/findAll.png)

<br>

Add candidate

![Add](images/candidate/add.png)

<br>

Find candidate by id

![Find By Id](images/candidate/findById.png)

<br>

Edit candidate by id

![Edit](images/candidate/edit.png)

<br>

Delete candidate by id

![Delete](images/candidate/delete.png)

<br>

Show all elections by topic

![Delete](images/election/findAll.png)

<br>

Election candidate by topic

![Delete](images/election/add.png)

<br>

Results of all elections by topic 

![Delete](images/election/result.png)