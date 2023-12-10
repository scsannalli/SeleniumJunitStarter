# Selenium Webdriver and Junit test automation starter

## How to use with demo app? 

### clone the project
```
git clone 
```

### start the demo app
```
docker run --rm -it -p 3000:3000 spreecommerce/spree:3.6.4
```

### run tests
```
mvn test
```


## How to Start using it for your project ?

- update `BASE_URL` of your application in `src/main/config/urls.json`
- refer to `LoginTests`, 
- Add `tests` in `src/test/java`
- Add `locators` in `src/main/java/pages`
- Add `implementation` in `src/main/java/steps`
- Run tests `mvn test`

