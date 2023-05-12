object sample{
	def main(args: Array[String]) {
                var linesRDD = sc.textFile("input.txt") // read input file
                 var wordsRDD = linesRDD.flatMap(_.split(" ")) split the words
                 var wordsKvRdd = wordsRDD.map((_,1)) // map the words with the frequency
                var wordCounts = wordsKvRdd.reduceByKey(_+_) // calculate frequency of the word
                wordCounts.saveAsTextFile("out2") // write output to external file
                wordCounts.foreach(println) // print the word count line by line from external file
        }
}

Then,

Open spark shell in terminal

Command to load scala program:   :load directory/program_name.scala

Command to execute scala program:   program_name.main(Array())

