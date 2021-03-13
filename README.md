<h1 align="center">Welcome to SpringBatchLearning 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-green.svg?cacheSeconds=2592000" />
  <img src="https://img.shields.io/badge/java-1.8-green.svg" />
  <img src="https://img.shields.io/badge/spring-2.4.1-green.svg" />
  <a href="https://github.com/PedroLucasOM/MovieViewer#readme" target="_blank">
    <img alt="documentation" src="https://img.shields.io/badge/documentation-yes-green.svg" />
  </a>
  <a href="https://github.com/kefranabg/readme-md-generator/graphs/commit-activity" target="_blank">
    <img alt="maintenance" src="https://img.shields.io/badge/maintained-yes-green.svg" />
  </a>
  <a href="https://twitter.com/PedroLucasOM" target="_blank">
    <img alt="Twitter: PedroLucasOM" src="https://img.shields.io/twitter/follow/PedroLucasOM.svg?style=social" />
  </a>
</p>

> :computer: Project to learn about Spring Batch Framwork :leaves: with 17 jobs implementation.

## Topics

1. [About SpringBatch](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Usability](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Behavior](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Important Starting Points](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Benefits](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Implementation Sceneries](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Steps Types](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Chunk Features](https://github.com/PedroLucasOM/SpringBatchLearning)
      - [ItemReader](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [MultiResourceItemReader](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [JdbcPagingItemReader](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [ItemRepositoryReader](https://github.com/PedroLucasOM/SpringBatchLearning)
      - [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [ValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [BeanValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [CompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [ScriptItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning)
      - [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [MultiResourceItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [JdbcBatchItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [CompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning)
          - [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning)
2. [About Project](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Prerequisites](https://github.com/PedroLucasOM/SpringBatchLearning#prerequisites)
   - [Implemented Jobs](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job1](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job2](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job3](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job4](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job5](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job6](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job7](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job8](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job9](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job10](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job11](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job12](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job13](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job14](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job15](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job16](https://github.com/PedroLucasOM/SpringBatchLearning)
     - [Job17](https://github.com/PedroLucasOM/SpringBatchLearning)
   - [Configuration](https://github.com/PedroLucasOM/SpringBatchLearning#configuration)
     - [Windows](https://github.com/PedroLucasOM/SpringBatchLearning#windows)
     - [Linux](https://github.com/PedroLucasOM/SpringBatchLearning#linux)
     - [Mac](https://github.com/PedroLucasOM/SpringBatchLearning#mac)
   - [Run](https://github.com/PedroLucasOM/SpringBatchLearning#run)
   - [Usage](https://github.com/PedroLucasOM/SpringBatchLearning#usage)
   - [Author](https://github.com/PedroLucasOM/SpringBatchLearning#author)
   - [Contributing](https://github.com/PedroLucasOM/SpringBatchLearning#-contributing)
   - [Show your support](https://github.com/PedroLucasOM/SpringBatchLearning#show-your-support)
   - [License](https://github.com/PedroLucasOM/SpringBatchLearning#-license)
   
## 1. About SpringBatch

Is a framework that uses the Java Virtual Machine and the Spring Ecosystem for build batch applications. By definition, batch systems are systems that realize a process of a finite amount of data without interaction or interruption.

### Usability

You can choice use Spring Batch when the application that you need to build contains the bellow requirements:

- Don't need a user interface or interaction
- Can be executed by triggers like manual interaction or schedule systems
- Process colossal amount of data

### Behavior

The Spring Batch Framework came to facility the job building. A job in the Spring Batch is a state machine with a sequence of steps that has your own logic.

The components that compose this machine state are:

- **Job Repository** <br/>
Keeps the state of job that is shared with remaining components of the solution
- **Step** <br/>
Represents a step or stage in which a logic is executed.
Steps are chained for obtein the final product of the processing.
If the step is based in Chunk, he will have stages of reading (ItemReader), processing (ItemProcessor) and writing (ItemWriter).
If the step is based in Tasklet, he will have only method called execute and you will have to implement all parts of the process in manual way.
- **Job Launcher** <br/>
Executes the job really, considering factors like execute way (simple thread, distributed), parameter validating, restart and another properties of execution.

### Important Starting Points

To start build batch application, it's need to think in 7 important points:

1. **Time** <br/>
How much time is needed to process this data without to harm remaining systems that deppends of this data?
2. **Integrity** <br/>
If this process fail, how to ensure the integrity of this data?
3. **Execution** <br/>
How this system will be executed in scheduled way?
4. **Monitoring** <br/>
How to follow the execution of this process?
5. **Scalability** <br/>
To ensure that this process will be executed in a definied time window.
6. **Disponibility** <br/>
If the scalability was harmed, the disponibility can be affected.
7. **Usability** <br/>
In some systems, usability reffers to Graphic Interface, but, in batch systems, reffers to code organization and how much is clear to find and undestand errors.

### Benefits

- **Maintainability** <br/>
The framework simplifies development by providing testing and exception handling tools, logs, everything in the Java and Spring universe.
- **Flexibility** <br/>
*You can run the batch system on any machine with a JVM. In addition, you are able to reuse and share logic between Java systems.*
- **Usability** <br/>
Although batch systems do not have a user interface, their usability applies to the code itself. As systems execute periodically, they need to be designed facilitating monitoring and bug detection, aiming to save the company’s operating resources.
- **Scalability** <br/>
Batch systems often process a large amount of data. As the volume grows, a single process could not be sufficient to meet the time requirement. In this situation, the complex task should be divided to be performed in parallel. The mainframe is fast but has no robust parallelism features. On the other hand, Spring Batch has complex procedures such as transactional control and orchestration of multiple batch instances.
- **Availability** <br/>
Running a batch system can be costly in terms of computational resources. Therefore, this running should not impact the availability of other systems that consume the processed data. Identifying peak times to fit these executions becomes extremely important, and ensures that processing is done within the available time window. With Spring Batch you can schedule batch execution, stop it if necessary, and restart it without affecting data integrity.
- **Security** <br/>
Although batch systems are not exposed to hacker attacks like traditional web systems, there are still security requirements that must be met. The main one is the integrity of the data. Is the processed data being validated? If the batch is stopped, does it recover without compromising data integrity? Is sensitive data stored securely? Is access to external systems secure, without exposing sensitive data? All these issues are addressed by Spring Batch, the developer is solely responsible for using the right components and configurations for each scenario.
- **Support** <br/>
Java and Spring community are huge, so it is easy to ask questions and find Spring Batch applications following the best practices.
- **Cost** <br/>
Maintaining a Spring Batch job requires cheaper hardware (you only need a computer running Java), the framework is easy to use, and it doesn’t need support or licenses for development.

### Implementation Sceneries

- **Extract, Transform, Load (ETL)** <br/>
ETLs are common in integration scenarios. For example, an application may periodically generate files with data that needs to be loaded, transformed, and persisted into another application's database.
- **Data Migration** <br/>
Most companies have legacy systems. When adopting a new system, companies have to migrate legacy data to a database compatible with the new system, this is where Spring Batch shines with its reading, writing, and processing components.
- **Parallel Processing** <br/>
There are scenarios where simply processing a single operation faster is not sufficient due to the large volume of data. The only way to optimize time is by processing more operations in parallel. This requires a robust transactional control and failure recovery mechanisms, which are complex to implement, but luckily Spring Batch has taken care of that.
- **Task orchestration** <br/>
Jobs can be complex, so it is common to find them divided into different applications. To ensure that the macro operation is performed correctly, the applications should be orchestrated, which is a relatively simple task using Spring Cloud Dataflow.
- **24/7 processing** <br/>
When data flow is constant, if each new data triggers a full processing, the solution would be inefficient. Ideally, you should have a throughput boost mechanism to optimize processing, which is something that Spring Batch also allows you to configure.

### Steps Types

- **Tasklet** → Is use to build a simple logic. You can implement your logic or use provided implementations of the Spring Batch.

    Some provided implementations are:

    - **CallableTaskletAdapter** → Using this, is possible to create a Tasklet that executes a separated  thread, but without parameterize the step execution.
    - **MethodInvokingTaskletAdapter** → This implementation is useful for allowing an existing logic to be called instead of declaring a tasklet just to encapsulate it.
    - **SystemCommandTasklet** → If a command needs to be run on the system, this is the appropriate tasklet implementation. The command will be executed asynchronously with the defined timeout.
- **Chunk →** Is use to build a robust logic with stages. These stages are divided in *ItemReader*, *ItemProcessor* and *ItemWriter*. The ItemProcessor is optional. To build a step with chunk, it's needed define a commit interval (chunk lenght). It informs how many items are required to effectuate the transaction in the database and is essential to define job performance and the batch restart.

### Chunk Features

#### ItemReader
Strategy interface for providing the data. Implementations are expected to be stateful and will be called multiple times for each batch, with each call to read() returning a different value and finally returning null when all input data is exhausted.

   - ##### FlatFileItemReader
   - ##### MultiResourceItemReader
   - ##### JdbcCursorItemReader
   - ##### JdbcPagingItemReader
   - ##### ItemRepositoryReader

#### ItemProcessor
Interface for item transformation. Given an item as input, this interface provides an extension point which allows for the application of business logic in an item oriented processing scenario. It should be noted that while it's possible to return a different type than the one provided, it's not strictly necessary. Furthermore, returning null indicates that the item should not be continued to be processed.

   - ##### ValidatingItemProcessor
   - ##### BeanValidatingItemProcessor
   - ##### CompositeItemProcessor
   - ##### ScriptItemProcessor
   - ##### ClassifierCompositeItemProcessor

#### ItemWriter
Basic interface for generic output operations. Class implementing this interface will be responsible for serializing objects as necessary. Generally, it is responsibility of implementing class to decide which technology to use for mapping and how it should be configured.

   - ##### FlatFileItemWriter
   - ##### MultiResourceItemWriter
   - ##### JdbcBatchItemWriter
   - ##### ItemRepositoryWriter
   - ##### CompositeItemWriter
   - ##### ClassifierCompositeItemWriter

## Prerequisites

- docker

## Configuration

To run a specific job, you need to set a envionment variable called JOB_NAME with value of the job that you want execute.

### Windows

In the Command Prompt, run:

``` sh
set JOB_NAME=jobName
```

### Linux

In the terminal, run:

``` sh
export JOB_NAME=jobName
```

### Mac

In the terminal, run:

```sh
touch ~/.bash_profile; open ~/.bash_profile
```

In TextEdit, add:

```sh
export JOB_NAME=jobName
```

Save the .bash_profile file and Quit (Command + Q) Text Edit.

## Run

With the docker started, execute this command at the project root:

```sh
docker-compose up -d --build
```

## Usage

```sh
npm run test
```

## Author

👤 **Pedro Lucas**

* Twitter: [@PedroLucasOM](https://twitter.com/PedroLucasOM)
* Github: [@PedroLucasOM](https://github.com/PedroLucasOM)
* LinkedIn: [@PedroLucasOM](https://linkedin.com/in/PedroLucasOM)

## 🤝 Contributing

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/PedroLucasOM/SpringBatchLearning/issues).

## Show your support

Give a :star: if this project helped you!

## 📝 License

Copyright © 2021 [Pedro Lucas](https://github.com/PedroLucasOM). <br />
