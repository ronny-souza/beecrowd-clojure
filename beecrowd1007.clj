(let [a (Integer/parseInt (read-line))
      b (Integer/parseInt (read-line))
      c (Integer/parseInt (read-line))
      d (Integer/parseInt (read-line))

      diff (- (* a b) (* c d))]
  (println (format "DIFERENCA = %d" diff)))