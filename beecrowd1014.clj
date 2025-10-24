(let [x (Integer/parseInt (read-line))
      y (Double/parseDouble (read-line))
      result (/ x y)]
  (println (format "%.3f km/l" result)))