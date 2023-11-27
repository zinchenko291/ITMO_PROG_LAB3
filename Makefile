all:
	rm -rf target
	javac -d target -sourcepath src src/Main.java src/**/*
	cd target; jar cfm app.jar ../MANIFEST.mf *.class ./**/*.class
	mv target/app.jar ./
	rm -rf target
