(let [weight-a 2
      weight-b 3
      weight-c 5
      a (Double/parseDouble (read-line))
      b (Double/parseDouble (read-line))
      c (Double/parseDouble (read-line))

      result (/ (+ (* a weight-a) (* b weight-b) (* c weight-c)) (+ weight-a weight-b weight-c))]

  (println (format "MEDIA = %.1f", result)))