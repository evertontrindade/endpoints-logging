# How to show all rest paths created by @RequestMapping annotation    

## About the project
This repository is an example to how we can to show all endpoints defined by request mapping on application logging with a spring-boot code.

## Built With

- Java
- Spring-boot
- Gradle

## Getting start

### Prerequisites
* Java [version 17.0.12] - Used to execute: 17.0.12-amzn

### Usage
1. Clone the repo
   ```shell
   git clone https://github.com/evertontrindade/endpoints-logging.git
   ```
2. Access project folder
3. start the application
   ```shell
   ./gradlew clean bootRun
   ```
   
### Evidences

```shell
> Task :bootRun

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.2)

2024-07-31T23:49:21.626-03:00 TRACE 36394 --- [actuator-endpoint-definition] [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 
        c.e.a.c.MagicController:
        {GET [/v1/magics/{finger}/discover]}: discover(String)
2024-07-31T23:49:21.631-03:00 TRACE 36394 --- [actuator-endpoint-definition] [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 
        c.e.a.c.PingController:
        {POST [/ping]}: pong(PingRequest)
        {GET [/ping]}: echo()
2024-07-31T23:49:21.634-03:00 TRACE 36394 --- [actuator-endpoint-definition] [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 
        o.s.b.a.w.s.e.BasicErrorController:
        { [/error]}: error(HttpServletRequest)
        { [/error], produces [text/html]}: errorHtml(HttpServletRequest,HttpServletResponse)
2024-07-31T23:49:21.640-03:00 DEBUG 36394 --- [actuator-endpoint-definition] [           main] s.w.s.m.m.a.RequestMappingHandlerMapping : 5 mappings in 'requestMappingHandlerMapping'
```

### Contact

- Everton Vasconcelos - [everton.etav@gmail.com](everton.etav@gmail.com)
