# sawdust

Project sawdust consists of several Java modules.

Three main modules meant to be reused.
One test module that checks the modular API of the former three.

## build

- Install [JDK](https://jdk.java.net) 16 or later
- Clone this repository
- Invoke `jshell https://bit.ly/bach-init`
- On Windows call `.bach\bin\bach build`, on Linux `.bach/bin/bach build`

## use

- Add `requires com.github.sormuras.sawdust[.api|.core]` to your `module-info.java` file
- Download modular JARs from [releases](https://github.com/sormuras/sawdust/releases) page
