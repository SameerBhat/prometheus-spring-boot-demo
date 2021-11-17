
#Step 1
```
cd  prometheus-2.31.1.darwin-amd64
```


#Step 2
```
./prometheus --web.enable-lifecycle
```

This will run the prometheus on port 9090 

To reload config 
```
curl -s -XPOST localhost:9090/-/reload
```

#Step 3

cd into demo-spring-boot
run 
```
mvn spring-boot:run
```



- /count --> testing_count
- /time -->  testing_time


- testing_count_seconds_count
- testing_count_seconds_sum
- testing_count_seconds_max
