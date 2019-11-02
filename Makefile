all:
	@javac *.java

clean:
	@rm -Rf *.class

re: all clean
