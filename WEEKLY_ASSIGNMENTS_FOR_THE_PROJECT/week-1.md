## Week One

### "Can I have some pizza?"

The main goal of the project is to build a Pizza Delivery Management App while learning about Spring and Spring Boot. The project loosely follows 
the [Spring & Hibernate for Beginners](https://drive.google.com/drive/folders/1IYlPKSDdqBmyaOqMGwYFbeKuR66S9GjL?usp=sharing) Udemy course.

For the first week, let's practice using the Spring Context and start building some services for the App.

### - Part one -
#### To watch:

- [ ] Watch **"Section 4: Spring Inversion of
  Control - XML Configuration"** and **"Section 5: Spring Dependency
  Injection - XML Configuration"** of the Udemy course.

#### To do:

- [ ] Let's model some pizzas! Define a base interface `Pizza` with `getName` and `getIngredients` methods, then implement
  some tasty concrete pizza POJOs. You can use [this](https://www.forketers.com/italian-pizza-names-list/) or come up with your own pizzas. 
- [ ] Implement a PizzaDeliveryService that exposes the ability to `orderPizza` and takes a `Pizza` object as argument. 
  For now, it can just return a description of the order.
- [ ] Define a PizzeriaService interface with `getName`, `getAddress` and `makePizza` (take `Pizza` as argument) method signatures, then 
implement your first pizzeria (optionally add more fields).
- [ ] Use Spring XML configuration to define the Beans for `PizzaDeliveryService` and you `PizzeriaService` and perform 
**constructor injection** of the latter into the former.
- [ ] Define another PizzeriaService implementation of you choosing and inject it into the "delivery service" via `setter injection`.
- [ ] Fetch the registered `PizzaDeliveryService` from context in the `PizzaApp` main method and test your pizza orders for the two pizzerias 
  by printing the order details to console.
- [ ] Inject some **literal values** into the first pizzeria fields using Spring (`name` and `address`, and/or other fields you added). 
- [ ] Add an `application.properties` file and define some values (like `name`, `address`) and inject these into your second PizzeriaService.

- [ ] **[OPTIONAL]** Define a `PizzaIngredient` ENUM, which will contain all the different ingredients a Pizza can have.
  
- [ ] Commit you changes with a nice `git` message like `"Solve week-1 part 1"` or similar.


### - Part two -
#### To watch:

- [ ] Watch **"Section 7: Spring Configuration with
  Java Annotations - Inversion of Control"** *lesson 51, and 53 through 56*. Skip Project setup as it's not needed.
- [ ] Watch **"Section 8: Spring Configuration with
  Java Annotations - Dependency Injection"** lessons 58 to 74.

#### To do:

- [ ] Convert the code to use Spring annotations
  - Use the `@Component` annotation to set up dependency injection, and an injection method of you choosing 
  (`constructor`, `setter` or `field`) to inject the dependency into `PizzaDeliveryService`.
  - Use the `@Value` annotation to inject literal values and values from `application.properties` file. 
  - Use `@Qualifier` to resolve Bean ambiguity.
- [ ] **[OPTIONAL]** Organize existing classes into a package structure (`model`, `service`) 
