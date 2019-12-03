# lyric-word-count
Brooklyn College - Fall 2019 - Assignment 3 for CISC 3130

<h1>Lyric Word Count</h1>

<p>This JAVA program uses a HashMap to count the occurences of each words that appears in Ariana Grande's song <quote>Thank U, Next</quote>.</p>

<p>The program uses a HashMap of the form
  
  ```java
  HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
  ```
where ```String</i>``` represents the word, and ```Integer``` represents the numeric value for each word.
</p>

<p>The attraction of using the HashMap is that by using a ```String``` key and an ```Integer``` value, each String can be stored, and a tally of its occurence incremented by determining if a given key already exists, and simply incrementing its value.</p>

<!-- I didn't do the visualization part, that info goes here where I get around to it--!>

<!-- think about some things youd change - think in terms of effenciency, methods youd use instead of cramming everything into one long program --!>

<h2>Some Information About the Chosen Song</h2>

<p>Ariana Grande's <quote>Thank U, Next</quote> was realeased on November 3, 2018 shortly after the end of the singer's engagement to comedian Pete Davidson and the death of her ex-boyfriend, Mac Miller. The song is less of a diss track and more of a celebration of the lessons learned from experiencing life, love and loss.</p>

<p>Aside from being an Ariana Grande fan, I chose to analyze this song for two reasons:
  - The lyrics are repetitive, particularly in the hook
  - I was interested in determining if the frequency of the song's three main words ("thank", "you", and "next") appeared in equal frequencies since they were the most frequently grouped words.
</p>
