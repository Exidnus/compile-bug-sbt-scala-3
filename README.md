During compiling this project (sbt compile) compiler can just hang forever. 
It's not 100%, so you can try to run compilation a few times. I'm not sure, but creating a load on the computer can help: 
try to open a lot of tabs in browser for example. 
You can use script in root of project or run other sbt, it doesn't matter.
If you compile only one module (sbt module-a), compilation will succeed. 
If you comment most of the lint flags in build.sbt and compile all project, compilation will succeed. 