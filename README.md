<h1 align="center" width="100vw">
  <img alt="Logo: SpringBatchLearning" src="https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/logo-sbl.png" />
</h1>
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

> :computer: Project to learn about Spring Batch Framwork :leaves: with 17 jobs implementation

# Topics

1. [About SpringBatch](https://github.com/PedroLucasOM/SpringBatchLearning#1-about-springbatch)
   - [Usability](https://github.com/PedroLucasOM/SpringBatchLearning#usability)
   - [Behavior](https://github.com/PedroLucasOM/SpringBatchLearning#behavior)
   - [Important Starting Points](https://github.com/PedroLucasOM/SpringBatchLearning#important-starting-points)
   - [Benefits](https://github.com/PedroLucasOM/SpringBatchLearning#benefits)
   - [Implementation Sceneries](https://github.com/PedroLucasOM/SpringBatchLearning#implementation-sceneries)
   - [Steps Types](https://github.com/PedroLucasOM/SpringBatchLearning#steps-types)
   - [Chunk Features](https://github.com/PedroLucasOM/SpringBatchLearning#chunk-features)
      - [ItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#itemreader)
          - [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader)
          - [MultiResourceItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#multiresourceitemreader)
          - [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader)
          - [JdbcPagingItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcpagingitemreader)
          - [ItemRepositoryReader](https://github.com/PedroLucasOM/SpringBatchLearning#itemrepositoryreader)
      - [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor)
          - [ValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#validatingitemprocessor)
          - [BeanValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingitemprocessor)
          - [CompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#compositeitemprocessor)
          - [ScriptItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#scriptitemprocessor)
          - [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor)
      - [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter)
          - [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter)
          - [MultiResourceItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#multiresourceitemwriter)
          - [JdbcBatchItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcbatchitemwriter)
          - [ItemRepositoryWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemrepositorywriter)
          - [CompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#compositeitemwriter)
          - [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter)
2. [About Project](https://github.com/PedroLucasOM/SpringBatchLearning#2-about-project)
   - [Prerequisites](https://github.com/PedroLucasOM/SpringBatchLearning#prerequisites)
   - [Implemented Jobs](https://github.com/PedroLucasOM/SpringBatchLearning#implemented-jobs)
     - [HelloWorldJob](https://github.com/PedroLucasOM/SpringBatchLearning#helloworldjob)
     - [EvenOrOddJob](https://github.com/PedroLucasOM/SpringBatchLearning#evenoroddjob)
     - [FixedLengthJob](https://github.com/PedroLucasOM/SpringBatchLearning#fixedlengthjob)
     - [DelimitedFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#delimitedfilejob)
     - [MultipleFormatsFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#multipleformatsfilejob)
     - [MultipleLineFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#multiplelinefilejob)
     - [MultipleFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#multiplefilejob)
     - [CursorDataSourceJob](https://github.com/PedroLucasOM/SpringBatchLearning#cursordatasourcejob)
     - [PaginatorDataSourceJob](https://github.com/PedroLucasOM/SpringBatchLearning#paginatordatasourcejob)
     - [BudgetStatementJob](https://github.com/PedroLucasOM/SpringBatchLearning#budgetstatementjob)
     - [ValidatingJob](https://github.com/PedroLucasOM/SpringBatchLearning#validatingjob)
     - [BeanValidatingJob](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingjob)
     - [CompositeJob](https://github.com/PedroLucasOM/SpringBatchLearning#compositejob)
     - [ValidatingScriptJob](https://github.com/PedroLucasOM/SpringBatchLearning#validatingscriptjob)
     - [ClassifierJob](https://github.com/PedroLucasOM/SpringBatchLearning#classifierjob)
     - [BankAccountGenerateJob](https://github.com/PedroLucasOM/SpringBatchLearning#bankaccountgeneratejob)
     - [PointSheetJob](https://github.com/PedroLucasOM/SpringBatchLearning#pointsheetjob)
   - [Configuration](https://github.com/PedroLucasOM/SpringBatchLearning#configuration)
     - [Windows](https://github.com/PedroLucasOM/SpringBatchLearning#windows)
     - [Linux](https://github.com/PedroLucasOM/SpringBatchLearning#linux)
     - [Mac](https://github.com/PedroLucasOM/SpringBatchLearning#mac)
   - [Run](https://github.com/PedroLucasOM/SpringBatchLearning#run)
   - [Usage](https://github.com/PedroLucasOM/SpringBatchLearning#usage)
3. [Author](https://github.com/PedroLucasOM/SpringBatchLearning#3-author)
4. [Contributing](https://github.com/PedroLucasOM/SpringBatchLearning#4-contributing-)
5. [Show your support](https://github.com/PedroLucasOM/SpringBatchLearning#5-show-your-support)
6. [License](https://github.com/PedroLucasOM/SpringBatchLearning#6-license-)
   
# 1. About SpringBatch

Is a framework that uses the Java Virtual Machine and the Spring Ecosystem for build batch applications. By definition, batch systems are systems that realize a process of a finite amount of data without interaction or interruption.

## Usability

You can choice use Spring Batch when the application that you need to build contains the bellow requirements:

- Don't need a user interface or interaction
- Can be executed by triggers like manual interaction or schedule systems
- Process colossal amount of data

## Behavior

The Spring Batch Framework came to facility the job building. A job in the Spring Batch is a state machine with a sequence of steps that has your own logic.

The components that compose this machine state are:

- **Job Repository**<br/>
Keeps the state of job that is shared with remaining components of the solution
- **Step** <br/>
Represents a step or stage in which a logic is executed.
Steps are chained for obtein the final product of the processing.
If the step is based in Chunk, he will have stages of reading (ItemReader), processing (ItemProcessor) and writing (ItemWriter).
If the step is based in Tasklet, he will have only method called execute and you will have to implement all parts of the process in manual way.
- **Job Launcher** <br/>
Executes the job really, considering factors like execute way (simple thread, distributed), parameter validating, restart and another properties of execution.

## Important Starting Points

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

## Benefits

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

## Implementation Sceneries

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

## Steps Types

- **Tasklet** → Is use to build a simple logic. You can implement your logic or use provided implementations of the Spring Batch.

    Some provided implementations are:

    - **CallableTaskletAdapter** → Using this, is possible to create a Tasklet that executes a separated  thread, but without parameterize the step execution.
    - **MethodInvokingTaskletAdapter** → This implementation is useful for allowing an existing logic to be called instead of declaring a tasklet just to encapsulate it.
    - **SystemCommandTasklet** → If a command needs to be run on the system, this is the appropriate tasklet implementation. The command will be executed asynchronously with the defined timeout.
- **Chunk →** Is use to build a robust logic with stages. These stages are divided in *ItemReader*, *ItemProcessor* and *ItemWriter*. The ItemProcessor is optional. To build a step with chunk, it's needed define a commit interval (chunk lenght). It informs how many items are required to effectuate the transaction in the database and is essential to define job performance and the batch restart.

## Chunk Features

### ItemReader
Strategy interface for providing the data. Implementations are expected to be stateful and will be called multiple times for each batch, with each call to read() returning a different value and finally returning null when all input data is exhausted.

##### FlatFileItemReader

Is a ItemReader that can read flat files - non structure files that your type can't be defined only by visualization. One of your components is:

- LineMapper → Is responsible to give meaning to data. This component has another two components:
    - LineTokenizer → Is responsible to read a line and divide it in words or tokens.
    - FieldSetMapper → Is responsible to take the tokens and parse it to domain object.

The reading mode can change by file type. Some very commons file types are:

- FixedLength → Files that have a fixed number of columns
- Delimited → Files that have your columns and data separated by a delimiter

##### MultiResourceItemReader

Is a ItemReader that can read multiple reasources sequentially. This ItemReader delegates the reading process to another reader that will read each file. This another reader can be, for example, a FlatFileItemReader.

##### JdbcCursorItemReader

Is a ItemReader that read the data of database with a string SQL statement and store it in memory. This way, ever that Spring Batch request a file, the ItemReader give it immediatement. At otherside, can overload memory.

##### JdbcPagingItemReader

Is a ItemReader similar to JdbcCursorItemReader that executes the SQL built by the PagingQueryProvider to retrieve requested data. The query is executed using paged requests of a size specified. Additional pages are requested when needed , returning an object corresponding to current position. The performance of the paging depends on the database specific features available to limit the number of returned rows. Setting a fairly large page size and using a commit interval that matches the page size should provide better performance.

##### ItemRepositoryReader

Is a ItemReader that uses JPA to make a select in database. The reader must be configured with a PagingAndSortingRepository, a Sort, and a pageSize greater than 0. 

### ItemProcessor
Interface for item transformation. Given an item as input, this interface provides an extension point which allows for the application of business logic in an item oriented processing scenario. It should be noted that while it's possible to return a different type than the one provided, it's not strictly necessary. Furthermore, returning null indicates that the item should not be continued to be processed.

##### ValidatingItemProcessor

Is a simple implementation of ItemProcessor that validates input with a custom validator and returns it without modifications. Should the given Validator throw a ValidationException this processor will re-throw it to indicate the item should be skipped, unless setFilter(boolean) is set to true, in which case null will be returned to indicate the item should be filtered.

##### BeanValidatingItemProcessor

Is a simple implementation of ItemProcessor that validates input with a custom validator and returns it without modifications. Should the given Validator throw a ValidationException this processor will re-throw it to indicate the item should be skipped, unless setFilter(boolean) is set to true, in which case null will be returned to indicate the item should be filtered.

##### CompositeItemProcessor

A ItemProcessor that chain multiples processors.

##### ScriptItemProcessor

Executes a custom script that receive as parameter the processing item and generated as output the result of this script execution. This script needs be a file with a supported script language.

##### ClassifierCompositeItemProcessor

A ItemProcessor that choice which processor is more adequate to each item.

### ItemWriter
Basic interface for generic output operations. Class implementing this interface will be responsible for serializing objects as necessary. Generally, it is responsibility of implementing class to decide which technology to use for mapping and how it should be configured.

##### FlatFileItemWriter

It is a ItemWrite that can be customized to write formatted data or stream in flat files. The location of the output file is defined by a Resource and must represent a writable file. Is possible to config the wirter to write type files fixed length and delimited. You can config too the header and footer of the file.

##### MultiResourceItemWriter

Is a ItemWriter that wraps another ItemWriter and creates a new output resource when the count of items written in current resource exceeds. You can set the limit of records per resource in setItemCountLimitPerResource(int). Suffix creation can be customized too.

##### JdbcBatchItemWriter

Is a ItemWriter that must recive an SQL query and a special callback for either of ItemPreparedStatementSetter - to use the traditional '?' placeholders - or ItemSqlParameterSourceProvider - to use the named parameters. This callback would be responsible for mapping the item to the parameters needed to execute the SQL statement. This writer is thread-safe after its properties are set, so it can be used to write in multiple concurrent transactions.

##### ItemRepositoryWriter

Is a ItemWriter that uses Spring Data to save data in database. By default, this writer will use CrudRepository.saveAll(Iterable) to save items, unless another method is selected with setMethodName(java.lang.String). The saveAll method depends of the chunk size. This writer is thread-safe after its properties are set, so it can be used to write in multiple concurrent transactions. The RepositoryItemWriter only stores Java Objects and not non primitives.

##### CompositeItemWriter

A ItemWriter that chain multiples writers.

##### ClassifierCompositeItemWriter

A ItemWriter that choice which writer is more adequate to each item.

# 2. About Project

## Implemented Jobs

Bellow, you will see how implemented jobs work:

## HelloWorldJob

**Objective:** This Job is responsible to write in the screen "Hello, World!".
It is a basic Job that is configured to calls the Tasklet Step that execute this action.

<b><i>JOB_NAME:</i></b> helloWorld

## EvenOrOddJob

**Objective:** This Job is responsible to print in the screen which specified numbers are even or odd.

It is configured to calls a Chunk Step that receive a Integer and returns a String. Is configured to process 10 records per transaction.

<details><summary><b>Show components</b></summary>
  <br/>
  
**Reader:** His reader is based in [ItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#itemreader) and returns a fixed list of numbers with values of 0 till 10.    <br/>
**Processor:** His processor is based in [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and receive each number, verify if is even or odd     and parse it to text with the following format: 'Item number é par' or 'Item number é impar'. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the processor.
  
  <br/>
</details>

<b><i>JOB_NAME:</i></b> evenOrOdd

## FixedLengthJob

**Objective:** This Job is responsible to read a flat file with a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) list in the fixed length format and write another file with the same records and format.

It is configured to calls a Chunk Step that receive a [ItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#itemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), both are typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>
  
**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the fixed length file [clients-fixed.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-fixed.txt) defining the columns name, nickname, age, email and salaryRange with int ranges, making unmarshiling to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and returning to the Step. <br/>
**Writer:** His writer is based in [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) and writes a flat file in following path /files/output/fixedLength.txt with the same columns, records and format. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> fixedLengthJob
<br>
<b><i>GENERATED_FILE:</i></b> fixedLength.txt

## DelimitedFileJob

**Objective:** This Job is responsible to read a flat file with a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) list in the delimited format and write another file with the same records and format.

It is configured to calls a Chunk Step that receive a [ItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#itemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), both are typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the delimited file [clients-delimited.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-delimited.txt) defining the reading columns name, nickname, age, email and salaryRange with the ',' like delimiter, making unmarshiling to [Client]() and returning to the Step. <br/>
**Writer:** His writer is based in [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) and writes a flat file in following path /files/output/delimitedFile.txt with the same columns, records and format, but using the ';' like delimiter. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> delimitedFileJob
<br>
<b><i>GENERATED_FILE:</i></b> delimitedFile.txt

## MultipleFormatsFileJob

**Objective:** This Job is responsible to read a flat file with a list of multiple records typed in the delimited format and print in the screen each record in your respective Java Object, calling the toString method.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), both are typed as general Java Object. Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>
  
**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the delimited file with multiple formats [clients-multiple-file1.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file1.txt), calling the lineMapper to do it. <br/>
**LineMapper:** The LineMapper called inside of Reader reads the lines and defines the type of each record according with your start column number. If it is 0, so it will be unmarshal to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). In case of the 1, it will be unmarshal to [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java). For both cases, the column properties are configured in their fieldSetMappers. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> multipleFormatsFileJob

## MultipleLineFileJob

**Objective:** This Job is responsible to read a flat file with a list of multiple records typed in the delimited format, agroup transactions that are bellow each client and add them in a [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java) list insided in a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) Java Object and print in the screen all clients with your respective transactions.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), both are typed as general Java Object. This Reader receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) that calls a lineMapper that will pass each record to your specific type and returns the result. Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the delimited file with multiple formats [clients-multiple-file1.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file1.txt), calling the lineMapper to do it. <br/>
**Custom Reader:** Is a reader that implements a ItemStreamReader and a ResourceAwareItemReaderItemStream, receive the [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) to call the read method and execute the business rule of put each bellow [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java) in a list of transactions insided in a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). <br/>
**LineMapper:** The LineMapper called inside of the [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) reads the lines and defines the type of each record according with your start column number. If it is 0, so it will be unmarshal to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). In case of the 1, it will be unmarshal to [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java). For both cases, the column properties are configured in their fieldSetMappers. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> multipleLineFileJob

## MultipleFileJob

**Objective:** This Job is responsible to read one or multiple flat files with a list of multiple records typed in the delimited format and print in the screen each record in your respective Java Object, calling the toString method.

It is configured to calls a Chunk Step that receive a [MultiResourceItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#multiresourceitemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), both are typed as general Java Object. This Reader receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) that calls a lineMapper that will pass each record to your specific type and returns the result. Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [MultiResourceItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#multiresourceitemreader) that receive one or multiple flat files and delegates the reader to a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads delimited files with multiple formats, in this case: [clients-multiple-file1.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file1.txt), [clients-multiple-file2.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file2.txt), [clients-multiple-file3.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file3.txt). After it, calls the lineMapper and make this business rule. <br/>
**LineMapper:** The LineMapper called inside of [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) reads the lines and defines the type of each record according with your start column number. If it is 0, so it will be unmarshal to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). In case of the 1, it will be unmarshal to [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java). For both cases, the column properties are configured in their fieldSetMappers. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> multipleFileJob

## CursorDataSourceJob

**Objective:** This Job is responsible to read data of a configured DataSource based in a native inputed query and print the returned data in the screen.

It is configured to calls a Chunk Step that receive a [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader) that receive a DataSource and a native select query to get the data. This reading way is based in get all data from DataSource and store it in the memory while the jobs is running. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> cursorDataSourceJob

## PaginatorDataSourceJob

**Objective:** This Job is responsible to read data of a configured DataSource based in a native sql mounted with a queryProvider and print the returned data in the screen.

It is configured to calls a Chunk Step that receive a [JdbcPagingItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcpagingitemreader) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [JdbcPagingItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcpagingitemreader) that receive a DataSource and a queryProvider to mount the sql query with pagination and a sortKey to get the data. This reading way is based in get data from DataSource per page and repeat it for each chunk transaction. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> paginatorDataSourceJob

## BudgetStatementJob

**Objective:** This Job is responsible to read launchs of a configured Datasource based in a native sql, group them by budget statements and write each budget statement in a file in the following path: /files/output/${budgetStatement.codeNatureExpense}.

It is configured to calls a Chunk Step that receive a [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader) typed as [Launch](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Launch.java), a custom writer and a footer writer. Is configured to process 1 record per transaction. Has too two listeners that can be called before writer call, after writer call, before chunk call and after chunk call.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader) that receive a DataSource and a native select query to get the launchs. This reading way is based in get all launchs from DataSource and store it in the memory while the job is running. <br/>
**Custom Reader:** Is a reader that implements a ItemStreamReader, receive the [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) to call the read method and execute the business rule of categorize the returned launchs and returns the list of [BudgetStatement](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BudgetStatement.java). <br/>
**Custom Writer:** Is a writer that reads the list of [BudgetStatement](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BudgetStatement.java) and, before each budget statement, create the respective file to that budget. Inside of his, there is a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) that is responsible to write the data in the created file, calling the headerCallback, footerCallback, suffixCreator and lineAggregator to format the received data.
**Footer Callback:** Is a listener that is called before each writing demand to count the number of records and put it on the footer when the writer is called.

  <br/>
</details>

<b><i>JOB_NAME:</i></b> budgetStatementJob
<br>
<b><i>GENERATED_FILES:</i></b> The generated files will have like name ${budgetStatement.codeNatureExpense}.txt

## ValidatingJob

**Objective:** This Job is responsible to read a flat file with a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) list in the delimited format, valid these records verifying if the emails are duplicated and write the correct records in the screen.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader), a [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), all typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and reads the delimited file [clients-validating.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-validating.txt) defining the reading columns name, nickname, age, email and salaryRange with the ',' like delimiter, making unmarshiling to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and returning to the Step. <br/>
**Processor:** His processor is based in [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and, for each client, he verifies if the client email exists in the emails list of the class. If the verification returns true, it throws a ValidationException. If the verification returns false and the item pass in the verification, the client email is stored in the list of emails. For both cases, the cycle keep working untill process all records. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> validatingJob

## BeanValidatingJob

**Objective:** This Job is responsible to read a flat file with a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) list in the delimited format, valid these records verifying if the fields are corret according to [BeanValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingitemprocessor) and write the correct records in the screen.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader), a [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), all typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and reads the delimited file [clients-bean-validating.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-bean-validating.txt) defining the reading columns name, nickname, age, email and salaryRange with the ',' like delimiter, making unmarshiling to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and returning to the Step. <br/>
**Processor:** His processor is based in [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and, for each client, he verifies if the client is valid according with [BeanValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingitemprocessor). If the verification returns true, it will skip the client item. If the verification returns false and the item pass in the verification, the client item is returned. For both cases, the cycle keep working untill process all records. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> beanValidatingJob

## CompositeJob

**Objective:** This Job is responsible to read a flat file with a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) list in the delimited format, valid these records verifying if the emails are duplicated and if the fields are corret according to [BeanValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingitemprocessor). After it, write the correct records in the screen.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader), a [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), all typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and reads the delimited file [clients-composite.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-composite.txt) defining the reading columns name, nickname, age, email and salaryRange with the ',' like delimiter, making unmarshiling to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and returning to the Step. <br/>
**Processor:** His processor is based in [CompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#compositeitemprocessor). This processor calls two anothers processors based in [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and, for each client, he verifies if the client is valid according with [BeanValidatingItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingitemprocessor) and if the client email exists in the emails list of the class. If the verification returns true, it will skip the client item. If the verification returns false and the item pass in the verification, the client item is returned. For both cases, the cycle keep working untill process all records. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results. <br/>

   <br/>
 </details>

<b><i>JOB_NAME:</i></b> compositeJob

## ValidatingScriptJob

**Objective:** This Job is responsible to read a flat file with a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) list in the delimited format, valid these records verifying if the fields are corret according to [ScriptItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#scriptitemprocessor) and write the correct records in the screen.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader), a [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), all typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and reads the delimited file [clients-validating-script.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-validating-script.txt) defining the reading columns name, nickname, age, email and salaryRange with the ',' like delimiter, making unmarshiling to [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and returning to the Step. <br/>
**Processor:** His processor is based in [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and, for each client, he verifies if the client is valid according with [ScriptItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#scriptitemprocessor). It will execute a JavaScript script and analyze the return of this script. If the item is returned, the client item will be returned to Step scope. If the null value is returned, it will skip the client item. For both cases, the cycle keep working untill process all records. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> validatingScriptJob

## ClassifierJob

**Objective:** This job is responsible to read a flat file with a General Java Object list that records can be typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) or [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java), classify these records and send each item to your respective processor - can be a [ClientProcessor](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/processor/ClientProcessor.java) or a [TransactionProcessor](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/processor/TransactionProcessor.java). After it, print returned records in the screen.

It is configured to calls a Chunk Step that receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader), a [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and a [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter), all typed as General Java Object. Is configured to process 1 record per transaction.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) typed as General Java Object and reads the delimited file [clients-classifier.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-classifier.txt), calling the lineMapper to do it and define the type of each item - if it is a [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) or a [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java). After it, the records are returned to Step scope. <br/>
**Processor:** His processor is based in [ClassifierCompositeItemProcessor
](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor) and, for each object, he verifies if the item is typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) or [Transaction](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Transaction.java), parsing each type to your respective processor - can be a [ClientProcessor](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/processor/ClientProcessor.java) or a [TransactionProcessor](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/processor/TransactionProcessor.java). <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

  <br/>
</details>

<b><i>JOB_NAME:</i></b> classifierJob

## BankAccountGenerateJob

**Objective:** This job is responsible to read a list of [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) in a configured DataSource, process these records and classify by salaryRange and build a [BankAccount](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccount.java). After it, the writer build a flat file with the valid accounts and persist it in the configured DataSource.

It is configured to calls a Chunk Step that receive a [JdbcPagingItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcpagingitemreader), a [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor), a [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter) and two @Qualifiers - to define the bean that will be injected - with two writers typed as [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) to be call in the steam() - makes the writers typed as [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) explicit in the call, since the [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter) isn't a instance of ItemStream.

The [BankAccountType](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccountType.java) can be:

- PRATA
- OURO
- PLATINA
- DIAMANTE
- INVALID (case the client has some wrong information)

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [JdbcPagingItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcpagingitemreader) that receive a DataSource with @Qualifier and a pagingQueryProvider to mount the sql query with pagination and a sortKey - in this case, the email - to get the list typed as [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java). This reading way is based in get data from DataSource per page and repeat it for each chunk transaction. <br/>
**Processor:** His processor is based in [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor) that calls as classifier the custom processor [BankAccountGenerateClassifier](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/processor/BankAccountGenerateClassifier.java). <br/>
**Custom Processor:** His custom processor implements a Classifier to return to the [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor). It is responsible to make a HashMap with the [BankAccountType](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccountType.java) and your respective processor. After it, it calls the returnFromSalaryRange() method of [BankAccountType](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccountType.java) parsing the salaryRange and, according this range, return the respective [BankAccountType](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccountType.java). Finally, get in the HashMap previously configured the respective processor and run it to make the [BankAccount](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccount.java). <br/>
**Classifier Writer:** His writer is based in [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter) that calls the method classifier(). This method verifies if the generated [BankAccount](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccount.java) has a instanciated [BankAccountType](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/BankAccountType.java). If it is true, the classifier calls the Composite Account Writer. If it is false, something was wrong with the [Client](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Client.java) and the Invalid Client Writer is called. <br/>
**Invalid Client Writer**: His custom writer takes the invalid clients and make a flat file with the [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) in the following path /files/output/invalidClients.txt. <br/>
**Composite Account Writer:** His custom writer is typed as [CompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#compositeitemwriter) and make a flat file with [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter). This flat file has bankAccountType, maxLimit and clientId as columns. The generated file is putted in the following path: /files/output/bankAccounts.txt. At same time that this happens, these records are persited in a configured DataSource with the [JdbcBatchItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#jdbcbatchitemwriter).

  <br/>
</details>

<b><i>JOB_NAME:</i></b> bankAccountGenerateJob
<br>
<b><i>GENERATED_FILES:</i></b> bankAccounts.txt and invalidClients.txt
<br>
<b><i>SELECT_QUERY:</i></b> ```select * from app_batch.bank_account;```

## PointSheetJob

**Objective:** This job is responsible to read a list of [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java) of a configured DataSource, process it verifying if each employee doesn't have any pointRegistry - if true, a invalid [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java) is builded with only registrationCode field and returned to writer, if false, a [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java) is builded with all fields and returned to writer too. After that, the writer is called following the following rule: if the item is a invalid [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java), a file is build with the registrationCode of the list of [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java). Otherwise, a formatted file is build with the correct list of [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java) at same time they are persisted in the configured DataSource.

It is configured to calls a Chunk Step that receive a [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader), a [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor), a [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter) and two @Qualifiers - to define the bean that will be injected - with two writers. One is typed as [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) and another is typed as [CompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#compositeitemwriter). Both are called in the steam() - makes the writers typed as [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) and [CompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#compositeitemwriter) explicit in the call, since the [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter) isn't a instance of ItemStream.

<details><summary><b>Show components</b></summary>
  <br/>

**Reader:** His reader is based in [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader) that receive a DataSource and executes a query to get a list of [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java), making left join with the table where registrationPoints are saved to repeat the [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java) with the date for each registrationDate. <br/>
**Custom Reader:** His custom reader implements a ItemStreamReader, read the returned list of [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java) from [JdbcCursorItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#jdbccursoritemreader) and agroup each duplicated [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java) in a another [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java) with all dates of registrationPoints.
**Processor:** His processor is based in [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor) that calls as classifier the custom processor [PointSheetClassifier](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/processor/PointSheetClassifier.java) <br/>
**Custom Processor:** His custom processor implements a Classifier to return to the [ClassifierCompositeItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemprocessor). It is responsible to verify if some [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java) doesn't have any pointRegistry. If it returns true, the InvalidPointSheetProcessor is called and a invalid [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java) is builded. Otherwise, PointSheetProcessor is called and the object is build correctly. <br/>
**Writer:** His writer is based in [ClassifierCompositeItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#classifiercompositeitemwriter) and calls a Classifier to choice whitch writer must be called according to the returned [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java), verifying if he is valid or invalid. If valid, calls the PointSheetComposite Writer. Otherwise, it calls the employeeWithoutPointSheetFile Writer. <br/>
**PointSheetComposite Writer:** His custom writer is responsible to persist in the configured DataSource each [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java) returned correctly at same time that builds a file with a custom format of [PointSheet](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/PointSheet.java). <br/>
**EmployeeWithoutPointSheetFile Writer:** His custom writer is responsible to build a file with the returned registrations of all invalid [Employee](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/src/main/java/com/springbatch/SpringBatchLearning/model/Employee.java).

  <br/>
</details>

<b><i>JOB_NAME:</i></b> pointSheetJob
<br>
<b><i>GENERATED_FILES:</i></b> pointSheet.txt and employeeWithoutPointSheet.txt
<br>
<b><i>SELECT_QUERY:</i></b> ```select * from app_batch.point_sheet;```

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

To see the changes of the application, you can use these following ways according with the job:

### Seeing results in the log

In the base directory of the project with application running in the docker, run:

```sh
docker-compose logs -f -t app
```

These are the jobs that print your results in the log:

- [HelloWorldJob](https://github.com/PedroLucasOM/SpringBatchLearning#helloworldjob)
- [EvenOrOddJob](https://github.com/PedroLucasOM/SpringBatchLearning#evenoroddjob)
- [MultipleFormatsFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#multipleformatsfilejob)
- [MultipleLineFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#multiplelinefilejob)
- [MultipleFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#multiplefilejob)
- [CursorDataSourceJob](https://github.com/PedroLucasOM/SpringBatchLearning#cursordatasourcejob)
- [PaginatorDataSourceJob](https://github.com/PedroLucasOM/SpringBatchLearning#paginatordatasourcejob)
- [ValidatingJob](https://github.com/PedroLucasOM/SpringBatchLearning#validatingjob)
- [BeanValidatingJob](https://github.com/PedroLucasOM/SpringBatchLearning#beanvalidatingjob)
- [CompositeJob](https://github.com/PedroLucasOM/SpringBatchLearning#compositejob)
- [ValidatingScriptJob](https://github.com/PedroLucasOM/SpringBatchLearning#validatingscriptjob)
- [ClassifierJob](https://github.com/PedroLucasOM/SpringBatchLearning#classifierjob)

### Seeing results in the file

In the base directory of the project, navigate to **/files/output**. There will are all generate files from jobs.

<b>OBS.:</b> <i>You can view the output filename in each implemented job description above.</i>

These are the jobs that build a file with your results:

- [FixedLengthJob](https://github.com/PedroLucasOM/SpringBatchLearning#fixedlengthjob)
- [DelimitedFileJob](https://github.com/PedroLucasOM/SpringBatchLearning#delimitedfilejob)
- [BudgetStatementJob](https://github.com/PedroLucasOM/SpringBatchLearning#budgetstatementjob)
- [BankAccountGenerateJob](https://github.com/PedroLucasOM/SpringBatchLearning#bankaccountgeneratejob)
- [PointSheetJob](https://github.com/PedroLucasOM/SpringBatchLearning#pointsheetjob)

### Seeing results in the database

In the base directory of the project with the application running in the docker, run:

```sh
docker-compose exec database_app mysql -u root -papp#1234 -e "select ..."
```

<b>OBS.:</b> <i>You can view the query in each implemented job description above and put it instead of <b>"select ..."</b>.</i>

These are the jobs that persist your results in the database:

- [BankAccountGenerateJob](https://github.com/PedroLucasOM/SpringBatchLearning#bankaccountgeneratejob)
- [PointSheetJob](https://github.com/PedroLucasOM/SpringBatchLearning#pointsheetjob)

# 3. Author

👤 **Pedro Lucas**

* Twitter: [@PedroLucasOM](https://twitter.com/PedroLucasOM)
* Github: [@PedroLucasOM](https://github.com/PedroLucasOM)
* LinkedIn: [@PedroLucasOM](https://linkedin.com/in/PedroLucasOM)

# 4. Contributing 🤝

Contributions, issues and feature requests are welcome!<br />Feel free to check [issues page](https://github.com/PedroLucasOM/SpringBatchLearning/issues).

# 5. Show your support

Give a :star: if this project helped you!

# 6. License 📝

Copyright © 2021 [Pedro Lucas](https://github.com/PedroLucasOM). <br />
