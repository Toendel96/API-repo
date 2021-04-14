# IO.Swagger - ASP.NET Core 3.0 Server

Some description here of the full API  GitHub Flavored Markdown can be used for rich text representation,     such as **bold**, *italic* and [links](https://swagger.io).           # Useful links for the tasks:  * **[REST Design Guidelines V4](https://confluence.tech.dnb.no/pages/viewpage.action?pageId=33488367)**  * **[SwaggerHub Way of Work](https://confluence.tech.dnb.no/display/KKO/SwaggerHub%3A+REST+API+Design+tool\\#SwaggerHub:RESTAPIDesigntool-WayofWork)**      

## Run

Linux/OS X:

```
sh build.sh
```

Windows:

```
build.bat
```

## Run in Docker

```
cd src/IO.Swagger
docker build -t io.swagger .
docker run -p 5000:5000 io.swagger
```
