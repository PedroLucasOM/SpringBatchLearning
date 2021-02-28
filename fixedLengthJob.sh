mvn clean package -Dmaven.test.skip=true
java -jar ./target/SpringBatchLearning-0.0.1-SNAPSHOT.jar --spring.batch.job.names=fixedLengthJob;
read;
