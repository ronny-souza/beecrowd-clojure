(def PI 3.14159)

(let [r (Double/parseDouble (read-line))
      result (* (/ 4.0 3) PI (Math/pow r 3))]

  (println (format "VOLUME = %.3f" result)))