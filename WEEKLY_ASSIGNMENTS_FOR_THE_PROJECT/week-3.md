## Week Three

### "I just want to REST and have some pizza."

It's time to model our application as a REST API.

#### To watch:

- [ ] Watch "Section 56: Spring REST - Overview".
- [ ] Watch "Section 57: Spring REST - JSON Data Binding".
- [ ] Watch "Section 58: Spring REST - Create a Spring REST Controller".
- [ ] Watch "Section 59: Spring REST - Retrieve POJOs as JSON".
- [ ] Watch "Section 60: Spring REST - Using @PathVariable for REST Endpoints".
- [ ] Watch "Section 61: Spring REST - Exception Handling".
- [ ] Watch "Section 62: Spring REST - API Design Best Practices".

#### To read:

- Learn about the @ResponseBody annotation:

      https://www.baeldung.com/spring-request-response-body


#### To do:

- [ ] Implement a **REST Api** from the following specification:
  - `GET /api/pizzeria/menu` Lists available pizza sizes and Pizzas that can be
    ordered from the pizzeria restaurant.
  - `GET /api/pizzeria/` Return details about the current pizzeria used by the `DeliveryService` (i.e. name, address...).
  - `GET /api/customer/{username}` Takes a `@PathVariable` userName, and returns details about that customer if it exists.
  - `POST /api/customer` Allows registering a new customer with data supplied in the body of the request.
  - `PUT /api/customer` Updates the customer passed in the body of the request if it exists.
  - `DELETE /api/customer/{username}` Delete the customer with username passed as path variable.
  - `POST /api/delivery/order` Allows to order a delivery. The request body must contain a `DeliveryOrderForm` with data
  about the customer and one or more pizza order details (i.e. pizza, size and quantity).
  - `GET /api/delivery/list` Lists current orders submitted to `DeliveryService`.
  
Feel free to remove unneeded files from previous assignments if any, and add any helper classes/code you need to achieve the above functionality.

- [ ] Use `@ControllerAdvice` to define `@ExceptionHandler`s for edge cases of the REST Api. What if someone orders a pizza that we 
don't have on the menu ?
- [ ] **[OPTIONAL]** Convert data from the `DeliveryOrderForm` to models used by the App with a [Spring Converter](https://www.baeldung.com/spring-type-conversions#creating-a-custom-converter).
- [ ] **[OPTIONAL]** Add basic configuration for your server in `application.properties` (profile, port etc...).
