# Task: Spring boot 프로젝트 생성

다음 스펙으로 Spring boot Maven 프로젝트 생성:
- Group: com.yonsai / Artifact: Day58_20260813
- Java 17 / Spring Boot 4.0.7
- Dependencies: web, devtools

```powershell
curl.exe "https://start.spring.io/starter.zip?type=maven-project&groupId=com.yonsai&artifactId=Day58_20260813&name=Day58_20260813&javaVersion=17&bootVersion=4.0.7&dependencies=web,devtools" -o project.zip
mkdir Day58_20260813
tar -xf project.zip -C Day58_20260813
rm project.zip
```

**검증**: `Day58_20260813/pom.xml`, `Day58_20260813/src` 존재 확인