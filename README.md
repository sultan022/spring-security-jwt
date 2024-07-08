# spring-security-jwt


application has total 4 main endpoints exposed on port 8081

/login to authenticate yourself 
/posts to get posts
/users to get users
/comments to get comments

------ HOW TO AUTHENTICATE

1) please use below payload to authenticate yoursellf using /login endpoint, this will return a JWT token

{
"username":"user",
"password":"user"
}


2) use the JWT token as Bearer Token

----- SAMPLE curl command LOGIN 


curl --location 'localhost:8081/login' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=A8A8CFA7DADAD8C87FECC69DA7AAA5BB' \
--data '{
"username":"user",
"password":"user"

}'


------ SAMPLE curl commmand comments

curl --location 'localhost:8081/comments' \
--header 'Authorization: Bearer eyJhbGciOiJIUzUxMiJ9.eyJpc1VzZXIiOnRydWUsInN1YiI6InVzZXIiLCJpYXQiOjE3MjA0NjcxMzksImV4cCI6MTcyMDQ2ODYzOX0.0if3voiBI2I_hR--rYo0qwtj29RDtabccwM74BCmm70TR12W1ccLL3Mz_fZPT61pCcFm50OB6SKY2HDY7q_izg' \
--header 'Cookie: JSESSIONID=A8A8CFA7DADAD8C87FECC69DA7AAA5BB'



