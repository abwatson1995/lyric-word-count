<h1>Lyric Word Count</h1>

<p>This Java program uses a HashMap to count the occurences of each words that appears in Ariana Grande's song "Thank U, Next".</p>

<p>The program uses a HashMap of the form
  
  ```java
  HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
  ```
where ```String``` represents the word, and ```Integer``` represents the numeric value for each word.
</p>

<h2>Why Use a HashMap?</h2>
<p>The attraction of using the HashMap is that by using a String key and an Integer value, each String can be stored, and a tally of its occurence incremented by determining if a given key already exists, and simply incrementing its value.</p>

<p>With time cosnstraints removed, my approach to generating this program would have been quite different. Following along a more organized approach, I would have created a readWords() method to read from the file to improve readability. Next, I would create a wordCount method which would perform the "check" of each word against existing keys and increase the count for that key as necessary, again to improve readability and organization.</p>

![Original Image](https://github.com/abwatson1995/lyric-word-count/blob/master/Assignment%203/agimage.png?raw=true)

![Word Cloud of Thank U, Next, Created using the Kumo Library](https://github.com/abwatson1995/lyric-word-count/blob/master/Assignment%203/Aout.png?raw=true)

<h2>Some Information About the Chosen Song</h2>

<p>Ariana Grande's "Thank U, Next" was realeased on November 3, 2018 shortly after the end of the singer's engagement to comedian Pete Davidson and the death of her ex-boyfriend, rapper Mac Miller. The song is less of a diss track and more of a celebration of the lessons learned from experiencing life, love and loss.</p>

<p>Aside from being an Ariana Grande fan, I chose to analyze this song for two reasons:
  <ul>
    <li>The lyrics are repetitive, particularly in the hook </li>
    <li>I was interested in determining if the frequency of the song's three main words ("thank", "you", and "next") appeared in equal frequencies since they were the most frequently grouped words.</li>
  </ul>
</p>

<p>Interestingly, the song's title words do not appear with equal frequecy. In fact, the word "next" occured 42 times, with "you" and "next" appearing 38 and 37 times, respectfully.</p>

<p>Lyrics from LyricFind</p>
<p>Image created using the Kumo Library</p>
