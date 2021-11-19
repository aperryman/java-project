rm -rf */*/*.class

# find all java files and output the names to sources.txt
find ./ -name "*.java" > sources.txt

# compile all!
javac @sources.txt

rm -f sources.txt