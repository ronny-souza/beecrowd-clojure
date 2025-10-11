(def pi 3.14159)

(let [r (Double/parseDouble (read-line))
      area (* pi r r)]
  (println (format "A=%.4f" area)))