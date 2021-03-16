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

> :computer: Project to learn about Spring Batch Framwork :leaves: with 17 jobs implementation.

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

- **Job Repository** <br/>
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

### HelloWorldJob

**Objective:** This Job is responsible to write in the screen "Hello, World!".

It is a basic Job that is configured to calls a Tasklet Step that execute this action.

<b><i>JOB_NAME:</i></b> helloWorld

### EvenOrOddJob

**Objective:** This Job is responsible to print in the screen which specified numbers are even or odd.

It is configured to calls a Chunk Step that receive a Integer and returns a String. Is configured to process 10 records per transaction.

**Reader:** His reader is based in [ItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#itemreader) and returns a fixed list of numbers with values of 0 till 10. <br/>
**Processor:** His processor is based in [ItemProcessor](https://github.com/PedroLucasOM/SpringBatchLearning#itemprocessor) and receive each number, verify if is even or odd and parse it to text with the following format: 'Item number é par' or 'Item number é impar'. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the processor.

<b><i>JOB_NAME:</i></b> evenOrOdd

### FixedLengthJob

**Objective:** This Job is responsible to read a flat file with a [Client]() list in the fixed length format and write another file with the same records and format.

It is configured to calls a Chunk Step that receive a [Client]() and returns a [Client]() too. Is configured to process 1 record per transaction.

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the fixed length file [clients-fixed.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-fixed.txt) defining the columns name, nickname, age, email and salaryRange with int ranges, making unmarshiling to [Client]() and returning to the Step. <br/>
**Writer:** His writer is based in [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) and writes a flat file in following path /files/output/fixedLength.txt with the same columns, records and format. <br/>

<b><i>JOB_NAME:</i></b> fixedLengthJob

### DelimitedFileJob

**Objective:** This Job is responsible to read a flat file with a [Client]() list in the delimited format and write another file with the same records and format.

It is configured to calls a Chunk Step that receive a [Client]() and returns a [Client]() too. Is configured to process 1 record per transaction.

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the fixed length file [clients-delimited.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-delimited.txt) defining the reading columns name, nickname, age, email and salaryRange with the ',' like delimiter, making unmarshiling to [Client]() and returning to the Step. <br/>
**Writer:** His writer is based in [FlatFileItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemwriter) and writes a flat file in following path /files/output/delimitedFile.txt with the same columns, records and format, but using the ';' like delimiter. <br/>

<b><i>JOB_NAME:</i></b> delimitedFileJob

### MultipleFormatsFileJob

**Objective:** This Job is responsible to read a flat file with a list of multiple records type in the delimited format and print in the screen each record in your respective Java Object, calling the toString method.

It is configured to calls a Chunk Step that receive a general Java Object, pass it to the lineMapper that will pass each record to your specific type and returns the result. Is configured to process 1 record per transaction.

**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the delimited file with multiple formats [clients-multiple-file1.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file1.txt), calling the lineMapper to do it. <br/>
**LineMapper:** The LineMapper called inside of Reader reads the lines and defines the type of each record according with your start column number. If it is 0, so it will be unmarshal to Client. In case of the 1, it will be unmarshal to Transcation. For both cases, the column properties are configured in their fieldSetMappers. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

<b><i>JOB_NAME:</i></b> multipleFormatsFileJob

### MultipleLineFileJob

**Objective:** This Job is responsible to read a flat file with a list of multiple records type in the delimited format, agroup transactions that are bellow each client and add them in a [Transaction]() list insided in a [Client]() Java Object and print in the screen all clients with your respective transactions.

It is configured to calls a Chunk Step that receive a general Java Object, pass it to a custom Reader that make this business rule of put each bellow [Transaction]() in a list of [Transaction]() insided in a [Client](). This custom Reader receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) that calls a lineMapper that will pass each record to your specific type and returns the result. Is configured to process 1 record per transaction.

**Custom Reader:** Is a reader that implements a ItemStreamReader and a ResourceAwareItemReaderItemStream, receive a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) to call the read method and execute the business rule.
**Reader:** His reader is based in [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads the delimited file with multiple formats [clients-multiple-file1.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file1.txt), calling the lineMapper to do it. <br/>
**LineMapper:** The LineMapper called inside of Reader reads the lines and defines the type of each record according with your start column number. If it is 0, so it will be unmarshal to Client. In case of the 1, it will be unmarshal to Transcation. For both cases, the column properties are configured in their fieldSetMappers. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

<b><i>JOB_NAME:</i></b> multipleLineFileJob

### MultipleFileJob


**Objective:** This Job is responsible to read one or multiple flat files with a list of multiple records type in the delimited format and print in the screen each record in your respective Java Object, calling the toString method.

It is configured to calls a Chunk Step that receive a Reader configured with a general Java Object, pass it to the lineMapper that will pass each record to your specific type and returns the result. Is configured to process 1 record per transaction.

**Reader:** His reader is based in [MultiResourceItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#multiresourceitemreader) that receive one or multiple flat files and delegates the reader to a [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) and reads delimited files with multiple formats, in this case: [clients-multiple-file1.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file1.txt), [clients-multiple-file2.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file2.txt), [clients-multiple-file3.txt](https://github.com/PedroLucasOM/SpringBatchLearning/blob/master/files/input/clients-multiple-file3.txt). After it, calls the lineMapper and make this business rule. <br/>
**LineMapper:** The LineMapper called inside of [FlatFileItemReader](https://github.com/PedroLucasOM/SpringBatchLearning#flatfileitemreader) reads the lines and defines the type of each record according with your start column number. If it is 0, so it will be unmarshal to Client. In case of the 1, it will be unmarshal to Transcation. For both cases, the column properties are configured in their fieldSetMappers. <br/>
**Writer:** His writer is based in [ItemWriter](https://github.com/PedroLucasOM/SpringBatchLearning#itemwriter) and print in the screen the returned results of the Reader that was delegated to LineMapper. <br/>

<b><i>JOB_NAME:</i></b> multipleFileJob

### CursorDataSourceJob
### PaginatorDataSourceJob
### BudgetStatementJob
### ValidatingJob
### BeanValidatingJob
### CompositeJob
### ValidatingScriptJob
### ClassifierJob
### BankAccountGenerateJob
### PointSheetJob

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
