# SPRINGBOOT API IN ATLAS MONGO DB RELATIONSHIPS
## Requirements
- github link -> https://github.com/scbushan05/spring-boot-mongodb
- jdk - version 19
- Intellij
- Database -> Mongodb (Atlas... i.e. online)


- initializer url -> https://start.spring.io/

## mvn commands
- mvn clean
- mvn clean compile
- mvn test

## Tomcat
- Tomcat port: 8080

## Solving plugin errors:
- Now lets say I had 10 such plugins which didn't get resolve and among them the first was 'org.apache.maven.plugins:maven-site-plugin' I went to '.m2/repository/org/apache/maven/plugins/' and deleted the directory 'maven-site-plugin' and did a maven reimport again. Guess what, particular missing plugin got dowloaded. And I just followed similar steps for other missing plugins and all got resolved.
- link -> https://stackoverflow.com/questions/20496239/maven-plugins-can-not-be-found-in-intellij

## NB : 
- While opening the project in IDEA such as Intellij IDEA, open the last 'demo' file


## Killing a process in cmd:
- First determine process id occupied by that port i.e. port 8080 by running:<br>

      netstat -ano | findstr :8080
- Then kill the process

      netstat -ano | findstr :8080

## Layers 
- API layer - Controller (Contains GET, POST, PUT, DELETE)
- Service Layer - Business logic
- Data Access Layer - 

## API 
### One To Many:
POST-> Create Author and Posts
endpoint -> http://localhost:8080/api/v1/author/create-author
body :
      
      {
          "name":"Ken",
          "posts": [
              {
                  "post_name": "Post 1"
              },
                {
                  "post_name": "Post 2"
              }
          ]
      }
response :


      {
          "name":"Ken",
          "posts": [
              {
                  "post_name": "Post 1"
              },
                {
                  "post_name": "Post 2"
              }
          ]
      }


### One To One:
POST-> Create Author and Posts
endpoint -> http://localhost:8080/api/v1/author/create-author
body :

      {
          "name":"Ken",
          "profile":{
              "profile_name": "Profile 1"
          }
      }
response :


      {
          "id": 6,
          "name": "Ken",
          "posts": null,
          "profile": {
              "profile_name": "Profile 1"
          }
      }

## GET -> get all authors:
endpoint -> http://localhost:8080/api/v1/author/get-authors
Response :

      [
          {
              "id": 1,
              "name": "Ken",
              "posts": [
                  {
                      "post_name": "Post 2"
                  }
              ],
              "profile": null
          },
          {
              "id": 2,
              "name": "Ken",
              "posts": [
                  {
                      "post_name": "Post 2"
                  }
              ],
              "profile": null
          },
          {
              "id": 3,
              "name": "Ken",
              "posts": [
                  {
                      "post_name": "Post 2"
                  }
              ],
              "profile": null
          },
          {
              "id": 4,
              "name": "Ken",
              "posts": [
                  {
                      "post_name": null
                  },
                  {
                      "post_name": null
                  }
              ],
              "profile": null
          },
          {
              "id": 5,
              "name": "Ken",
              "posts": [
                  {
                      "post_name": "Post 1"
                  },
                  {
                      "post_name": "Post 2"
                  }
              ],
              "profile": {
                  "profile_name": "Profile 1"
              }
          },
          {
              "id": 6,
              "name": "Ken",
              "posts": null,
              "profile": {
                  "profile_name": "Profile 1"
              }
          },
          {
              "id": 7,
              "name": "Martin",
              "posts": null,
              "profile": {
                  "profile_name": "Profile 1"
              }
          },
          {
              "id": 8,
              "name": "Ken",
              "posts": [
                  {
                      "post_name": "Post 1"
                  },
                  {
                      "post_name": "Post 2"
                  }
              ],
              "profile": {
                  "profile_name": "Profile 1"
              }
          }
      ]