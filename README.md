# data-structures


mvn archetype:generate ^
          -DinteractiveMode=false ^
          -DarchetypeGroupId=org.openjdk.jmh ^
          -DarchetypeArtifactId=jmh-java-benchmark-archetype ^
          -DgroupId=com.arunapi ^
          -DartifactId=data-structures^
          -Dversion=0.0.1

cd data-structures
#Open explorer from command prompt
start .