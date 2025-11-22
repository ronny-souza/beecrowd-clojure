(let [value (Integer/parseInt (read-line))
      bills [100 50 20 10 5 2 1]]
  (println value)
  (loop [n value notes bills]
    (when (seq notes)
      (let [note (first notes)
            count (quot n note)
            remainder (rem n note)]
        (println (str count " nota(s) de R$ " note ",00"))
        (recur remainder (rest notes))))))