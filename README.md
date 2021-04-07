# RewardProgram

## 1. Run the program RewardProgramApplication.java
## 2. Application is using embeded database.  
URL: http://localhost:8080/h2-console  
Username: sa  
Password: password
## 3. Insert dummy records using swagger post API.  
http://localhost:8080/swagger-ui.html  
Sample Data
```
[
  {"customerName": "tan","transactionDate": "2020-02-07T02:16:22.133Z","transactionAmount": 150},
  {"customerName": "tan","transactionDate": "2021-02-07T02:16:22.133Z","transactionAmount": 78},
  {"customerName": "tan","transactionDate": "2021-03-07T02:16:22.133Z","transactionAmount": 70},
  {"customerName": "tan","transactionDate": "2021-04-07T02:16:22.133Z","transactionAmount": 70},
  {"customerName": "san","transactionDate": "2020-02-07T02:16:22.133Z","transactionAmount": 70},
  {"customerName": "san","transactionDate": "2021-02-07T02:16:22.133Z","transactionAmount": 70},
  {"customerName": "san","transactionDate": "2021-03-07T02:16:22.133Z","transactionAmount": 70},
  {"customerName": "san","transactionDate": "2021-04-07T02:16:22.133Z","transactionAmount": 70},
]
```
## 4. Run Get API in Swagger to get the report.
Sample response.  
```
[
  {
    "monthReports": [
      {
        "name": "APRIL",
        "reward": 152
      },
      {
        "name": "MARCH",
        "reward": 154
      },
      {
        "name": "FEBRUARY",
        "reward": 15
      }
    ],
    "totalReward": 321,
    "name": "tan"
  },
  {
    "monthReports": [
      {
        "name": "FEBRUARY",
        "reward": 20
      }
    ],
    "totalReward": 20,
    "name": "tan"
  }
]
```

