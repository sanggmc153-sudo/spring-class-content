# Task: Spring boot 프로젝트 생성

다음 스펙으로 Spring boot Maven 프로젝트 생성:
- Group: com.yonsai / Artifact: Day62_20260820
- Java 17 / Spring Boot 4.0.7
- Dependencies: web, devtools , thymeleaf , lombok, mysql,Spring Data JPA

```powershell
curl.exe "https://start.spring.io/starter.zip?type=maven-project&groupId=com.yonsai&artifactId=Day62_20260820&name=Day62_20260820&javaVersion=17&bootVersion=4.0.7&dependencies=web,devtools,thymeleaf,lombok,mysql,data-jpa" -o project.zip
mkdir Day62_20260820
tar -xf project.zip -C Day62_20260820
rm project.zip
```

**검증**: `Day62_20260820/pom.xml`, `Day62_20260820/src` 존재 확인