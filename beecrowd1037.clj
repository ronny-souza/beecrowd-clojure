(let [value (Double/parseDouble (read-line))]
  (cond
    (and (>= value 0) (<= value 25)) (println "Intervalo [0,25]")
    (and (> value 25) (<= value 50)) (println "Intervalo (25,50]")
    (and (> value 50) (<= value 75)) (println "Intervalo (50,75")
    (and (> value 75) (<= value 100)) (println "Intervalo (75,100]")
    :else (println "Fora de intervalo")))