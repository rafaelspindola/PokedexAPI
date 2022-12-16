# Pokedex API

## Briefing

This project is intended to create a pokedex consuming a web API using java from pokedexapi.co and visualizing fetched json data through a front end design.
It only works for the GET method, since the own API limits the HTTP request methods.

## Dependencies

- Spring Web
- Thymeleaf
- Lombok
- Spring Boot DevTools

## Packages

- Controller: is a mediator between the user and the app, receiving input and converting it to a model or a view. Contains methods and functions related to HTTP requests (GET).
- Model: is the app's data structure containing blueprints for pokemon data.
- Service: a class and interface developed to create and initiliaze methods in order to reduce repeated code.

# What I've learned in this project 

- First, I've never consumed an web API before. It was very difficult to manage how to deal with it by myself, but luckily a friend developer helped me to achive this goal. 
- It was also another chance to consolidate my knowledge using thymeleaf. It's a nice tool to render initial front end designs.
- I've started developing the service package to abstract the request methods used in the controller and aiming to write clean code.

![pokedexide](https://user-images.githubusercontent.com/108681887/208010344-43d09990-964d-4d02-bf12-9a5806887128.PNG)
![Screenshot 2022-12-14 at 16-04-31 Screenshot](https://user-images.githubusercontent.com/108681887/208010350-8a8c1a1b-ba8f-48de-8811-d4eba2cac3a0.png)
![Screenshot 2022-12-14 at 16-03-26 Pokedex](https://user-images.githubusercontent.com/108681887/208010357-6f8fcfa9-b865-43fd-8f22-252baa69dceb.png)
