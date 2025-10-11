(let [weight-a 3.5
      weight-b 7.5
      a (Double/parseDouble (read-line))
      b (Double/parseDouble (read-line))
      result (/ (+ (* a weight-a) (* b weight-b)) (+ weight-a weight-b))]

  (println (format "MEDIA = %.5f" result)))