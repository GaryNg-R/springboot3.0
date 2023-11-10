<html>
<head>
    <title>My HTML page</title>
</head>
<body>
My HTML page's body
</body>
</html>

##JSP

/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp  (manually create the folder and file)
/say-hello-jsp => SayHelloController - sayHelloJsp method   (matching the prefix and suffix in application.properties)
                                                                ***spring.mvc.view.prefix=/WEB-INF/jsp/
                                                                   spring.mvc.view.suffix=.jsp


**need this
		<dependency>
			<groupId>org.apache.tomcat.embed</groupId>
			<artifactId>tomcat-embed-jasper</artifactId>
		</dependency>