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

> :computer: Project to learn about Spring Batch Framwork :leaves: with 17 jobs implementation

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
   

## Prerequisites

- docker

## Configuration

To run a specific job, you need to set a envionment variable called JOB_NAME with value of the job that you want execute.

#### Windows

In the Command Prompt, run:

``` sh
set JOB_NAME=jobName
```

#### Linux

In the terminal, run:

``` sh
export JOB_NAME=jobName
```

#### Mac

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
